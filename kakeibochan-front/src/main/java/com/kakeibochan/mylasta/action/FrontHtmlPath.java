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

import org.lastaflute.web.response.next.HtmlNext;

/**
 * The path definition of HTML.
 * @author FreeGen
 */
public interface FrontHtmlPath {

    /** The path of the HTML: /common_default/layout.html */
    HtmlNext path_CommonDefault_LayoutHtml = new HtmlNext("/common_default/layout.html");

    /** The path of the HTML: /error/show_errors.html */
    HtmlNext path_Error_ShowErrorsHtml = new HtmlNext("/error/show_errors.html");

    /** The path of the HTML: /login/login.html */
    HtmlNext path_Login_LoginHtml = new HtmlNext("/login/login.html");

    /** The path of the HTML: /mypage/mypage.html */
    HtmlNext path_Mypage_MypageHtml = new HtmlNext("/mypage/mypage.html");

    /** The path of the HTML: /prpr/prpr.html */
    HtmlNext path_Prpr_PrprHtml = new HtmlNext("/prpr/prpr.html");

    /** The path of the HTML: /record/complete.html */
    HtmlNext path_Record_CompleteHtml = new HtmlNext("/record/complete.html");

    /** The path of the HTML: /record/confirm.html */
    HtmlNext path_Record_ConfirmHtml = new HtmlNext("/record/confirm.html");

    /** The path of the HTML: /record/list.html */
    HtmlNext path_Record_ListHtml = new HtmlNext("/record/list.html");

    /** The path of the HTML: /record/register.html */
    HtmlNext path_Record_RegisterHtml = new HtmlNext("/record/register.html");

    /** The path of the HTML: /register/complete.html */
    HtmlNext path_Register_CompleteHtml = new HtmlNext("/register/complete.html");

    /** The path of the HTML: /register/confirm.html */
    HtmlNext path_Register_ConfirmHtml = new HtmlNext("/register/confirm.html");

    /** The path of the HTML: /register/register.html */
    HtmlNext path_Register_RegisterHtml = new HtmlNext("/register/register.html");

    /** The path of the HTML: /signin/signin.html */
    HtmlNext path_Signin_SigninHtml = new HtmlNext("/signin/signin.html");

    /** The path of the HTML: /signin/signin_reminder.html */
    HtmlNext path_Signin_SigninReminderHtml = new HtmlNext("/signin/signin_reminder.html");

    /** The path of the HTML: /top/top.html */
    HtmlNext path_Top_TopHtml = new HtmlNext("/top/top.html");
}
