package com.kakeibochan.app.web.record;

import javax.annotation.Resource;

import org.lastaflute.web.Execute;
import org.lastaflute.web.response.JsonResponse;

import com.kakeibochan.app.web.base.FrontBaseAction;
import com.kakeibochan.dbflute.allcommon.CDef.CategoryType;
import com.kakeibochan.dbflute.exbhv.AccountItemBhv;
import com.kakeibochan.dbflute.exbhv.AssetBhv;
import com.kakeibochan.dbflute.exbhv.RecordBhv;
import com.kakeibochan.dbflute.exentity.AccountItem;
import com.kakeibochan.dbflute.exentity.Asset;
import com.kakeibochan.dbflute.exentity.Record;

public class RecordUpdateAction extends FrontBaseAction {

    @Resource
    private RecordBhv recordBhv;
    @Resource
    private AccountItemBhv accountItemBhv;
    @Resource
    private AssetBhv assetBhv;

    @Execute
    public JsonResponse<RecordBean> index(RecordUpdateForm form) {
        validateApi(form, messages -> {});

        Record updateRecord = recordBhv.selectEntityWithDeletedCheck(cb -> {
            cb.query().setMemberId_Equal(getUserBean().get().getMemberId());
            cb.query().setRecordId_Equal(form.id);
            cb.query().setDelFlg_Equal_False();
            cb.query().setVersionNo_Equal(form.versionNo);
        });

        updateRecord.setDate(form.date);
        updateRecord.setAccountItemId(form.accountItemId);
        updateRecord.setAmount(form.amount);
        updateRecord.setMemo(form.memo);
        if (form.categoryType == CategoryType.Spend) {
            updateRecord.setWithdrawalAccountId(form.withdrawalAcountId);
        } else if (form.categoryType == CategoryType.Income) {
            updateRecord.setDepositAccountId(form.depositAccountId);
        } else if (form.categoryType == CategoryType.Move) {
            updateRecord.setWithdrawalAccountId(form.withdrawalAcountId);
            updateRecord.setDepositAccountId(form.depositAccountId);
        }

        recordBhv.update(updateRecord);

        AccountItem accountItem = accountItemBhv.selectEntityWithDeletedCheck(cb -> {
            cb.query().setMemberId_Equal(getUserBean().get().getMemberId());
            cb.query().setAccountItemId_Equal(form.accountItemId);
            cb.query().setDelFlg_Equal_False();
        });

        RecordBean recordBean = new RecordBean();

        if (form.categoryType == CategoryType.Spend || form.categoryType == CategoryType.Move) {
            Asset withdrawalAcount = assetBhv.selectEntityWithDeletedCheck(cb -> {
                cb.query().setMemberId_Equal(getUserBean().get().getMemberId());
                cb.query().setAssetId_Equal(form.withdrawalAcountId);
                cb.query().setDelFlg_Equal_False();
            });
            recordBean.withdrawalAccount = withdrawalAcount.getAssetName();
        }
        if (form.categoryType == CategoryType.Income || form.categoryType == CategoryType.Move) {
            Asset depositAccount = assetBhv.selectEntityWithDeletedCheck(cb -> {
                cb.query().setMemberId_Equal(getUserBean().get().getMemberId());
                cb.query().setAssetId_Equal(form.depositAccountId);
                cb.query().setDelFlg_Equal_False();
            });
            recordBean.depositAccount = depositAccount.getAssetName();
        }

        recordBean.id = form.id;
        recordBean.date = form.date;
        recordBean.categoryType = form.categoryType;
        recordBean.categoryTypeAlias = form.categoryType.alias();
        recordBean.accountTitle = accountItem.getAccountTitle();
        recordBean.memo = form.memo;
        recordBean.amount = form.amount;

        return asJson(recordBean);
    }
}
