package com.kakeibochan.app.web.record;

import org.lastaflute.web.validation.Required;

public class AccountItemBean {

    @Required
    public String title;

    @Required
    public Long id;

}
