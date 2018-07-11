package com.kakeibochan.app.web.prpr;

import org.lastaflute.web.Execute;
import org.lastaflute.web.login.AllowAnyoneAccess;
import org.lastaflute.web.response.HtmlResponse;

import com.kakeibochan.app.web.base.FrontBaseAction;

@AllowAnyoneAccess
public class PrprAction extends FrontBaseAction {

    @Execute
    public HtmlResponse index() {
        return asHtml(path_Prpr_PrprHtml).renderWith(data -> {
            data.register("saaya", "むらかみ");
            data.register("miyasama", "かとう");
        });
    }
}
