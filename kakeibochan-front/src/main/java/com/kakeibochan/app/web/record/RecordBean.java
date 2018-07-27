package com.kakeibochan.app.web.record;

import java.time.LocalDate;

import org.lastaflute.web.validation.Required;

public class RecordBean {

    @Required
    public LocalDate date;

    @Required
    public String categoryType;

    @Required
    public String accountTitle;

    public String depositAccount;

    public String withdrawalAccount;

    @Required
    public Integer amount;

    public String memo;

}
