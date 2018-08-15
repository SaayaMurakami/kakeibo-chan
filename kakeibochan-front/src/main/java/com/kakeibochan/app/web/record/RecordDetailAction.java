package com.kakeibochan.app.web.record;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.dbflute.cbean.result.ListResultBean;
import org.lastaflute.web.Execute;
import org.lastaflute.web.response.JsonResponse;

import com.kakeibochan.app.web.base.FrontBaseAction;
import com.kakeibochan.dbflute.exbhv.AccountItemBhv;
import com.kakeibochan.dbflute.exbhv.AssetBhv;
import com.kakeibochan.dbflute.exbhv.RecordBhv;
import com.kakeibochan.dbflute.exentity.AccountItem;
import com.kakeibochan.dbflute.exentity.Asset;
import com.kakeibochan.dbflute.exentity.Record;

public class RecordDetailAction extends FrontBaseAction {
    @Resource
    private RecordBhv recordBhv;
    @Resource
    private AccountItemBhv accountItemBhv;
    @Resource
    private AssetBhv assetBhv;

    @Execute
    public JsonResponse<RecordDetailBean> index(Long recordId) {

        Record record = recordBhv.selectEntityWithDeletedCheck(cb -> {
            cb.setupSelect_AccountItem();
            cb.query().setRecordId_Equal(recordId);
            cb.setupSelect_AssetByWithdrawalAccountId();
        });

        ListResultBean<AccountItem> accountItemList = accountItemBhv.selectList(cb -> {
            cb.query().setMemberId_Equal(getUserBean().get().getUserId());
            cb.query().addOrderBy_AccountItemId_Asc();
        });

        ArrayList<AccountItemBean> accountItemBeans = new ArrayList<>();
        for (AccountItem accountItem : accountItemList) {
            AccountItemBean accountItemBean = new AccountItemBean();
            accountItemBean.id = accountItem.getAccountItemId();
            accountItemBean.title = accountItem.getAccountTitle();
            accountItemBeans.add(accountItemBean);
        }

        ListResultBean<Asset> assetList = assetBhv.selectList(cb -> {
            cb.query().setMemberId_Equal(getUserBean().get().getMemberId());
            cb.query().addOrderBy_AssetId_Asc();
        });

        ArrayList<AssetBean> assetBeans = new ArrayList<>();
        for (Asset asset : assetList) {
            AssetBean assetBean = new AssetBean();
            assetBean.id = asset.getAssetId();
            assetBean.name = asset.getAssetName();
            assetBeans.add(assetBean);
        }

        RecordDetailBean bean = new RecordDetailBean();
        bean.id = record.getRecordId();
        bean.categoryType = record.getAccountItem().get().getCategoryTypeAsCategoryType();
        bean.date = record.getDate();
        bean.accountItemId = record.getAccountItemId();
        bean.depositAccountId = record.getDepositAccountId();
        bean.withdrawalAccountId = record.getWithdrawalAccountId();
        bean.amount = record.getAmount();
        bean.memo = record.getMemo();
        bean.accountItemBeans = accountItemBeans;
        bean.assetBeans = assetBeans;
        bean.versionNo = record.getVersionNo();

        return asJson(bean);
    }

}
