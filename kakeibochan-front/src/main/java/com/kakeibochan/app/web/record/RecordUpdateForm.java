package com.kakeibochan.app.web.record;

import java.time.LocalDate;

import org.lastaflute.web.validation.Required;

import com.kakeibochan.dbflute.allcommon.CDef.CategoryType;

public class RecordUpdateForm {

    @Required
    public Long id;

    @Required
    public LocalDate date;

    @Required
    public CategoryType categoryType;

    @Required
    public Long accountItemId;

    public Long depositAccountId;

    public Long withdrawalAcountId;

    @Required
    public Integer amount;

    public String memo;

    @Required
    public Long versionNo;

}
