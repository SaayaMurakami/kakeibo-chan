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
package com.kakeibochan.dbflute.cbean.cq.bs;

import java.util.Map;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import com.kakeibochan.dbflute.cbean.cq.ciq.*;
import com.kakeibochan.dbflute.cbean.*;
import com.kakeibochan.dbflute.cbean.cq.*;

/**
 * The base condition-query of RECORD.
 * @author DBFlute(AutoGenerator)
 */
public class BsRecordCQ extends AbstractBsRecordCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected RecordCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsRecordCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from RECORD) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public RecordCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected RecordCIQ xcreateCIQ() {
        RecordCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected RecordCIQ xnewCIQ() {
        return new RecordCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join RECORD on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public RecordCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        RecordCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _recordId;
    public ConditionValue xdfgetRecordId()
    { if (_recordId == null) { _recordId = nCV(); }
      return _recordId; }
    protected ConditionValue xgetCValueRecordId() { return xdfgetRecordId(); }

    /**
     * Add order-by as ascend. <br>
     * (明細ID)RECORD_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsRecordCQ addOrderBy_RecordId_Asc() { regOBA("RECORD_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (明細ID)RECORD_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsRecordCQ addOrderBy_RecordId_Desc() { regOBD("RECORD_ID"); return this; }

    protected ConditionValue _memberId;
    public ConditionValue xdfgetMemberId()
    { if (_memberId == null) { _memberId = nCV(); }
      return _memberId; }
    protected ConditionValue xgetCValueMemberId() { return xdfgetMemberId(); }

    /**
     * Add order-by as ascend. <br>
     * (会員ID)MEMBER_ID: {IX, NotNull, BIGINT(19), FK to MEMBER}
     * @return this. (NotNull)
     */
    public BsRecordCQ addOrderBy_MemberId_Asc() { regOBA("MEMBER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (会員ID)MEMBER_ID: {IX, NotNull, BIGINT(19), FK to MEMBER}
     * @return this. (NotNull)
     */
    public BsRecordCQ addOrderBy_MemberId_Desc() { regOBD("MEMBER_ID"); return this; }

    protected ConditionValue _accountItemId;
    public ConditionValue xdfgetAccountItemId()
    { if (_accountItemId == null) { _accountItemId = nCV(); }
      return _accountItemId; }
    protected ConditionValue xgetCValueAccountItemId() { return xdfgetAccountItemId(); }

    /**
     * Add order-by as ascend. <br>
     * (勘定科目ID)ACCOUNT_ITEM_ID: {IX, NotNull, BIGINT(19), FK to ACCOUNT_ITEM}
     * @return this. (NotNull)
     */
    public BsRecordCQ addOrderBy_AccountItemId_Asc() { regOBA("ACCOUNT_ITEM_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (勘定科目ID)ACCOUNT_ITEM_ID: {IX, NotNull, BIGINT(19), FK to ACCOUNT_ITEM}
     * @return this. (NotNull)
     */
    public BsRecordCQ addOrderBy_AccountItemId_Desc() { regOBD("ACCOUNT_ITEM_ID"); return this; }

    protected ConditionValue _depositAccountId;
    public ConditionValue xdfgetDepositAccountId()
    { if (_depositAccountId == null) { _depositAccountId = nCV(); }
      return _depositAccountId; }
    protected ConditionValue xgetCValueDepositAccountId() { return xdfgetDepositAccountId(); }

    /**
     * Add order-by as ascend. <br>
     * (入金先口座ID)DEPOSIT_ACCOUNT_ID: {IX, BIGINT(19), FK to ASSET}
     * @return this. (NotNull)
     */
    public BsRecordCQ addOrderBy_DepositAccountId_Asc() { regOBA("DEPOSIT_ACCOUNT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (入金先口座ID)DEPOSIT_ACCOUNT_ID: {IX, BIGINT(19), FK to ASSET}
     * @return this. (NotNull)
     */
    public BsRecordCQ addOrderBy_DepositAccountId_Desc() { regOBD("DEPOSIT_ACCOUNT_ID"); return this; }

    protected ConditionValue _withdrawalAccountId;
    public ConditionValue xdfgetWithdrawalAccountId()
    { if (_withdrawalAccountId == null) { _withdrawalAccountId = nCV(); }
      return _withdrawalAccountId; }
    protected ConditionValue xgetCValueWithdrawalAccountId() { return xdfgetWithdrawalAccountId(); }

    /**
     * Add order-by as ascend. <br>
     * (出金元口座ID)WITHDRAWAL_ACCOUNT_ID: {IX, BIGINT(19), FK to ASSET}
     * @return this. (NotNull)
     */
    public BsRecordCQ addOrderBy_WithdrawalAccountId_Asc() { regOBA("WITHDRAWAL_ACCOUNT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (出金元口座ID)WITHDRAWAL_ACCOUNT_ID: {IX, BIGINT(19), FK to ASSET}
     * @return this. (NotNull)
     */
    public BsRecordCQ addOrderBy_WithdrawalAccountId_Desc() { regOBD("WITHDRAWAL_ACCOUNT_ID"); return this; }

    protected ConditionValue _date;
    public ConditionValue xdfgetDate()
    { if (_date == null) { _date = nCV(); }
      return _date; }
    protected ConditionValue xgetCValueDate() { return xdfgetDate(); }

    /**
     * Add order-by as ascend. <br>
     * (日付)DATE: {NotNull, DATE(10)}
     * @return this. (NotNull)
     */
    public BsRecordCQ addOrderBy_Date_Asc() { regOBA("DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * (日付)DATE: {NotNull, DATE(10)}
     * @return this. (NotNull)
     */
    public BsRecordCQ addOrderBy_Date_Desc() { regOBD("DATE"); return this; }

    protected ConditionValue _amount;
    public ConditionValue xdfgetAmount()
    { if (_amount == null) { _amount = nCV(); }
      return _amount; }
    protected ConditionValue xgetCValueAmount() { return xdfgetAmount(); }

    /**
     * Add order-by as ascend. <br>
     * (金額)AMOUNT: {NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsRecordCQ addOrderBy_Amount_Asc() { regOBA("AMOUNT"); return this; }

    /**
     * Add order-by as descend. <br>
     * (金額)AMOUNT: {NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsRecordCQ addOrderBy_Amount_Desc() { regOBD("AMOUNT"); return this; }

    protected ConditionValue _memo;
    public ConditionValue xdfgetMemo()
    { if (_memo == null) { _memo = nCV(); }
      return _memo; }
    protected ConditionValue xgetCValueMemo() { return xdfgetMemo(); }

    /**
     * Add order-by as ascend. <br>
     * (メモ)MEMO: {VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsRecordCQ addOrderBy_Memo_Asc() { regOBA("MEMO"); return this; }

    /**
     * Add order-by as descend. <br>
     * (メモ)MEMO: {VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsRecordCQ addOrderBy_Memo_Desc() { regOBD("MEMO"); return this; }

    protected ConditionValue _delFlg;
    public ConditionValue xdfgetDelFlg()
    { if (_delFlg == null) { _delFlg = nCV(); }
      return _delFlg; }
    protected ConditionValue xgetCValueDelFlg() { return xdfgetDelFlg(); }

    /**
     * Add order-by as ascend. <br>
     * (削除フラグ)DEL_FLG: {NotNull, CHAR(1), classification=Flg}
     * @return this. (NotNull)
     */
    public BsRecordCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * (削除フラグ)DEL_FLG: {NotNull, CHAR(1), classification=Flg}
     * @return this. (NotNull)
     */
    public BsRecordCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

    protected ConditionValue _registerDatetime;
    public ConditionValue xdfgetRegisterDatetime()
    { if (_registerDatetime == null) { _registerDatetime = nCV(); }
      return _registerDatetime; }
    protected ConditionValue xgetCValueRegisterDatetime() { return xdfgetRegisterDatetime(); }

    /**
     * Add order-by as ascend. <br>
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsRecordCQ addOrderBy_RegisterDatetime_Asc() { regOBA("REGISTER_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsRecordCQ addOrderBy_RegisterDatetime_Desc() { regOBD("REGISTER_DATETIME"); return this; }

    protected ConditionValue _registerUser;
    public ConditionValue xdfgetRegisterUser()
    { if (_registerUser == null) { _registerUser = nCV(); }
      return _registerUser; }
    protected ConditionValue xgetCValueRegisterUser() { return xdfgetRegisterUser(); }

    /**
     * Add order-by as ascend. <br>
     * (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsRecordCQ addOrderBy_RegisterUser_Asc() { regOBA("REGISTER_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsRecordCQ addOrderBy_RegisterUser_Desc() { regOBD("REGISTER_USER"); return this; }

    protected ConditionValue _updateDatetime;
    public ConditionValue xdfgetUpdateDatetime()
    { if (_updateDatetime == null) { _updateDatetime = nCV(); }
      return _updateDatetime; }
    protected ConditionValue xgetCValueUpdateDatetime() { return xdfgetUpdateDatetime(); }

    /**
     * Add order-by as ascend. <br>
     * (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsRecordCQ addOrderBy_UpdateDatetime_Asc() { regOBA("UPDATE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsRecordCQ addOrderBy_UpdateDatetime_Desc() { regOBD("UPDATE_DATETIME"); return this; }

    protected ConditionValue _updateUser;
    public ConditionValue xdfgetUpdateUser()
    { if (_updateUser == null) { _updateUser = nCV(); }
      return _updateUser; }
    protected ConditionValue xgetCValueUpdateUser() { return xdfgetUpdateUser(); }

    /**
     * Add order-by as ascend. <br>
     * (更新ユーザー)UPDATE_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsRecordCQ addOrderBy_UpdateUser_Asc() { regOBA("UPDATE_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (更新ユーザー)UPDATE_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsRecordCQ addOrderBy_UpdateUser_Desc() { regOBD("UPDATE_USER"); return this; }

    protected ConditionValue _versionNo;
    public ConditionValue xdfgetVersionNo()
    { if (_versionNo == null) { _versionNo = nCV(); }
      return _versionNo; }
    protected ConditionValue xgetCValueVersionNo() { return xdfgetVersionNo(); }

    /**
     * Add order-by as ascend. <br>
     * (バージョン番号)VERSION_NO: {NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsRecordCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * (バージョン番号)VERSION_NO: {NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsRecordCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsRecordCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsRecordCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        RecordCQ bq = (RecordCQ)bqs;
        RecordCQ uq = (RecordCQ)uqs;
        if (bq.hasConditionQueryAccountItem()) {
            uq.queryAccountItem().reflectRelationOnUnionQuery(bq.queryAccountItem(), uq.queryAccountItem());
        }
        if (bq.hasConditionQueryAssetByDepositAccountId()) {
            uq.queryAssetByDepositAccountId().reflectRelationOnUnionQuery(bq.queryAssetByDepositAccountId(), uq.queryAssetByDepositAccountId());
        }
        if (bq.hasConditionQueryMember()) {
            uq.queryMember().reflectRelationOnUnionQuery(bq.queryMember(), uq.queryMember());
        }
        if (bq.hasConditionQueryAssetByWithdrawalAccountId()) {
            uq.queryAssetByWithdrawalAccountId().reflectRelationOnUnionQuery(bq.queryAssetByWithdrawalAccountId(), uq.queryAssetByWithdrawalAccountId());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * (勘定科目)ACCOUNT_ITEM by my ACCOUNT_ITEM_ID, named 'accountItem'.
     * @return The instance of condition-query. (NotNull)
     */
    public AccountItemCQ queryAccountItem() {
        return xdfgetConditionQueryAccountItem();
    }
    public AccountItemCQ xdfgetConditionQueryAccountItem() {
        String prop = "accountItem";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryAccountItem()); xsetupOuterJoinAccountItem(); }
        return xgetQueRlMap(prop);
    }
    protected AccountItemCQ xcreateQueryAccountItem() {
        String nrp = xresolveNRP("RECORD", "accountItem"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new AccountItemCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "accountItem", nrp);
    }
    protected void xsetupOuterJoinAccountItem() { xregOutJo("accountItem"); }
    public boolean hasConditionQueryAccountItem() { return xhasQueRlMap("accountItem"); }

    /**
     * Get the condition-query for relation table. <br>
     * (資産)ASSET by my DEPOSIT_ACCOUNT_ID, named 'assetByDepositAccountId'.
     * @return The instance of condition-query. (NotNull)
     */
    public AssetCQ queryAssetByDepositAccountId() {
        return xdfgetConditionQueryAssetByDepositAccountId();
    }
    public AssetCQ xdfgetConditionQueryAssetByDepositAccountId() {
        String prop = "assetByDepositAccountId";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryAssetByDepositAccountId()); xsetupOuterJoinAssetByDepositAccountId(); }
        return xgetQueRlMap(prop);
    }
    protected AssetCQ xcreateQueryAssetByDepositAccountId() {
        String nrp = xresolveNRP("RECORD", "assetByDepositAccountId"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new AssetCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "assetByDepositAccountId", nrp);
    }
    protected void xsetupOuterJoinAssetByDepositAccountId() { xregOutJo("assetByDepositAccountId"); }
    public boolean hasConditionQueryAssetByDepositAccountId() { return xhasQueRlMap("assetByDepositAccountId"); }

    /**
     * Get the condition-query for relation table. <br>
     * (会員)MEMBER by my MEMBER_ID, named 'member'.
     * @return The instance of condition-query. (NotNull)
     */
    public MemberCQ queryMember() {
        return xdfgetConditionQueryMember();
    }
    public MemberCQ xdfgetConditionQueryMember() {
        String prop = "member";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMember()); xsetupOuterJoinMember(); }
        return xgetQueRlMap(prop);
    }
    protected MemberCQ xcreateQueryMember() {
        String nrp = xresolveNRP("RECORD", "member"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MemberCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "member", nrp);
    }
    protected void xsetupOuterJoinMember() { xregOutJo("member"); }
    public boolean hasConditionQueryMember() { return xhasQueRlMap("member"); }

    /**
     * Get the condition-query for relation table. <br>
     * (資産)ASSET by my WITHDRAWAL_ACCOUNT_ID, named 'assetByWithdrawalAccountId'.
     * @return The instance of condition-query. (NotNull)
     */
    public AssetCQ queryAssetByWithdrawalAccountId() {
        return xdfgetConditionQueryAssetByWithdrawalAccountId();
    }
    public AssetCQ xdfgetConditionQueryAssetByWithdrawalAccountId() {
        String prop = "assetByWithdrawalAccountId";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryAssetByWithdrawalAccountId()); xsetupOuterJoinAssetByWithdrawalAccountId(); }
        return xgetQueRlMap(prop);
    }
    protected AssetCQ xcreateQueryAssetByWithdrawalAccountId() {
        String nrp = xresolveNRP("RECORD", "assetByWithdrawalAccountId"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new AssetCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "assetByWithdrawalAccountId", nrp);
    }
    protected void xsetupOuterJoinAssetByWithdrawalAccountId() { xregOutJo("assetByWithdrawalAccountId"); }
    public boolean hasConditionQueryAssetByWithdrawalAccountId() { return xhasQueRlMap("assetByWithdrawalAccountId"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, RecordCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(RecordCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, RecordCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(RecordCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, RecordCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(RecordCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, RecordCQ> _myselfExistsMap;
    public Map<String, RecordCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(RecordCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, RecordCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(RecordCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return RecordCB.class.getName(); }
    protected String xCQ() { return RecordCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
