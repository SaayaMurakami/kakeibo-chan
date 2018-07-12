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
 * The base condition-query of MEMBER.
 * @author DBFlute(AutoGenerator)
 */
public class BsMemberCQ extends AbstractBsMemberCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MemberCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMemberCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from MEMBER) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MemberCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MemberCIQ xcreateCIQ() {
        MemberCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MemberCIQ xnewCIQ() {
        return new MemberCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join MEMBER on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MemberCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MemberCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _memberId;
    public ConditionValue xdfgetMemberId()
    { if (_memberId == null) { _memberId = nCV(); }
      return _memberId; }
    protected ConditionValue xgetCValueMemberId() { return xdfgetMemberId(); }

    public Map<String, AccountItemCQ> xdfgetMemberId_ExistsReferrer_AccountItemList() { return xgetSQueMap("memberId_ExistsReferrer_AccountItemList"); }
    public String keepMemberId_ExistsReferrer_AccountItemList(AccountItemCQ sq) { return xkeepSQue("memberId_ExistsReferrer_AccountItemList", sq); }

    public Map<String, AssetCQ> xdfgetMemberId_ExistsReferrer_AssetList() { return xgetSQueMap("memberId_ExistsReferrer_AssetList"); }
    public String keepMemberId_ExistsReferrer_AssetList(AssetCQ sq) { return xkeepSQue("memberId_ExistsReferrer_AssetList", sq); }

    public Map<String, RecordCQ> xdfgetMemberId_ExistsReferrer_RecordList() { return xgetSQueMap("memberId_ExistsReferrer_RecordList"); }
    public String keepMemberId_ExistsReferrer_RecordList(RecordCQ sq) { return xkeepSQue("memberId_ExistsReferrer_RecordList", sq); }

    public Map<String, AccountItemCQ> xdfgetMemberId_NotExistsReferrer_AccountItemList() { return xgetSQueMap("memberId_NotExistsReferrer_AccountItemList"); }
    public String keepMemberId_NotExistsReferrer_AccountItemList(AccountItemCQ sq) { return xkeepSQue("memberId_NotExistsReferrer_AccountItemList", sq); }

    public Map<String, AssetCQ> xdfgetMemberId_NotExistsReferrer_AssetList() { return xgetSQueMap("memberId_NotExistsReferrer_AssetList"); }
    public String keepMemberId_NotExistsReferrer_AssetList(AssetCQ sq) { return xkeepSQue("memberId_NotExistsReferrer_AssetList", sq); }

    public Map<String, RecordCQ> xdfgetMemberId_NotExistsReferrer_RecordList() { return xgetSQueMap("memberId_NotExistsReferrer_RecordList"); }
    public String keepMemberId_NotExistsReferrer_RecordList(RecordCQ sq) { return xkeepSQue("memberId_NotExistsReferrer_RecordList", sq); }

    public Map<String, AccountItemCQ> xdfgetMemberId_SpecifyDerivedReferrer_AccountItemList() { return xgetSQueMap("memberId_SpecifyDerivedReferrer_AccountItemList"); }
    public String keepMemberId_SpecifyDerivedReferrer_AccountItemList(AccountItemCQ sq) { return xkeepSQue("memberId_SpecifyDerivedReferrer_AccountItemList", sq); }

    public Map<String, AssetCQ> xdfgetMemberId_SpecifyDerivedReferrer_AssetList() { return xgetSQueMap("memberId_SpecifyDerivedReferrer_AssetList"); }
    public String keepMemberId_SpecifyDerivedReferrer_AssetList(AssetCQ sq) { return xkeepSQue("memberId_SpecifyDerivedReferrer_AssetList", sq); }

    public Map<String, RecordCQ> xdfgetMemberId_SpecifyDerivedReferrer_RecordList() { return xgetSQueMap("memberId_SpecifyDerivedReferrer_RecordList"); }
    public String keepMemberId_SpecifyDerivedReferrer_RecordList(RecordCQ sq) { return xkeepSQue("memberId_SpecifyDerivedReferrer_RecordList", sq); }

    public Map<String, AccountItemCQ> xdfgetMemberId_QueryDerivedReferrer_AccountItemList() { return xgetSQueMap("memberId_QueryDerivedReferrer_AccountItemList"); }
    public String keepMemberId_QueryDerivedReferrer_AccountItemList(AccountItemCQ sq) { return xkeepSQue("memberId_QueryDerivedReferrer_AccountItemList", sq); }
    public Map<String, Object> xdfgetMemberId_QueryDerivedReferrer_AccountItemListParameter() { return xgetSQuePmMap("memberId_QueryDerivedReferrer_AccountItemList"); }
    public String keepMemberId_QueryDerivedReferrer_AccountItemListParameter(Object pm) { return xkeepSQuePm("memberId_QueryDerivedReferrer_AccountItemList", pm); }

    public Map<String, AssetCQ> xdfgetMemberId_QueryDerivedReferrer_AssetList() { return xgetSQueMap("memberId_QueryDerivedReferrer_AssetList"); }
    public String keepMemberId_QueryDerivedReferrer_AssetList(AssetCQ sq) { return xkeepSQue("memberId_QueryDerivedReferrer_AssetList", sq); }
    public Map<String, Object> xdfgetMemberId_QueryDerivedReferrer_AssetListParameter() { return xgetSQuePmMap("memberId_QueryDerivedReferrer_AssetList"); }
    public String keepMemberId_QueryDerivedReferrer_AssetListParameter(Object pm) { return xkeepSQuePm("memberId_QueryDerivedReferrer_AssetList", pm); }

    public Map<String, RecordCQ> xdfgetMemberId_QueryDerivedReferrer_RecordList() { return xgetSQueMap("memberId_QueryDerivedReferrer_RecordList"); }
    public String keepMemberId_QueryDerivedReferrer_RecordList(RecordCQ sq) { return xkeepSQue("memberId_QueryDerivedReferrer_RecordList", sq); }
    public Map<String, Object> xdfgetMemberId_QueryDerivedReferrer_RecordListParameter() { return xgetSQuePmMap("memberId_QueryDerivedReferrer_RecordList"); }
    public String keepMemberId_QueryDerivedReferrer_RecordListParameter(Object pm) { return xkeepSQuePm("memberId_QueryDerivedReferrer_RecordList", pm); }

    /**
     * Add order-by as ascend. <br>
     * (会員ID)MEMBER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_MemberId_Asc() { regOBA("MEMBER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (会員ID)MEMBER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_MemberId_Desc() { regOBD("MEMBER_ID"); return this; }

    protected ConditionValue _mailAddress;
    public ConditionValue xdfgetMailAddress()
    { if (_mailAddress == null) { _mailAddress = nCV(); }
      return _mailAddress; }
    protected ConditionValue xgetCValueMailAddress() { return xdfgetMailAddress(); }

    /**
     * Add order-by as ascend. <br>
     * (メールアドレス)MAIL_ADDRESS: {UQ, NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_MailAddress_Asc() { regOBA("MAIL_ADDRESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * (メールアドレス)MAIL_ADDRESS: {UQ, NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_MailAddress_Desc() { regOBD("MAIL_ADDRESS"); return this; }

    protected ConditionValue _name;
    public ConditionValue xdfgetName()
    { if (_name == null) { _name = nCV(); }
      return _name; }
    protected ConditionValue xgetCValueName() { return xdfgetName(); }

    /**
     * Add order-by as ascend. <br>
     * (名前)NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_Name_Asc() { regOBA("NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (名前)NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_Name_Desc() { regOBD("NAME"); return this; }

    protected ConditionValue _password;
    public ConditionValue xdfgetPassword()
    { if (_password == null) { _password = nCV(); }
      return _password; }
    protected ConditionValue xgetCValuePassword() { return xdfgetPassword(); }

    /**
     * Add order-by as ascend. <br>
     * (パスワード)PASSWORD: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_Password_Asc() { regOBA("PASSWORD"); return this; }

    /**
     * Add order-by as descend. <br>
     * (パスワード)PASSWORD: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_Password_Desc() { regOBD("PASSWORD"); return this; }

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
    public BsMemberCQ addOrderBy_RegisterDatetime_Asc() { regOBA("REGISTER_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_RegisterDatetime_Desc() { regOBD("REGISTER_DATETIME"); return this; }

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
    public BsMemberCQ addOrderBy_RegisterUser_Asc() { regOBA("REGISTER_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_RegisterUser_Desc() { regOBD("REGISTER_USER"); return this; }

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
    public BsMemberCQ addOrderBy_UpdateDatetime_Asc() { regOBA("UPDATE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_UpdateDatetime_Desc() { regOBD("UPDATE_DATETIME"); return this; }

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
    public BsMemberCQ addOrderBy_UpdateUser_Asc() { regOBA("UPDATE_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (更新ユーザー)UPDATE_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_UpdateUser_Desc() { regOBD("UPDATE_USER"); return this; }

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
    public BsMemberCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * (バージョン番号)VERSION_NO: {NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsMemberCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsMemberCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        MemberCQ bq = (MemberCQ)bqs;
        MemberCQ uq = (MemberCQ)uqs;
        if (bq.hasConditionQueryWithdrawalAsOne()) {
            uq.queryWithdrawalAsOne().reflectRelationOnUnionQuery(bq.queryWithdrawalAsOne(), uq.queryWithdrawalAsOne());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * (退会情報)WITHDRAWAL by MEMBER_ID, named 'withdrawalAsOne'.
     * @return The instance of condition-query. (NotNull)
     */
    public WithdrawalCQ queryWithdrawalAsOne() { return xdfgetConditionQueryWithdrawalAsOne(); }
    public WithdrawalCQ xdfgetConditionQueryWithdrawalAsOne() {
        String prop = "withdrawalAsOne";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryWithdrawalAsOne()); xsetupOuterJoinWithdrawalAsOne(); }
        return xgetQueRlMap(prop);
    }
    protected WithdrawalCQ xcreateQueryWithdrawalAsOne() {
        String nrp = xresolveNRP("MEMBER", "withdrawalAsOne"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new WithdrawalCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "withdrawalAsOne", nrp);
    }
    protected void xsetupOuterJoinWithdrawalAsOne() { xregOutJo("withdrawalAsOne"); }
    public boolean hasConditionQueryWithdrawalAsOne() { return xhasQueRlMap("withdrawalAsOne"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, MemberCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(MemberCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, MemberCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(MemberCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, MemberCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(MemberCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, MemberCQ> _myselfExistsMap;
    public Map<String, MemberCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(MemberCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, MemberCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(MemberCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MemberCB.class.getName(); }
    protected String xCQ() { return MemberCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
