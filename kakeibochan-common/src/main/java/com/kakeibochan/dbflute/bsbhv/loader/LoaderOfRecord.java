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
import com.kakeibochan.dbflute.exbhv.*;
import com.kakeibochan.dbflute.exentity.*;

/**
 * The referrer loader of (明細)RECORD as TABLE. <br>
 * <pre>
 * [primary key]
 *     RECORD_ID
 *
 * [column]
 *     RECORD_ID, MEMBER_ID, ACCOUNT_ITEM_ID, DEPOSIT_ACCOUNT_ID, WITHDRAWAL_ACCOUNT_ID, DATE, AMOUNT, MEMO, DEL_FLG, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     RECORD_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     ACCOUNT_ITEM, ASSET, MEMBER
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     accountItem, assetByDepositAccountId, member, assetByWithdrawalAccountId
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfRecord {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<Record> _selectedList;
    protected BehaviorSelector _selector;
    protected RecordBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfRecord ready(List<Record> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected RecordBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(RecordBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfAccountItem _foreignAccountItemLoader;
    public LoaderOfAccountItem pulloutAccountItem() {
        if (_foreignAccountItemLoader == null)
        { _foreignAccountItemLoader = new LoaderOfAccountItem().ready(myBhv().pulloutAccountItem(_selectedList), _selector); }
        return _foreignAccountItemLoader;
    }

    protected LoaderOfAsset _foreignAssetByDepositAccountIdLoader;
    public LoaderOfAsset pulloutAssetByDepositAccountId() {
        if (_foreignAssetByDepositAccountIdLoader == null)
        { _foreignAssetByDepositAccountIdLoader = new LoaderOfAsset().ready(myBhv().pulloutAssetByDepositAccountId(_selectedList), _selector); }
        return _foreignAssetByDepositAccountIdLoader;
    }

    protected LoaderOfMember _foreignMemberLoader;
    public LoaderOfMember pulloutMember() {
        if (_foreignMemberLoader == null)
        { _foreignMemberLoader = new LoaderOfMember().ready(myBhv().pulloutMember(_selectedList), _selector); }
        return _foreignMemberLoader;
    }

    protected LoaderOfAsset _foreignAssetByWithdrawalAccountIdLoader;
    public LoaderOfAsset pulloutAssetByWithdrawalAccountId() {
        if (_foreignAssetByWithdrawalAccountIdLoader == null)
        { _foreignAssetByWithdrawalAccountIdLoader = new LoaderOfAsset().ready(myBhv().pulloutAssetByWithdrawalAccountId(_selectedList), _selector); }
        return _foreignAssetByWithdrawalAccountIdLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<Record> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
