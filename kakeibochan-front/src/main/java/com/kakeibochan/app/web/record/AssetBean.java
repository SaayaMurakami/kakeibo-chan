package com.kakeibochan.app.web.record;

import org.lastaflute.web.validation.Required;

public class AssetBean {

    @Required
    public String name;

    @Required
    public Long id;
}
