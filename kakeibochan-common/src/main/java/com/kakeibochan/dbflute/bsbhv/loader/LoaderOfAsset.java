/*
 * Copyright 2015-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package com.kakeibochan.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.kakeibochan.dbflute.exbhv.*;
import com.kakeibochan.dbflute.exentity.*;
import com.kakeibochan.dbflute.cbean.*;

/**
 * The referrer loader of (資産)ASSET as TABLE. <br>
 * <pre>
 * [primary key]
 *     ASSET_ID
 *
 * [column]
 *     ASSET_ID, MEMBER_ID, ASSET_NAME, BALANCE, DEL_FLG, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ASSET_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     MEMBER
 *
 * [referrer table]
 *     RECORD
 *
 * [foreign property]
 *     member
 *
 * [referrer property]
 *     recordByWithdrawalAccountIdList, recordByDepositAccountIdList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfAsset {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<Asset> _selectedList;
    protected BehaviorSelector _selector;
    protected AssetBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfAsset ready(List<Asset> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected AssetBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(AssetBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<Record> _referrerRecordByWithdrawalAccountId;

    /**
     * Load referrer of recordByWithdrawalAccountIdList by the set-upper of referrer. <br>
     * (明細)RECORD by WITHDRAWAL_ACCOUNT_ID, named 'recordByWithdrawalAccountIdList'.
     * <pre>
     * <span style="color: #0000C0">assetBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">assetList</span>, <span style="color: #553000">assetLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">assetLoader</span>.<span style="color: #CC4747">loadRecordByWithdrawalAccountId</span>(<span style="color: #553000">recordCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">recordCB</span>.setupSelect...
     *         <span style="color: #553000">recordCB</span>.query().set...
     *         <span style="color: #553000">recordCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">recordLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    recordLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (Asset asset : <span style="color: #553000">assetList</span>) {
     *     ... = asset.<span style="color: #CC4747">getRecordByWithdrawalAccountIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setWithdrawalAccountId_InScope(pkList);
     * cb.query().addOrderBy_WithdrawalAccountId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfRecord> loadRecordByWithdrawalAccountId(ReferrerConditionSetupper<RecordCB> refCBLambda) {
        myBhv().loadRecordByWithdrawalAccountId(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerRecordByWithdrawalAccountId = refLs);
        return hd -> hd.handle(new LoaderOfRecord().ready(_referrerRecordByWithdrawalAccountId, _selector));
    }

    protected List<Record> _referrerRecordByDepositAccountId;

    /**
     * Load referrer of recordByDepositAccountIdList by the set-upper of referrer. <br>
     * (明細)RECORD by DEPOSIT_ACCOUNT_ID, named 'recordByDepositAccountIdList'.
     * <pre>
     * <span style="color: #0000C0">assetBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">assetList</span>, <span style="color: #553000">assetLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">assetLoader</span>.<span style="color: #CC4747">loadRecordByDepositAccountId</span>(<span style="color: #553000">recordCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">recordCB</span>.setupSelect...
     *         <span style="color: #553000">recordCB</span>.query().set...
     *         <span style="color: #553000">recordCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">recordLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    recordLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (Asset asset : <span style="color: #553000">assetList</span>) {
     *     ... = asset.<span style="color: #CC4747">getRecordByDepositAccountIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDepositAccountId_InScope(pkList);
     * cb.query().addOrderBy_DepositAccountId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfRecord> loadRecordByDepositAccountId(ReferrerConditionSetupper<RecordCB> refCBLambda) {
        myBhv().loadRecordByDepositAccountId(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerRecordByDepositAccountId = refLs);
        return hd -> hd.handle(new LoaderOfRecord().ready(_referrerRecordByDepositAccountId, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMember _foreignMemberLoader;
    public LoaderOfMember pulloutMember() {
        if (_foreignMemberLoader == null)
        { _foreignMemberLoader = new LoaderOfMember().ready(myBhv().pulloutMember(_selectedList), _selector); }
        return _foreignMemberLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<Asset> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
