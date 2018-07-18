package com.kakeibochan.app.web.top;

import org.lastaflute.web.Execute;
import org.lastaflute.web.response.HtmlResponse;

import com.kakeibochan.app.web.base.FrontBaseAction;

public class TopAction extends FrontBaseAction {

    @Execute
    public HtmlResponse index() {
        return asHtml(path_Top_TopHtml);
    }

}
