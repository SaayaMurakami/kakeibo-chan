package com.kakeibochan.app.web.record;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.dbflute.cbean.result.ListResultBean;
import org.lastaflute.web.Execute;
import org.lastaflute.web.response.HtmlResponse;

import com.kakeibochan.app.web.base.FrontBaseAction;
import com.kakeibochan.dbflute.exbhv.AccountItemBhv;
import com.kakeibochan.dbflute.exbhv.AssetBhv;
import com.kakeibochan.dbflute.exbhv.RecordBhv;
import com.kakeibochan.dbflute.exentity.Record;
import com.kakeibochan.mylasta.action.FrontUserBean;

public class RecordListAction extends FrontBaseAction {

    @Resource
    private RecordBhv recordBhv;
    @Resource
    private AccountItemBhv accountItemBhv;
    @Resource
    private AssetBhv assetBhv;

    @Execute
    public HtmlResponse index() {
        FrontUserBean userBean = getUserBean().get();
        Long userId = userBean.getUserId();

        ListResultBean<Record> records = recordBhv.selectList(cb -> {
            cb.setupSelect_AccountItem();
            cb.setupSelect_AssetByDepositAccountId();
            cb.setupSelect_AssetByWithdrawalAccountId();

            cb.query().setMemberId_Equal(userId);
        });

        ArrayList<RecordBean> recordBeans = new ArrayList<>();

        for (Record record : records) {
            RecordBean recordBean = new RecordBean();
            recordBean.date = record.getDate();
            recordBean.categoryType = record.getAccountItem().get().getCategoryTypeAlias();
            recordBean.accountTitle = record.getAccountItem().get().getAccountTitle();
            recordBean.depositAccount = record.getAssetByDepositAccountId().map(asset -> asset.getAssetName()).orElse(null);
            recordBean.withdrawalAccount = record.getAssetByWithdrawalAccountId().map(asset -> asset.getAssetName()).orElse(null);
            recordBean.amount = record.getAmount();
            recordBean.memo = record.getMemo();
            recordBeans.add(recordBean);
        }

        return asHtml(path_Record_ListHtml).renderWith(data -> {
            data.register("recordBeans", recordBeans);
        });
    }

}
