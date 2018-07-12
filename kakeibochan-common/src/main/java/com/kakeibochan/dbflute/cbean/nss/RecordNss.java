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
package com.kakeibochan.dbflute.cbean.nss;

import com.kakeibochan.dbflute.cbean.cq.RecordCQ;

/**
 * The nest select set-upper of RECORD.
 * @author DBFlute(AutoGenerator)
 */
public class RecordNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final RecordCQ _query;
    public RecordNss(RecordCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * (勘定科目)ACCOUNT_ITEM by my ACCOUNT_ITEM_ID, named 'accountItem'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public AccountItemNss withAccountItem() {
        _query.xdoNss(() -> _query.queryAccountItem());
        return new AccountItemNss(_query.queryAccountItem());
    }
    /**
     * With nested relation columns to select clause. <br>
     * (資産)ASSET by my DEPOSIT_ACCOUNT_ID, named 'assetByDepositAccountId'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public AssetNss withAssetByDepositAccountId() {
        _query.xdoNss(() -> _query.queryAssetByDepositAccountId());
        return new AssetNss(_query.queryAssetByDepositAccountId());
    }
    /**
     * With nested relation columns to select clause. <br>
     * (会員)MEMBER by my MEMBER_ID, named 'member'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MemberNss withMember() {
        _query.xdoNss(() -> _query.queryMember());
        return new MemberNss(_query.queryMember());
    }
    /**
     * With nested relation columns to select clause. <br>
     * (資産)ASSET by my WITHDRAWAL_ACCOUNT_ID, named 'assetByWithdrawalAccountId'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public AssetNss withAssetByWithdrawalAccountId() {
        _query.xdoNss(() -> _query.queryAssetByWithdrawalAccountId());
        return new AssetNss(_query.queryAssetByWithdrawalAccountId());
    }
}
