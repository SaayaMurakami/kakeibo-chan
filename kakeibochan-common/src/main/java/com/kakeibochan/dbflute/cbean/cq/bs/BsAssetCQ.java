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
 * The base condition-query of ASSET.
 * @author DBFlute(AutoGenerator)
 */
public class BsAssetCQ extends AbstractBsAssetCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected AssetCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsAssetCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from ASSET) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public AssetCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected AssetCIQ xcreateCIQ() {
        AssetCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected AssetCIQ xnewCIQ() {
        return new AssetCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join ASSET on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public AssetCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        AssetCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _assetId;
    public ConditionValue xdfgetAssetId()
    { if (_assetId == null) { _assetId = nCV(); }
      return _assetId; }
    protected ConditionValue xgetCValueAssetId() { return xdfgetAssetId(); }

    public Map<String, RecordCQ> xdfgetAssetId_ExistsReferrer_RecordByWithdrawalAccountIdList() { return xgetSQueMap("assetId_ExistsReferrer_RecordByWithdrawalAccountIdList"); }
    public String keepAssetId_ExistsReferrer_RecordByWithdrawalAccountIdList(RecordCQ sq) { return xkeepSQue("assetId_ExistsReferrer_RecordByWithdrawalAccountIdList", sq); }

    public Map<String, RecordCQ> xdfgetAssetId_ExistsReferrer_RecordByDepositAccountIdList() { return xgetSQueMap("assetId_ExistsReferrer_RecordByDepositAccountIdList"); }
    public String keepAssetId_ExistsReferrer_RecordByDepositAccountIdList(RecordCQ sq) { return xkeepSQue("assetId_ExistsReferrer_RecordByDepositAccountIdList", sq); }

    public Map<String, RecordCQ> xdfgetAssetId_NotExistsReferrer_RecordByWithdrawalAccountIdList() { return xgetSQueMap("assetId_NotExistsReferrer_RecordByWithdrawalAccountIdList"); }
    public String keepAssetId_NotExistsReferrer_RecordByWithdrawalAccountIdList(RecordCQ sq) { return xkeepSQue("assetId_NotExistsReferrer_RecordByWithdrawalAccountIdList", sq); }

    public Map<String, RecordCQ> xdfgetAssetId_NotExistsReferrer_RecordByDepositAccountIdList() { return xgetSQueMap("assetId_NotExistsReferrer_RecordByDepositAccountIdList"); }
    public String keepAssetId_NotExistsReferrer_RecordByDepositAccountIdList(RecordCQ sq) { return xkeepSQue("assetId_NotExistsReferrer_RecordByDepositAccountIdList", sq); }

    public Map<String, RecordCQ> xdfgetAssetId_SpecifyDerivedReferrer_RecordByWithdrawalAccountIdList() { return xgetSQueMap("assetId_SpecifyDerivedReferrer_RecordByWithdrawalAccountIdList"); }
    public String keepAssetId_SpecifyDerivedReferrer_RecordByWithdrawalAccountIdList(RecordCQ sq) { return xkeepSQue("assetId_SpecifyDerivedReferrer_RecordByWithdrawalAccountIdList", sq); }

    public Map<String, RecordCQ> xdfgetAssetId_SpecifyDerivedReferrer_RecordByDepositAccountIdList() { return xgetSQueMap("assetId_SpecifyDerivedReferrer_RecordByDepositAccountIdList"); }
    public String keepAssetId_SpecifyDerivedReferrer_RecordByDepositAccountIdList(RecordCQ sq) { return xkeepSQue("assetId_SpecifyDerivedReferrer_RecordByDepositAccountIdList", sq); }

    public Map<String, RecordCQ> xdfgetAssetId_QueryDerivedReferrer_RecordByWithdrawalAccountIdList() { return xgetSQueMap("assetId_QueryDerivedReferrer_RecordByWithdrawalAccountIdList"); }
    public String keepAssetId_QueryDerivedReferrer_RecordByWithdrawalAccountIdList(RecordCQ sq) { return xkeepSQue("assetId_QueryDerivedReferrer_RecordByWithdrawalAccountIdList", sq); }
    public Map<String, Object> xdfgetAssetId_QueryDerivedReferrer_RecordByWithdrawalAccountIdListParameter() { return xgetSQuePmMap("assetId_QueryDerivedReferrer_RecordByWithdrawalAccountIdList"); }
    public String keepAssetId_QueryDerivedReferrer_RecordByWithdrawalAccountIdListParameter(Object pm) { return xkeepSQuePm("assetId_QueryDerivedReferrer_RecordByWithdrawalAccountIdList", pm); }

    public Map<String, RecordCQ> xdfgetAssetId_QueryDerivedReferrer_RecordByDepositAccountIdList() { return xgetSQueMap("assetId_QueryDerivedReferrer_RecordByDepositAccountIdList"); }
    public String keepAssetId_QueryDerivedReferrer_RecordByDepositAccountIdList(RecordCQ sq) { return xkeepSQue("assetId_QueryDerivedReferrer_RecordByDepositAccountIdList", sq); }
    public Map<String, Object> xdfgetAssetId_QueryDerivedReferrer_RecordByDepositAccountIdListParameter() { return xgetSQuePmMap("assetId_QueryDerivedReferrer_RecordByDepositAccountIdList"); }
    public String keepAssetId_QueryDerivedReferrer_RecordByDepositAccountIdListParameter(Object pm) { return xkeepSQuePm("assetId_QueryDerivedReferrer_RecordByDepositAccountIdList", pm); }

    /**
     * Add order-by as ascend. <br>
     * (資産ID)ASSET_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsAssetCQ addOrderBy_AssetId_Asc() { regOBA("ASSET_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (資産ID)ASSET_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsAssetCQ addOrderBy_AssetId_Desc() { regOBD("ASSET_ID"); return this; }

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
    public BsAssetCQ addOrderBy_MemberId_Asc() { regOBA("MEMBER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (会員ID)MEMBER_ID: {IX, NotNull, BIGINT(19), FK to MEMBER}
     * @return this. (NotNull)
     */
    public BsAssetCQ addOrderBy_MemberId_Desc() { regOBD("MEMBER_ID"); return this; }

    protected ConditionValue _assetName;
    public ConditionValue xdfgetAssetName()
    { if (_assetName == null) { _assetName = nCV(); }
      return _assetName; }
    protected ConditionValue xgetCValueAssetName() { return xdfgetAssetName(); }

    /**
     * Add order-by as ascend. <br>
     * (資産名)ASSET_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsAssetCQ addOrderBy_AssetName_Asc() { regOBA("ASSET_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (資産名)ASSET_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsAssetCQ addOrderBy_AssetName_Desc() { regOBD("ASSET_NAME"); return this; }

    protected ConditionValue _balance;
    public ConditionValue xdfgetBalance()
    { if (_balance == null) { _balance = nCV(); }
      return _balance; }
    protected ConditionValue xgetCValueBalance() { return xdfgetBalance(); }

    /**
     * Add order-by as ascend. <br>
     * (残高)BALANCE: {NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsAssetCQ addOrderBy_Balance_Asc() { regOBA("BALANCE"); return this; }

    /**
     * Add order-by as descend. <br>
     * (残高)BALANCE: {NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsAssetCQ addOrderBy_Balance_Desc() { regOBD("BALANCE"); return this; }

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
    public BsAssetCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * (削除フラグ)DEL_FLG: {NotNull, CHAR(1), classification=Flg}
     * @return this. (NotNull)
     */
    public BsAssetCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsAssetCQ addOrderBy_RegisterDatetime_Asc() { regOBA("REGISTER_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsAssetCQ addOrderBy_RegisterDatetime_Desc() { regOBD("REGISTER_DATETIME"); return this; }

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
    public BsAssetCQ addOrderBy_RegisterUser_Asc() { regOBA("REGISTER_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsAssetCQ addOrderBy_RegisterUser_Desc() { regOBD("REGISTER_USER"); return this; }

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
    public BsAssetCQ addOrderBy_UpdateDatetime_Asc() { regOBA("UPDATE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsAssetCQ addOrderBy_UpdateDatetime_Desc() { regOBD("UPDATE_DATETIME"); return this; }

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
    public BsAssetCQ addOrderBy_UpdateUser_Asc() { regOBA("UPDATE_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (更新ユーザー)UPDATE_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsAssetCQ addOrderBy_UpdateUser_Desc() { regOBD("UPDATE_USER"); return this; }

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
    public BsAssetCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * (バージョン番号)VERSION_NO: {NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsAssetCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsAssetCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsAssetCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        AssetCQ bq = (AssetCQ)bqs;
        AssetCQ uq = (AssetCQ)uqs;
        if (bq.hasConditionQueryMember()) {
            uq.queryMember().reflectRelationOnUnionQuery(bq.queryMember(), uq.queryMember());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
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
        String nrp = xresolveNRP("ASSET", "member"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MemberCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "member", nrp);
    }
    protected void xsetupOuterJoinMember() { xregOutJo("member"); }
    public boolean hasConditionQueryMember() { return xhasQueRlMap("member"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, AssetCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(AssetCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, AssetCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(AssetCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, AssetCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(AssetCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, AssetCQ> _myselfExistsMap;
    public Map<String, AssetCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(AssetCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, AssetCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(AssetCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return AssetCB.class.getName(); }
    protected String xCQ() { return AssetCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
