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
    public HtmlResponse goBackIndex(RegisterConfirmForm form) {
        validate(form, message -> {}, () -> {
            return asHtml(path_Register_RegisterHtml);
        });
        return asHtml(path_Register_RegisterHtml);
    }

    @Execute
    public HtmlResponse confirm(RegisterConfirmForm form) {
        validate(form, message -> {}, () -> {
            return asHtml(path_Register_RegisterHtml);
        });

        saveToken();
        return asHtml(path_Register_ConfirmHtml);
    }

    @Execute
    public HtmlResponse doComplete(RegisterConfirmForm form) {
        validate(form, message -> {}, () -> {
            return asHtml(path_Register_RegisterHtml);
        });

        verifyToken(() -> {
            return asHtml(path_Register_RegisterHtml);
        });

        //TODO ユーザー登録処理を行う

        return redirectWith(RegisterAction.class, moreUrl("complete"));
    }

    @Execute
    public HtmlResponse complete() {
        return asHtml(path_Register_CompleteHtml);
    }

}
