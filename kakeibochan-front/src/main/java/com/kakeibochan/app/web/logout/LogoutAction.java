package com.kakeibochan.app.web.logout;

import javax.annotation.Resource;

import org.lastaflute.web.Execute;
import org.lastaflute.web.response.HtmlResponse;

import com.kakeibochan.app.web.base.FrontBaseAction;
import com.kakeibochan.app.web.base.login.FrontLoginAssist;
import com.kakeibochan.app.web.login.LoginAction;

public class LogoutAction extends FrontBaseAction {

    @Resource
    private FrontLoginAssist loginAssist;

    @Execute
    public HtmlResponse index() {
        loginAssist.logout();
        return redirect(LoginAction.class);
    }

}
