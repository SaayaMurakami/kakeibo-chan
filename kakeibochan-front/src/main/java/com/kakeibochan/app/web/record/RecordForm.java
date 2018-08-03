package com.kakeibochan.app.web.record;

import java.time.LocalDate;

import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.Length;
import org.lastaflute.web.validation.Required;

import com.kakeibochan.dbflute.allcommon.CDef.CategoryType;

public class RecordForm {

    @Required
    public CategoryType categoryType;

    @Required
    public LocalDate date;

    @Required
    public Long accountItemId;

    @Required
    @Min(0)
    public Integer amount;

    public Long depositAccountId;

    public Long withdrawalAccountId;

    @Length(max = 200)
    public String memo;
}
