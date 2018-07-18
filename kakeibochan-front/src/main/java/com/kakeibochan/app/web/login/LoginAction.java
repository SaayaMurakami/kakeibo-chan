package com.kakeibochan.app.web.login;

import javax.annotation.Resource;

import org.lastaflute.core.security.PrimaryCipher;
import org.lastaflute.web.Execute;
import org.lastaflute.web.login.AllowAnyoneAccess;
import org.lastaflute.web.login.credential.UserPasswordCredential;
import org.lastaflute.web.response.HtmlResponse;

import com.kakeibochan.app.web.base.FrontBaseAction;
import com.kakeibochan.app.web.base.login.FrontLoginAssist;
import com.kakeibochan.app.web.top.TopAction;

@AllowAnyoneAccess
public class LoginAction extends FrontBaseAction {

    @Resource
    private PrimaryCipher primaryCipher;

    @Resource
    private FrontLoginAssist loginAssist;

    @Execute
    public HtmlResponse index() {
        return asHtml(path_Login_LoginHtml);
    }

    @Execute
    public HtmlResponse doLogin(LoginForm form) {
        validate(form, messages -> {}, () -> {
            return asHtml(path_Login_LoginHtml);
        });

        UserPasswordCredential credential = new UserPasswordCredential(form.mailAddress, form.password);
        loginAssist.login(credential, op -> {});

        return redirect(TopAction.class);

    }

}
