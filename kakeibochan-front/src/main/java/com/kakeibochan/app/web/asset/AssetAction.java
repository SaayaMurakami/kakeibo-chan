package com.kakeibochan.app.web.asset;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.dbflute.cbean.result.ListResultBean;
import org.lastaflute.web.Execute;
import org.lastaflute.web.response.HtmlResponse;

import com.kakeibochan.app.web.base.FrontBaseAction;
import com.kakeibochan.dbflute.exbhv.AssetBhv;
import com.kakeibochan.dbflute.exentity.Asset;

public class AssetAction extends FrontBaseAction {

    @Resource
    private AssetBhv assetBhv;

    @Execute
    public HtmlResponse index() {

        ListResultBean<Asset> assetList = assetBhv.selectList(cb -> {
            cb.query().setMemberId_Equal(getUserBean().get().getMemberId());
            cb.query().setDelFlg_Equal_False();
            cb.query().addOrderBy_AssetId_Asc();
        });

        ArrayList<AssetListBean> assetBeans = new ArrayList<>();

        for (Asset asset : assetList) {
            AssetListBean assetBean = new AssetListBean();
            assetBean.name = asset.getAssetName();
            assetBean.balance = asset.getBalance();
            assetBeans.add(assetBean);
        }

        return asHtml(path_Asset_AssetHtml).renderWith(data -> {
            data.register("assetBeans", assetBeans);
        });
    }

}
