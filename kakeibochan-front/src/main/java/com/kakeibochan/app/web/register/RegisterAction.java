package com.kakeibochan.app.web.register;

import org.lastaflute.web.Execute;
import org.lastaflute.web.login.AllowAnyoneAccess;
import org.lastaflute.web.response.HtmlResponse;

import com.kakeibochan.app.web.base.FrontBaseAction;

@AllowAnyoneAccess
public class RegisterAction extends FrontBaseAction {
    @Execute
    public HtmlResponse index() {
        return asHtml(path_Register_RegisterHtml);
    }

    @Execute
    public HtmlResponse confirm(RegisterConfirmForm form) {
        validate(form, message -> {}, () -> {
            return asHtml(path_Register_RegisterHtml);
        });

        return asHtml(path_Register_ConfirmHtml);
    }

}
