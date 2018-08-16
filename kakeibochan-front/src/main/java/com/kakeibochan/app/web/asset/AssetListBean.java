package com.kakeibochan.app.web.asset;

import org.lastaflute.web.validation.Required;

public class AssetListBean {

    @Required
    public String name;

    @Required
    public Integer balance;

}
