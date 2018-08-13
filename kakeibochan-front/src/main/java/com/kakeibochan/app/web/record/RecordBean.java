package com.kakeibochan.app.web.record;

import java.time.LocalDate;

import org.lastaflute.web.validation.Required;

import com.kakeibochan.dbflute.allcommon.CDef.CategoryType;

public class RecordBean {

    @Required
    public Long id;

    @Required
    public LocalDate date;

    @Required
    public CategoryType categoryType;

    @Required
    public String categoryTypeAlias;

    @Required
    public String accountTitle;

    public String depositAccount;

    public String withdrawalAccount;

    @Required
    public Integer amount;

    public String memo;

}
