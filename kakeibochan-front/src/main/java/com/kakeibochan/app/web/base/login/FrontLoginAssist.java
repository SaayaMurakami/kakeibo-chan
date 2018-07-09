/*
 * Copyright 2015-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package com.kakeibochan.app.web.base.login;

import javax.annotation.Resource;

import org.dbflute.optional.OptionalEntity;
import org.dbflute.optional.OptionalThing;
import com.kakeibochan.app.web.signin.SigninAction;
import com.kakeibochan.dbflute.cbean.MemberCB;
import com.kakeibochan.dbflute.exbhv.MemberBhv;
import com.kakeibochan.dbflute.exbhv.MemberLoginBhv;
import com.kakeibochan.dbflute.exentity.Member;
import com.kakeibochan.dbflute.exentity.MemberLogin;
import com.kakeibochan.mylasta.action.FrontUserBean;
import com.kakeibochan.mylasta.direction.FrontConfig;
import org.lastaflute.core.magic.async.AsyncManager;
import org.lastaflute.core.time.TimeManager;
import org.lastaflute.db.jta.stage.TransactionStage;
import org.lastaflute.web.login.PrimaryLoginManager;
import org.lastaflute.web.login.credential.UserPasswordCredential;
import org.lastaflute.web.login.option.LoginSpecifiedOption;

/**
 * @author jflute
 */
public class FrontLoginAssist extends KakeibochanLoginAssist<FrontUserBean, Member> // #change_it also UserBean
        implements PrimaryLoginManager { // #app_customize

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    @Resource
    private TimeManager timeManager;
    @Resource
    private AsyncManager asyncManager;
    @Resource
    private TransactionStage transactionStage;
    @Resource
    private FrontConfig config;
    @Resource
    private MemberBhv memberBhv;
    @Resource
    private MemberLoginBhv memberLoginBhv;

    // ===================================================================================
    //                                                                           Find User
    //                                                                           =========
    @Override
    protected void checkCredential(CredentialChecker checker) {
        checker.check(UserPasswordCredential.class, credential -> {
            return memberBhv.selectCount(cb -> arrangeLoginByCredential(cb, credential)) > 0;
        });
    }

    @Override
    protected void resolveCredential(CredentialResolver resolver) {
        resolver.resolve(UserPasswordCredential.class, credential -> {
            return memberBhv.selectEntity(cb -> arrangeLoginByCredential(cb, credential));
        });
    }

    private void arrangeLoginByCredential(MemberCB cb, UserPasswordCredential credential) {
        cb.query().arrangeLogin(credential.getUser(), encryptPassword(credential.getPassword()));
    }

    @Override
    protected OptionalEntity<Member> doFindLoginUser(Integer userId) {
        return memberBhv.selectEntity(cb -> {
            cb.query().arrangeLoginByIdentity(userId);
        });
    }

    // ===================================================================================
    //                                                                       Login Process
    //                                                                       =============
    @Override
    protected FrontUserBean createUserBean(Member userEntity) {
        return new FrontUserBean(userEntity);
    }

    @Override
    protected OptionalThing<String> getCookieRememberMeKey() {
        return OptionalThing.of(config.getCookieRememberMeFrontKey());
    }

    @Override
    protected void saveLoginHistory(Member member, FrontUserBean userBean, LoginSpecifiedOption option) {
        asyncManager.async(() -> {
            transactionStage.requiresNew(tx -> {
                insertLogin(member);
            });
        });
    }

    protected void insertLogin(Member member) {
        MemberLogin login = new MemberLogin();
        login.setMemberId(member.getMemberId());
        login.setLoginMemberStatusCodeAsMemberStatus(member.getMemberStatusCodeAsMemberStatus());
        login.setLoginDatetime(timeManager.currentDateTime());
        login.setMobileLoginFlg_False(); // mobile unsupported for now
        memberLoginBhv.insert(login);
    }

    // ===================================================================================
    //                                                                      Login Resource
    //                                                                      ==============
    @Override
    protected Class<FrontUserBean> getUserBeanType() {
        return FrontUserBean.class;
    }

    @Override
    protected Class<?> getLoginActionType() {
        return SigninAction.class;
    }
}
