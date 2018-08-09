package com.kakeibochan.app.web.record;

import java.time.LocalDate;
import java.util.ArrayList;

import javax.validation.Valid;

import org.lastaflute.web.validation.Required;

import com.kakeibochan.dbflute.allcommon.CDef.CategoryType;

public class RecordDetailBean {

    @Required
    public Long id;

    @Required
    public CategoryType categoryType;

    @Required
    public LocalDate date;

    @Required
    public Long accountItemId;

    public Long depositAccountId;

    public Long withdrawalAccountId;

    @Required
    public Integer amount;

    public String memo;

    @Valid
    public ArrayList<AccountItemBean> accountItemBeans;

    @Valid
    public ArrayList<AssetBean> assetBeans;

}
