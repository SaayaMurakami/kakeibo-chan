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
 * The referrer loader of (勘定科目)ACCOUNT_ITEM as TABLE. <br>
 * <pre>
 * [primary key]
 *     ACCOUNT_ITEM_ID
 *
 * [column]
 *     ACCOUNT_ITEM_ID, MEMBER_ID, CATEGORY_TYPE, ACCOUNT_TITLE, DEL_FLG, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ACCOUNT_ITEM_ID
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
 *     recordList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfAccountItem {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<AccountItem> _selectedList;
    protected BehaviorSelector _selector;
    protected AccountItemBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfAccountItem ready(List<AccountItem> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected AccountItemBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(AccountItemBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<Record> _referrerRecord;

    /**
     * Load referrer of recordList by the set-upper of referrer. <br>
     * (明細)RECORD by ACCOUNT_ITEM_ID, named 'recordList'.
     * <pre>
     * <span style="color: #0000C0">accountItemBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">accountItemList</span>, <span style="color: #553000">itemLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">itemLoader</span>.<span style="color: #CC4747">loadRecord</span>(<span style="color: #553000">recordCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">recordCB</span>.setupSelect...
     *         <span style="color: #553000">recordCB</span>.query().set...
     *         <span style="color: #553000">recordCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">recordLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    recordLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (AccountItem accountItem : <span style="color: #553000">accountItemList</span>) {
     *     ... = accountItem.<span style="color: #CC4747">getRecordList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setAccountItemId_InScope(pkList);
     * cb.query().addOrderBy_AccountItemId_Asc();
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
    protected LoaderOfMember _foreignMemberLoader;
    public LoaderOfMember pulloutMember() {
        if (_foreignMemberLoader == null)
        { _foreignMemberLoader = new LoaderOfMember().ready(myBhv().pulloutMember(_selectedList), _selector); }
        return _foreignMemberLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<AccountItem> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
