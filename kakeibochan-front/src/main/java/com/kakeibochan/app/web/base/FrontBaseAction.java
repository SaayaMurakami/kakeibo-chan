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
package com.kakeibochan.app.web.base;

import javax.annotation.Resource;

import org.dbflute.optional.OptionalThing;
import org.lastaflute.web.login.LoginManager;
import org.lastaflute.web.ruts.process.ActionRuntime;
import org.lastaflute.web.validation.ActionValidator;
import org.lastaflute.web.validation.LaValidatable;

import com.kakeibochan.app.web.base.login.FrontLoginAssist;
import com.kakeibochan.app.web.base.view.HeaderBean;
import com.kakeibochan.mylasta.action.FrontHtmlPath;
import com.kakeibochan.mylasta.action.FrontMessages;
import com.kakeibochan.mylasta.action.FrontUserBean;
import com.kakeibochan.mylasta.direction.FrontConfig;

/**
 * @author jflute
 */
public abstract class FrontBaseAction extends KakeibochanBaseAction // has several interfaces for direct use
        implements LaValidatable<FrontMessages>, FrontHtmlPath {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The application type for DoCKside, e.g. used by access context. */
    protected static final String APP_TYPE = "DCK"; // #change_it_first

    /** The user type for Member, e.g. used by access context. */
    protected static final String USER_TYPE = "M"; // #change_it_first (can delete if no login)

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    @Resource
    private FrontConfig config;
    @Resource
    private FrontLoginAssist loginAssist;

    // ===================================================================================
    //                                                                               Hook
    //                                                                              ======
    // #app_customize you can customize the action hook
    @Override
    public void hookFinally(ActionRuntime runtime) {
        if (runtime.isForwardToHtml()) { // #delete_ifapi
            runtime.registerData("headerBean", getUserBean().map(userBean -> {
                return new HeaderBean(userBean);
            }).orElse(HeaderBean.empty()));
        }
        super.hookFinally(runtime);
    }

    // ===================================================================================
    //                                                                           User Info
    //                                                                           =========
    // -----------------------------------------------------
    //                                      Application Info
    //                                      ----------------
    @Override
    protected String myAppType() { // for framework
        return APP_TYPE;
    }

    // -----------------------------------------------------
    //                                            Login Info
    //                                            ----------
    // #app_customize return empty if login is unused
    @Override
    protected OptionalThing<FrontUserBean> getUserBean() { // application may call, overriding for co-variant
        return loginAssist.getSavedUserBean();
    }

    @Override
    protected OptionalThing<String> myUserType() { // for framework
        return OptionalThing.of(USER_TYPE);
    }

    @Override
    protected OptionalThing<LoginManager> myLoginManager() { // for framework
        return OptionalThing.of(loginAssist);
    }

    // ===================================================================================
    //                                                                          Validation
    //                                                                          ==========
    @SuppressWarnings("unchecked")
    @Override
    public ActionValidator<FrontMessages> createValidator() { // for co-variant
        return super.createValidator();
    }

    @Override
    public FrontMessages createMessages() { // application may call
        return new FrontMessages(); // overriding to change return type to concrete-class
    }

    // ===================================================================================
    //                                                                            Document
    //                                                                            ========
    // #app_customize you should override javadoc when you add new methods for sub class at super class.
    ///**
    // * {@inheritDoc} <br>
    // * Application Native Methods:
    // * <pre>
    // * <span style="font-size: 130%; color: #553000">[xxx]</span>
    // * o xxx() <span style="color: #3F7E5E">// xxx</span>
    // * </pre>
    // */
    //@Override
    //public void document1_CallableSuperMethod() {
    //    super.document1_CallableSuperMethod();
    //}
}
