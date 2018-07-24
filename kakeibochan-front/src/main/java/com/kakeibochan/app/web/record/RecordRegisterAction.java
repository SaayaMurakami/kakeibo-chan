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
import com.kakeibochan.dbflute.exentity.AccountItem;
import com.kakeibochan.dbflute.exentity.Asset;
import com.kakeibochan.mylasta.action.FrontUserBean;

public class RecordRegisterAction extends FrontBaseAction {

    @Resource
    private RecordBhv recordBhv;
    @Resource
    private AccountItemBhv accountItemBhv;
    @Resource
    private AssetBhv assetBhv;

    @Execute
    public HtmlResponse index() {
        return renderIndex();
    }

    @Execute
    public HtmlResponse goBackIndex(RecordForm form) {
        validate(form, message -> {}, () -> {
            return asHtml(path_Record_RegisterHtml);
        });

        return asHtml(path_Record_RegisterHtml);
    }

    @Execute
    public HtmlResponse confirm(RecordForm form) {
        validate(form, message -> {}, () -> {
            return renderIndex();
        });

        saveToken();

        return asHtml(path_Record_ConfirmHtml);
    }

    @Execute
    public HtmlResponse doComplete(RecordForm form) {
        validate(form, message -> {}, () -> {
            return asHtml(path_Record_RegisterHtml);
        });

        verifyToken(() -> {
            return asHtml(path_Record_RegisterHtml);
        });

        //        Record record = new Record();
        //        record.setDate(form.date);
        //        record.setAmount(form.ammount);
        //        record.setMemo(form.memo);
        //        recordBhv.insert(record);

        return redirectWith(RecordRegisterAction.class, moreUrl("complete"));
    }

    @Execute
    public HtmlResponse complete() {
        return asHtml(path_Record_CompleteHtml);
    }

    private HtmlResponse renderIndex() {
        FrontUserBean userBean = getUserBean().get();
        Long userId = userBean.getUserId();

        ListResultBean<AccountItem> accountItemList = accountItemBhv.selectList(cb -> {
            cb.query().setMemberId_Equal(userId);
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
