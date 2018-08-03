package com.kakeibochan.app.web.record;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.dbflute.cbean.result.ListResultBean;
import org.lastaflute.web.Execute;
import org.lastaflute.web.response.HtmlResponse;

import com.kakeibochan.app.web.base.FrontBaseAction;
import com.kakeibochan.dbflute.allcommon.CDef.CategoryType;
import com.kakeibochan.dbflute.exbhv.AccountItemBhv;
import com.kakeibochan.dbflute.exbhv.AssetBhv;
import com.kakeibochan.dbflute.exbhv.RecordBhv;
import com.kakeibochan.dbflute.exentity.AccountItem;
import com.kakeibochan.dbflute.exentity.Asset;
import com.kakeibochan.dbflute.exentity.Record;
import com.kakeibochan.mylasta.action.FrontMessages;
import com.kakeibochan.mylasta.action.FrontUserBean;

public class RecordRegisterAction extends FrontBaseAction {

    @Resource
    private RecordBhv recordBhv;
    @Resource
    private AccountItemBhv accountItemBhv;
    @Resource
    private AssetBhv assetBhv;

    @Execute
    public HtmlResponse index(RecordIndexForm form) {
        return renderIndex(form.categoryType);
    }

    @Execute
    public HtmlResponse goBackIndex(RecordForm form) {
        validate(form, message -> {}, () -> {
            return renderIndex(form.categoryType);
        });

        return renderIndex(form.categoryType);
    }

    @Execute
    public HtmlResponse confirm(RecordForm form) {
        validate(form, messages -> moreValidate(form, messages), () -> {
            return renderIndex(form.categoryType);
        });

        saveToken();

        AccountItem accountItem = accountItemBhv.selectEntityWithDeletedCheck(cb -> {
            cb.query().setAccountItemId_Equal(form.accountItemId);
        });

        AccountItemBean accountItemBean = new AccountItemBean();
        accountItemBean.title = accountItem.getAccountTitle();
        accountItemBean.id = accountItem.getAccountItemId();

        AssetBean withdrawalAccountBean = new AssetBean();
        AssetBean depositAccountBean = new AssetBean();

        if (form.categoryType == CategoryType.Spend) {
            Asset withdrawalAccount = assetBhv.selectEntityWithDeletedCheck(cb -> {
                cb.query().setAssetId_Equal(form.withdrawalAccountId);
            });
            withdrawalAccountBean.name = withdrawalAccount.getAssetName();
            withdrawalAccountBean.id = withdrawalAccount.getAssetId();
        } else if (form.categoryType == CategoryType.Income) {
            Asset depositAccount = assetBhv.selectEntityWithDeletedCheck(cb -> {
                cb.query().setAssetId_Equal(form.depositAccountId);
            });
            depositAccountBean.name = depositAccount.getAssetName();
            depositAccountBean.id = depositAccount.getAssetId();
        } else if (form.categoryType == CategoryType.Move) {
            Asset withdrawalAccount = assetBhv.selectEntityWithDeletedCheck(cb -> {
                cb.query().setAssetId_Equal(form.withdrawalAccountId);
            });
            Asset depositAccount = assetBhv.selectEntityWithDeletedCheck(cb -> {
                cb.query().setAssetId_Equal(form.depositAccountId);
            });
            withdrawalAccountBean.name = withdrawalAccount.getAssetName();
            withdrawalAccountBean.id = withdrawalAccount.getAssetId();
            depositAccountBean.name = depositAccount.getAssetName();
            depositAccountBean.id = depositAccount.getAssetId();
        }

        return asHtml(path_Record_ConfirmHtml).renderWith(data -> {
            data.register("accountItemBean", accountItemBean);
            if (form.categoryType == CategoryType.Spend || form.categoryType == CategoryType.Move) {
                data.register("withdrawalAccountBean", withdrawalAccountBean);
            }
            if (form.categoryType == CategoryType.Income || form.categoryType == CategoryType.Move) {
                data.register("depositAccountBean", depositAccountBean);
            }
        });
    }

    @Execute
    public HtmlResponse doComplete(RecordForm form) {
        validate(form, message -> {}, () -> {
            return renderIndex(CategoryType.Spend);
        });

        verifyToken(() -> {
            return renderIndex(CategoryType.Spend);
        });

        FrontUserBean userBean = getUserBean().get();
        Long userId = userBean.getUserId();

        Record record = new Record();
        record.setMemberId(userId);
        record.setDate(form.date);
        record.setAccountItemId(form.accountItemId);
        record.setAmount(form.amount);
        if (form.categoryType == CategoryType.Spend) {
            record.setDepositAccountId(form.depositAccountId);
        } else if (form.categoryType == CategoryType.Income) {
            record.setWithdrawalAccountId(form.withdrawalAccountId);
        } else if (form.categoryType == CategoryType.Income) {
            record.setDepositAccountId(form.depositAccountId);
            record.setWithdrawalAccountId(form.withdrawalAccountId);
        }
        record.setMemo(form.memo);
        record.setDelFlg_False();
        recordBhv.insert(record);

        return redirectWith(RecordRegisterAction.class, moreUrl("complete"));
    }

    @Execute
    public HtmlResponse complete() {
        return asHtml(path_Record_CompleteHtml);
    }

    private HtmlResponse renderIndex(CategoryType categoryType) {
        FrontUserBean userBean = getUserBean().get();
        Long userId = userBean.getUserId();

        ListResultBean<AccountItem> accountItemList = accountItemBhv.selectList(cb -> {
            cb.query().setMemberId_Equal(userId);

            if (CategoryType.Spend == categoryType) {
                cb.query().setCategoryType_Equal_Spend();
            } else if (CategoryType.Income == categoryType) {
                cb.query().setCategoryType_Equal_Income();
            } else if (CategoryType.Move == categoryType) {
                cb.query().setCategoryType_Equal_Move();
            }
        });

        ArrayList<AccountItemBean> accountItemBeans = new ArrayList<>();

        for (AccountItem accountItem : accountItemList) {
            AccountItemBean accountItemBean = new AccountItemBean();
            accountItemBean.title = accountItem.getAccountTitle();
            accountItemBean.id = accountItem.getAccountItemId();
            accountItemBeans.add(accountItemBean);
        }

        ListResultBean<Asset> assetList = assetBhv.selectList(cb -> {
            cb.query().setMemberId_Equal(userId);
        });

        ArrayList<AssetBean> assetBeans = new ArrayList<>();

        for (Asset asset : assetList) {
            AssetBean assetBean = new AssetBean();
            assetBean.name = asset.getAssetName();
            assetBean.id = asset.getAssetId();
            assetBeans.add(assetBean);
        }

        AccountItem move = accountItemBhv.selectEntityWithDeletedCheck(cb -> {
            cb.query().setMemberId_Equal(userId);
            cb.query().setAccountTitle_Equal("振替");
        });

        AccountItemBean moveBean = new AccountItemBean();
        moveBean.id = move.getAccountItemId();
        moveBean.title = move.getAccountTitle();

        return asHtml(path_Record_RegisterHtml).renderWith(data -> {
            data.register("accountItemBeans", accountItemBeans);
            data.register("assetBeans", assetBeans);
            data.register("moveBean", moveBean);
        });

    }

    private void moreValidate(RecordForm form, FrontMessages messages) {
        if (form.categoryType == CategoryType.Spend) {
            if (form.withdrawalAccountId == null) {
                messages.addConstraintsRequiredMessage("withdrawalAccountId");
            }
        } else if (form.categoryType == CategoryType.Income) {
            if (form.depositAccountId == null) {
                messages.addConstraintsRequiredMessage("depositAccountId");
            }
        } else if (form.categoryType == CategoryType.Move) {
            if (form.depositAccountId == null) {
                messages.addConstraintsRequiredMessage("depositAccountId");
            }
            if (form.withdrawalAccountId == null) {
                messages.addConstraintsRequiredMessage("withdrawalAccountId");
            }
        }
    }

}
