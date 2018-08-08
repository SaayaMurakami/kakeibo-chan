package com.kakeibochan.app.web.record;

import java.time.LocalDate;
import java.util.ArrayList;

import org.lastaflute.web.validation.Required;

public class RecordDetailBean {

    @Required
    public Long id;

    @Required
    public LocalDate date;

    @Required
    public Long accountItemId;

    public Long depositAccountId;

    public Long withdrawalAccountId;

    @Required
    public Integer amount;

    public String memo;

    public ArrayList<AccountItemBean> accountItemBeans;

    public ArrayList<AssetBean> assetBeans;

}
