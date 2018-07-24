package com.kakeibochan.app.web.record;

import java.time.LocalDate;

import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.Length;
import org.lastaflute.web.validation.Required;

public class RecordForm {

    //TODO あとでやる    
    //    @Required
    //    public CategoryType categoryType;

    @Required
    public LocalDate date;

    @Required
    public Long accountItemId;

    @Required
    @Min(0)
    public Integer amount;

    @Required
    public Long assetId;

    @Length(max = 200)
    public String memo;
}
