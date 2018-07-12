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
package com.kakeibochan.app.web.base.view;

import com.kakeibochan.mylasta.action.FrontUserBean;

/**
 * @author jflute
 */
public class HeaderBean {

    private static final HeaderBean EMPTY_INSTANCE = new HeaderBean();

    public final Long memberId;
    public final String memberName;
    public final boolean isLogin;

    private HeaderBean() {
        this.memberId = null;
        this.memberName = null;
        this.isLogin = false;
    }

    public HeaderBean(FrontUserBean userBean) {
        this.memberId = userBean.getMemberId();
        this.memberName = userBean.getName();
        this.isLogin = true;
    }

    public static HeaderBean empty() {
        return EMPTY_INSTANCE;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append(memberId);
        sb.append(",");
        sb.append(memberName);
        if (isLogin) {
            sb.append(", login");
        }
        sb.append("}");
        return sb.toString();
    }
}
