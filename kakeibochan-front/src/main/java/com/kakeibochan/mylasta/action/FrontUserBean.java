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
package com.kakeibochan.mylasta.action;

import com.kakeibochan.dbflute.exentity.Member;

/**
 * @author jflute
 */
public class FrontUserBean extends KakeibochanUserBean { // #change_it also LoginAssist

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final Long memberId;
    protected final String name;
    protected final String mailAddress;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public FrontUserBean(Member member) {
        memberId = member.getMemberId();
        name = member.getName();
        mailAddress = member.getMailAddress();
    }

    // ===================================================================================
    //                                                                      Implementation
    //                                                                      ==============
    @Override
    public Long getUserId() {
        return getMemberId();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public Long getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }

    public String getMailAddress() {
        return mailAddress;
    }
}
