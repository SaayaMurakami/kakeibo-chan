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
    public JsonResponse<RecordBean> index(RecordUpdateBody body) {
        validateApi(body, messages -> {});

        Record updateRecord = recordBhv.selectEntityWithDeletedCheck(cb -> {
            cb.query().setMemberId_Equal(getUserBean().get().getMemberId());
            cb.query().setRecordId_Equal(body.id);
            cb.query().setDelFlg_Equal_False();
            cb.query().setVersionNo_Equal(body.versionNo);
        });

        updateRecord.setDate(body.date);
        updateRecord.setAccountItemId(body.accountItemId);
        updateRecord.setAmount(body.amount);
        updateRecord.setMemo(body.memo);
        if (body.categoryType == CategoryType.Spend) {
            updateRecord.setWithdrawalAccountId(body.withdrawalAcountId);
        } else if (body.categoryType == CategoryType.Income) {
            updateRecord.setDepositAccountId(body.depositAccountId);
        } else if (body.categoryType == CategoryType.Move) {
            updateRecord.setWithdrawalAccountId(body.withdrawalAcountId);
            updateRecord.setDepositAccountId(body.depositAccountId);
        }

        recordBhv.update(updateRecord);

        AccountItem accountItem = accountItemBhv.selectEntityWithDeletedCheck(cb -> {
            cb.query().setMemberId_Equal(getUserBean().get().getMemberId());
            cb.query().setAccountItemId_Equal(body.accountItemId);
            cb.query().setDelFlg_Equal_False();
        });

        RecordBean recordBean = new RecordBean();

        if (body.categoryType == CategoryType.Spend || body.categoryType == CategoryType.Move) {
            Asset withdrawalAcount = assetBhv.selectEntityWithDeletedCheck(cb -> {
                cb.query().setMemberId_Equal(getUserBean().get().getMemberId());
                cb.query().setAssetId_Equal(body.withdrawalAcountId);
                cb.query().setDelFlg_Equal_False();
            });
            recordBean.withdrawalAccount = withdrawalAcount.getAssetName();
        }
        if (body.categoryType == CategoryType.Income || body.categoryType == CategoryType.Move) {
            Asset depositAccount = assetBhv.selectEntityWithDeletedCheck(cb -> {
                cb.query().setMemberId_Equal(getUserBean().get().getMemberId());
                cb.query().setAssetId_Equal(body.depositAccountId);
                cb.query().setDelFlg_Equal_False();
            });
            recordBean.depositAccount = depositAccount.getAssetName();
        }

        recordBean.id = body.id;
        recordBean.date = body.date;
        recordBean.categoryType = body.categoryType;
        recordBean.categoryTypeAlias = body.categoryType.alias();
        recordBean.accountTitle = accountItem.getAccountTitle();
        recordBean.memo = body.memo;
        recordBean.amount = body.amount;

        return asJson(recordBean);
    }
}
