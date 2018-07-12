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

import org.lastaflute.web.login.PrimaryLoginManager;
import org.lastaflute.web.login.TypicalLoginAssist;

import com.kakeibochan.mylasta.action.KakeibochanUserBean;

/**
 * @param <USER_BEAN> The type of user bean.
 * @param <USER_ENTITY> The type of user entity or model.
 * @author jflute
 */
public abstract class KakeibochanLoginAssist<USER_BEAN extends KakeibochanUserBean, USER_ENTITY> // project common
        extends TypicalLoginAssist<Long, USER_BEAN, USER_ENTITY> implements PrimaryLoginManager { // interface for framework control

    @Override
    protected Long toTypedUserId(String userKey) {
        return Long.valueOf(userKey);
    }
}
