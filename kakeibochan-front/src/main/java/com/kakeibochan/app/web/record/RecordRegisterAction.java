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
            return renderIndex(CategoryType.Spend);
        });

        return renderIndex(CategoryType.Spend);
    }

    @Execute
    public HtmlResponse confirm(RecordForm form) {
        validate(form, message -> {}, () -> {
            return renderIndex(CategoryType.Spend);
        });

        saveToken();

        AccountItem accountItem = accountItemBhv.selectEntityWithDeletedCheck(cb -> {
            cb.query().setAccountItemId_Equal(form.accountItemId);
        });

        AccountItemBean accountItemBean = new AccountItemBean();
        accountItemBean.title = accountItem.getAccountTitle();
        accountItemBean.id = accountItem.getAccountItemId();

        Asset asset = assetBhv.selectEntityWithDeletedCheck(cb -> {
            cb.query().setAssetId_Equal(form.assetId);
        });

        AssetBean assetBean = new AssetBean();
        assetBean.name = asset.getAssetName();
        assetBean.id = asset.getAssetId();

        return asHtml(path_Record_ConfirmHtml).renderWith(data -> {
            data.register("accountItemBean", accountItemBean);
            data.register("assetBean", assetBean);
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
        record.setAccountItemId(form.accountItemId);
        record.setDepositAccountId(form.assetId);
        record.setDate(form.date);
        record.setAmount(form.amount);
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

        return asHtml(path_Record_RegisterHtml).renderWith(data -> {
            data.register("accountItemBeans", accountItemBeans);
            data.register("assetBeans", assetBeans);
        });
    }

}
