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
 * The referrer loader of (会員)MEMBER as TABLE. <br>
 * <pre>
 * [primary key]
 *     MEMBER_ID
 *
 * [column]
 *     MEMBER_ID, MAIL_ADDRESS, NAME, PASSWORD, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MEMBER_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     WITHDRAWAL(AsOne)
 *
 * [referrer table]
 *     ACCOUNT_ITEM, ASSET, RECORD, WITHDRAWAL
 *
 * [foreign property]
 *     withdrawalAsOne
 *
 * [referrer property]
 *     accountItemList, assetList, recordList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfMember {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<Member> _selectedList;
    protected BehaviorSelector _selector;
    protected MemberBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMember ready(List<Member> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MemberBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MemberBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<AccountItem> _referrerAccountItem;

    /**
     * Load referrer of accountItemList by the set-upper of referrer. <br>
     * (勘定科目)ACCOUNT_ITEM by MEMBER_ID, named 'accountItemList'.
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">memberList</span>, <span style="color: #553000">memberLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">memberLoader</span>.<span style="color: #CC4747">loadAccountItem</span>(<span style="color: #553000">itemCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">itemCB</span>.setupSelect...
     *         <span style="color: #553000">itemCB</span>.query().set...
     *         <span style="color: #553000">itemCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">itemLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    itemLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (Member member : <span style="color: #553000">memberList</span>) {
     *     ... = member.<span style="color: #CC4747">getAccountItemList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMemberId_InScope(pkList);
     * cb.query().addOrderBy_MemberId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfAccountItem> loadAccountItem(ReferrerConditionSetupper<AccountItemCB> refCBLambda) {
        myBhv().loadAccountItem(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerAccountItem = refLs);
        return hd -> hd.handle(new LoaderOfAccountItem().ready(_referrerAccountItem, _selector));
    }

    protected List<Asset> _referrerAsset;

    /**
     * Load referrer of assetList by the set-upper of referrer. <br>
     * (資産)ASSET by MEMBER_ID, named 'assetList'.
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">memberList</span>, <span style="color: #553000">memberLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">memberLoader</span>.<span style="color: #CC4747">loadAsset</span>(<span style="color: #553000">assetCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">assetCB</span>.setupSelect...
     *         <span style="color: #553000">assetCB</span>.query().set...
     *         <span style="color: #553000">assetCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">assetLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    assetLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (Member member : <span style="color: #553000">memberList</span>) {
     *     ... = member.<span style="color: #CC4747">getAssetList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMemberId_InScope(pkList);
     * cb.query().addOrderBy_MemberId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfAsset> loadAsset(ReferrerConditionSetupper<AssetCB> refCBLambda) {
        myBhv().loadAsset(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerAsset = refLs);
        return hd -> hd.handle(new LoaderOfAsset().ready(_referrerAsset, _selector));
    }

    protected List<Record> _referrerRecord;

    /**
     * Load referrer of recordList by the set-upper of referrer. <br>
     * (明細)RECORD by MEMBER_ID, named 'recordList'.
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">memberList</span>, <span style="color: #553000">memberLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">memberLoader</span>.<span style="color: #CC4747">loadRecord</span>(<span style="color: #553000">recordCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">recordCB</span>.setupSelect...
     *         <span style="color: #553000">recordCB</span>.query().set...
     *         <span style="color: #553000">recordCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">recordLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    recordLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (Member member : <span style="color: #553000">memberList</span>) {
     *     ... = member.<span style="color: #CC4747">getRecordList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMemberId_InScope(pkList);
     * cb.query().addOrderBy_MemberId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfRecord> loadRecord(ReferrerConditionSetupper<RecordCB> refCBLambda) {
        myBhv().loadRecord(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerRecord = refLs);
        return hd -> hd.handle(new LoaderOfRecord().ready(_referrerRecord, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfWithdrawal _foreignWithdrawalAsOneLoader;
    public LoaderOfWithdrawal pulloutWithdrawalAsOne() {
        if (_foreignWithdrawalAsOneLoader == null)
        { _foreignWithdrawalAsOneLoader = new LoaderOfWithdrawal().ready(myBhv().pulloutWithdrawalAsOne(_selectedList), _selector); }
        return _foreignWithdrawalAsOneLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<Member> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
