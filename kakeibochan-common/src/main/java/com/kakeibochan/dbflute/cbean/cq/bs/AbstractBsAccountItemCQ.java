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

import java.util.*;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.ordering.*;
import org.dbflute.cbean.scoping.*;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.dbmeta.DBMetaProvider;
import com.kakeibochan.dbflute.allcommon.*;
import com.kakeibochan.dbflute.cbean.*;
import com.kakeibochan.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of ACCOUNT_ITEM.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsAccountItemCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsAccountItemCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider();
    }

    public String asTableDbName() {
        return "ACCOUNT_ITEM";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (勘定科目ID)ACCOUNT_ITEM_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param accountItemId The value of accountItemId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAccountItemId_Equal(Long accountItemId) {
        doSetAccountItemId_Equal(accountItemId);
    }

    protected void doSetAccountItemId_Equal(Long accountItemId) {
        regAccountItemId(CK_EQ, accountItemId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (勘定科目ID)ACCOUNT_ITEM_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param accountItemId The value of accountItemId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAccountItemId_NotEqual(Long accountItemId) {
        doSetAccountItemId_NotEqual(accountItemId);
    }

    protected void doSetAccountItemId_NotEqual(Long accountItemId) {
        regAccountItemId(CK_NES, accountItemId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (勘定科目ID)ACCOUNT_ITEM_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param accountItemId The value of accountItemId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAccountItemId_GreaterThan(Long accountItemId) {
        regAccountItemId(CK_GT, accountItemId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (勘定科目ID)ACCOUNT_ITEM_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param accountItemId The value of accountItemId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAccountItemId_LessThan(Long accountItemId) {
        regAccountItemId(CK_LT, accountItemId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (勘定科目ID)ACCOUNT_ITEM_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param accountItemId The value of accountItemId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAccountItemId_GreaterEqual(Long accountItemId) {
        regAccountItemId(CK_GE, accountItemId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (勘定科目ID)ACCOUNT_ITEM_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param accountItemId The value of accountItemId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAccountItemId_LessEqual(Long accountItemId) {
        regAccountItemId(CK_LE, accountItemId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (勘定科目ID)ACCOUNT_ITEM_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of accountItemId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of accountItemId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setAccountItemId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setAccountItemId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (勘定科目ID)ACCOUNT_ITEM_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of accountItemId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of accountItemId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setAccountItemId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAccountItemId(), "ACCOUNT_ITEM_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (勘定科目ID)ACCOUNT_ITEM_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param accountItemIdList The collection of accountItemId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAccountItemId_InScope(Collection<Long> accountItemIdList) {
        doSetAccountItemId_InScope(accountItemIdList);
    }

    protected void doSetAccountItemId_InScope(Collection<Long> accountItemIdList) {
        regINS(CK_INS, cTL(accountItemIdList), xgetCValueAccountItemId(), "ACCOUNT_ITEM_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (勘定科目ID)ACCOUNT_ITEM_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param accountItemIdList The collection of accountItemId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAccountItemId_NotInScope(Collection<Long> accountItemIdList) {
        doSetAccountItemId_NotInScope(accountItemIdList);
    }

    protected void doSetAccountItemId_NotInScope(Collection<Long> accountItemIdList) {
        regINS(CK_NINS, cTL(accountItemIdList), xgetCValueAccountItemId(), "ACCOUNT_ITEM_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select ACCOUNT_ITEM_ID from RECORD where ...)} <br>
     * (明細)RECORD by ACCOUNT_ITEM_ID, named 'recordAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsRecord</span>(recordCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     recordCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of RecordList for 'exists'. (NotNull)
     */
    public void existsRecord(SubQuery<RecordCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        RecordCB cb = new RecordCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepAccountItemId_ExistsReferrer_RecordList(cb.query());
        registerExistsReferrer(cb.query(), "ACCOUNT_ITEM_ID", "ACCOUNT_ITEM_ID", pp, "recordList");
    }
    public abstract String keepAccountItemId_ExistsReferrer_RecordList(RecordCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select ACCOUNT_ITEM_ID from RECORD where ...)} <br>
     * (明細)RECORD by ACCOUNT_ITEM_ID, named 'recordAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsRecord</span>(recordCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     recordCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of AccountItemId_NotExistsReferrer_RecordList for 'not exists'. (NotNull)
     */
    public void notExistsRecord(SubQuery<RecordCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        RecordCB cb = new RecordCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepAccountItemId_NotExistsReferrer_RecordList(cb.query());
        registerNotExistsReferrer(cb.query(), "ACCOUNT_ITEM_ID", "ACCOUNT_ITEM_ID", pp, "recordList");
    }
    public abstract String keepAccountItemId_NotExistsReferrer_RecordList(RecordCQ sq);

    public void xsderiveRecordList(String fn, SubQuery<RecordCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        RecordCB cb = new RecordCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepAccountItemId_SpecifyDerivedReferrer_RecordList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "ACCOUNT_ITEM_ID", "ACCOUNT_ITEM_ID", pp, "recordList", al, op);
    }
    public abstract String keepAccountItemId_SpecifyDerivedReferrer_RecordList(RecordCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from RECORD where ...)} <br>
     * (明細)RECORD by ACCOUNT_ITEM_ID, named 'recordAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedRecord()</span>.<span style="color: #CC4747">max</span>(recordCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     recordCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     recordCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<RecordCB> derivedRecord() {
        return xcreateQDRFunctionRecordList();
    }
    protected HpQDRFunction<RecordCB> xcreateQDRFunctionRecordList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveRecordList(fn, sq, rd, vl, op));
    }
    public void xqderiveRecordList(String fn, SubQuery<RecordCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        RecordCB cb = new RecordCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepAccountItemId_QueryDerivedReferrer_RecordList(cb.query()); String prpp = keepAccountItemId_QueryDerivedReferrer_RecordListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "ACCOUNT_ITEM_ID", "ACCOUNT_ITEM_ID", sqpp, "recordList", rd, vl, prpp, op);
    }
    public abstract String keepAccountItemId_QueryDerivedReferrer_RecordList(RecordCQ sq);
    public abstract String keepAccountItemId_QueryDerivedReferrer_RecordListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (勘定科目ID)ACCOUNT_ITEM_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setAccountItemId_IsNull() { regAccountItemId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (勘定科目ID)ACCOUNT_ITEM_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setAccountItemId_IsNotNull() { regAccountItemId(CK_ISNN, DOBJ); }

    protected void regAccountItemId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAccountItemId(), "ACCOUNT_ITEM_ID"); }
    protected abstract ConditionValue xgetCValueAccountItemId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (会員ID)MEMBER_ID: {IX, NotNull, BIGINT(19), FK to MEMBER}
     * @param memberId The value of memberId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberId_Equal(Long memberId) {
        doSetMemberId_Equal(memberId);
    }

    protected void doSetMemberId_Equal(Long memberId) {
        regMemberId(CK_EQ, memberId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (会員ID)MEMBER_ID: {IX, NotNull, BIGINT(19), FK to MEMBER}
     * @param memberId The value of memberId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberId_NotEqual(Long memberId) {
        doSetMemberId_NotEqual(memberId);
    }

    protected void doSetMemberId_NotEqual(Long memberId) {
        regMemberId(CK_NES, memberId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (会員ID)MEMBER_ID: {IX, NotNull, BIGINT(19), FK to MEMBER}
     * @param memberId The value of memberId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberId_GreaterThan(Long memberId) {
        regMemberId(CK_GT, memberId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (会員ID)MEMBER_ID: {IX, NotNull, BIGINT(19), FK to MEMBER}
     * @param memberId The value of memberId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberId_LessThan(Long memberId) {
        regMemberId(CK_LT, memberId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (会員ID)MEMBER_ID: {IX, NotNull, BIGINT(19), FK to MEMBER}
     * @param memberId The value of memberId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberId_GreaterEqual(Long memberId) {
        regMemberId(CK_GE, memberId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (会員ID)MEMBER_ID: {IX, NotNull, BIGINT(19), FK to MEMBER}
     * @param memberId The value of memberId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberId_LessEqual(Long memberId) {
        regMemberId(CK_LE, memberId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (会員ID)MEMBER_ID: {IX, NotNull, BIGINT(19), FK to MEMBER}
     * @param minNumber The min number of memberId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of memberId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setMemberId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setMemberId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (会員ID)MEMBER_ID: {IX, NotNull, BIGINT(19), FK to MEMBER}
     * @param minNumber The min number of memberId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of memberId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setMemberId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMemberId(), "MEMBER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (会員ID)MEMBER_ID: {IX, NotNull, BIGINT(19), FK to MEMBER}
     * @param memberIdList The collection of memberId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemberId_InScope(Collection<Long> memberIdList) {
        doSetMemberId_InScope(memberIdList);
    }

    protected void doSetMemberId_InScope(Collection<Long> memberIdList) {
        regINS(CK_INS, cTL(memberIdList), xgetCValueMemberId(), "MEMBER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (会員ID)MEMBER_ID: {IX, NotNull, BIGINT(19), FK to MEMBER}
     * @param memberIdList The collection of memberId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemberId_NotInScope(Collection<Long> memberIdList) {
        doSetMemberId_NotInScope(memberIdList);
    }

    protected void doSetMemberId_NotInScope(Collection<Long> memberIdList) {
        regINS(CK_NINS, cTL(memberIdList), xgetCValueMemberId(), "MEMBER_ID");
    }

    protected void regMemberId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMemberId(), "MEMBER_ID"); }
    protected abstract ConditionValue xgetCValueMemberId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (カテゴリ種別)CATEGORY_TYPE: {NotNull, VARCHAR(10), classification=CategoryType}
     * @param categoryType The value of categoryType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    protected void setCategoryType_Equal(String categoryType) {
        doSetCategoryType_Equal(fRES(categoryType));
    }

    /**
     * Equal(=). As CategoryType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (カテゴリ種別)CATEGORY_TYPE: {NotNull, VARCHAR(10), classification=CategoryType} <br>
     * 勘定科目の種別を表す区分値
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setCategoryType_Equal_AsCategoryType(CDef.CategoryType cdef) {
        doSetCategoryType_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As Income (INCOME). And OnlyOnceRegistered. <br>
     * 収入: 収入を表す
     */
    public void setCategoryType_Equal_Income() {
        setCategoryType_Equal_AsCategoryType(CDef.CategoryType.Income);
    }

    /**
     * Equal(=). As Spend (SPEND). And OnlyOnceRegistered. <br>
     * 支出: 支出を表す
     */
    public void setCategoryType_Equal_Spend() {
        setCategoryType_Equal_AsCategoryType(CDef.CategoryType.Spend);
    }

    /**
     * Equal(=). As Move (MOVE). And OnlyOnceRegistered. <br>
     * 振替: 振替を表す
     */
    public void setCategoryType_Equal_Move() {
        setCategoryType_Equal_AsCategoryType(CDef.CategoryType.Move);
    }

    protected void doSetCategoryType_Equal(String categoryType) {
        regCategoryType(CK_EQ, categoryType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (カテゴリ種別)CATEGORY_TYPE: {NotNull, VARCHAR(10), classification=CategoryType}
     * @param categoryType The value of categoryType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    protected void setCategoryType_NotEqual(String categoryType) {
        doSetCategoryType_NotEqual(fRES(categoryType));
    }

    /**
     * NotEqual(&lt;&gt;). As CategoryType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (カテゴリ種別)CATEGORY_TYPE: {NotNull, VARCHAR(10), classification=CategoryType} <br>
     * 勘定科目の種別を表す区分値
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setCategoryType_NotEqual_AsCategoryType(CDef.CategoryType cdef) {
        doSetCategoryType_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As Income (INCOME). And OnlyOnceRegistered. <br>
     * 収入: 収入を表す
     */
    public void setCategoryType_NotEqual_Income() {
        setCategoryType_NotEqual_AsCategoryType(CDef.CategoryType.Income);
    }

    /**
     * NotEqual(&lt;&gt;). As Spend (SPEND). And OnlyOnceRegistered. <br>
     * 支出: 支出を表す
     */
    public void setCategoryType_NotEqual_Spend() {
        setCategoryType_NotEqual_AsCategoryType(CDef.CategoryType.Spend);
    }

    /**
     * NotEqual(&lt;&gt;). As Move (MOVE). And OnlyOnceRegistered. <br>
     * 振替: 振替を表す
     */
    public void setCategoryType_NotEqual_Move() {
        setCategoryType_NotEqual_AsCategoryType(CDef.CategoryType.Move);
    }

    protected void doSetCategoryType_NotEqual(String categoryType) {
        regCategoryType(CK_NES, categoryType);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (カテゴリ種別)CATEGORY_TYPE: {NotNull, VARCHAR(10), classification=CategoryType}
     * @param categoryTypeList The collection of categoryType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    protected void setCategoryType_InScope(Collection<String> categoryTypeList) {
        doSetCategoryType_InScope(categoryTypeList);
    }

    /**
     * InScope {in ('a', 'b')}. As CategoryType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (カテゴリ種別)CATEGORY_TYPE: {NotNull, VARCHAR(10), classification=CategoryType} <br>
     * 勘定科目の種別を表す区分値
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCategoryType_InScope_AsCategoryType(Collection<CDef.CategoryType> cdefList) {
        doSetCategoryType_InScope(cTStrL(cdefList));
    }

    protected void doSetCategoryType_InScope(Collection<String> categoryTypeList) {
        regINS(CK_INS, cTL(categoryTypeList), xgetCValueCategoryType(), "CATEGORY_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (カテゴリ種別)CATEGORY_TYPE: {NotNull, VARCHAR(10), classification=CategoryType}
     * @param categoryTypeList The collection of categoryType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    protected void setCategoryType_NotInScope(Collection<String> categoryTypeList) {
        doSetCategoryType_NotInScope(categoryTypeList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As CategoryType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (カテゴリ種別)CATEGORY_TYPE: {NotNull, VARCHAR(10), classification=CategoryType} <br>
     * 勘定科目の種別を表す区分値
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCategoryType_NotInScope_AsCategoryType(Collection<CDef.CategoryType> cdefList) {
        doSetCategoryType_NotInScope(cTStrL(cdefList));
    }

    protected void doSetCategoryType_NotInScope(Collection<String> categoryTypeList) {
        regINS(CK_NINS, cTL(categoryTypeList), xgetCValueCategoryType(), "CATEGORY_TYPE");
    }

    protected void regCategoryType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCategoryType(), "CATEGORY_TYPE"); }
    protected abstract ConditionValue xgetCValueCategoryType();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (勘定科目名)ACCOUNT_TITLE: {NotNull, VARCHAR(200)}
     * @param accountTitle The value of accountTitle as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAccountTitle_Equal(String accountTitle) {
        doSetAccountTitle_Equal(fRES(accountTitle));
    }

    protected void doSetAccountTitle_Equal(String accountTitle) {
        regAccountTitle(CK_EQ, accountTitle);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (勘定科目名)ACCOUNT_TITLE: {NotNull, VARCHAR(200)}
     * @param accountTitle The value of accountTitle as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAccountTitle_NotEqual(String accountTitle) {
        doSetAccountTitle_NotEqual(fRES(accountTitle));
    }

    protected void doSetAccountTitle_NotEqual(String accountTitle) {
        regAccountTitle(CK_NES, accountTitle);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (勘定科目名)ACCOUNT_TITLE: {NotNull, VARCHAR(200)}
     * @param accountTitleList The collection of accountTitle as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAccountTitle_InScope(Collection<String> accountTitleList) {
        doSetAccountTitle_InScope(accountTitleList);
    }

    protected void doSetAccountTitle_InScope(Collection<String> accountTitleList) {
        regINS(CK_INS, cTL(accountTitleList), xgetCValueAccountTitle(), "ACCOUNT_TITLE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (勘定科目名)ACCOUNT_TITLE: {NotNull, VARCHAR(200)}
     * @param accountTitleList The collection of accountTitle as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAccountTitle_NotInScope(Collection<String> accountTitleList) {
        doSetAccountTitle_NotInScope(accountTitleList);
    }

    protected void doSetAccountTitle_NotInScope(Collection<String> accountTitleList) {
        regINS(CK_NINS, cTL(accountTitleList), xgetCValueAccountTitle(), "ACCOUNT_TITLE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (勘定科目名)ACCOUNT_TITLE: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setAccountTitle_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param accountTitle The value of accountTitle as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setAccountTitle_LikeSearch(String accountTitle, ConditionOptionCall<LikeSearchOption> opLambda) {
        setAccountTitle_LikeSearch(accountTitle, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (勘定科目名)ACCOUNT_TITLE: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setAccountTitle_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param accountTitle The value of accountTitle as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setAccountTitle_LikeSearch(String accountTitle, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(accountTitle), xgetCValueAccountTitle(), "ACCOUNT_TITLE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (勘定科目名)ACCOUNT_TITLE: {NotNull, VARCHAR(200)}
     * @param accountTitle The value of accountTitle as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setAccountTitle_NotLikeSearch(String accountTitle, ConditionOptionCall<LikeSearchOption> opLambda) {
        setAccountTitle_NotLikeSearch(accountTitle, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (勘定科目名)ACCOUNT_TITLE: {NotNull, VARCHAR(200)}
     * @param accountTitle The value of accountTitle as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setAccountTitle_NotLikeSearch(String accountTitle, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(accountTitle), xgetCValueAccountTitle(), "ACCOUNT_TITLE", likeSearchOption);
    }

    protected void regAccountTitle(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAccountTitle(), "ACCOUNT_TITLE"); }
    protected abstract ConditionValue xgetCValueAccountTitle();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (削除フラグ)DEL_FLG: {NotNull, CHAR(1), classification=Flg}
     * @param delFlg The value of delFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    protected void setDelFlg_Equal(String delFlg) {
        doSetDelFlg_Equal(fRES(delFlg));
    }

    /**
     * Equal(=). As Flg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (削除フラグ)DEL_FLG: {NotNull, CHAR(1), classification=Flg} <br>
     * フラグ。共通的なフラグを示す区分値で、基本的にXxxフラグと呼べるものに関連付けられる。
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setDelFlg_Equal_AsFlg(CDef.Flg cdef) {
        doSetDelFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As boolean for Flg. <br>
     * (削除フラグ)DEL_FLG: {NotNull, CHAR(1), classification=Flg} <br>
     * フラグ。共通的なフラグを示す区分値で、基本的にXxxフラグと呼べるものに関連付けられる。
     * @param determination The determination, true or false. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelFlg_Equal_AsBoolean(Boolean determination) {
        setDelFlg_Equal_AsFlg(CDef.Flg.codeOf(determination));
    }

    /**
     * Equal(=). As True (Y). And OnlyOnceRegistered. <br>
     * Yes: フラグがTrue(Yes)であることを示す
     */
    public void setDelFlg_Equal_True() {
        setDelFlg_Equal_AsFlg(CDef.Flg.True);
    }

    /**
     * Equal(=). As False (N). And OnlyOnceRegistered. <br>
     * No: フラグがFalse(No)であることを示す
     */
    public void setDelFlg_Equal_False() {
        setDelFlg_Equal_AsFlg(CDef.Flg.False);
    }

    protected void doSetDelFlg_Equal(String delFlg) {
        regDelFlg(CK_EQ, delFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (削除フラグ)DEL_FLG: {NotNull, CHAR(1), classification=Flg}
     * @param delFlg The value of delFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    protected void setDelFlg_NotEqual(String delFlg) {
        doSetDelFlg_NotEqual(fRES(delFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As Flg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (削除フラグ)DEL_FLG: {NotNull, CHAR(1), classification=Flg} <br>
     * フラグ。共通的なフラグを示す区分値で、基本的にXxxフラグと呼べるものに関連付けられる。
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setDelFlg_NotEqual_AsFlg(CDef.Flg cdef) {
        doSetDelFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As True (Y). And OnlyOnceRegistered. <br>
     * Yes: フラグがTrue(Yes)であることを示す
     */
    public void setDelFlg_NotEqual_True() {
        setDelFlg_NotEqual_AsFlg(CDef.Flg.True);
    }

    /**
     * NotEqual(&lt;&gt;). As False (N). And OnlyOnceRegistered. <br>
     * No: フラグがFalse(No)であることを示す
     */
    public void setDelFlg_NotEqual_False() {
        setDelFlg_NotEqual_AsFlg(CDef.Flg.False);
    }

    protected void doSetDelFlg_NotEqual(String delFlg) {
        regDelFlg(CK_NES, delFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (削除フラグ)DEL_FLG: {NotNull, CHAR(1), classification=Flg}
     * @param delFlgList The collection of delFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    protected void setDelFlg_InScope(Collection<String> delFlgList) {
        doSetDelFlg_InScope(delFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As Flg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (削除フラグ)DEL_FLG: {NotNull, CHAR(1), classification=Flg} <br>
     * フラグ。共通的なフラグを示す区分値で、基本的にXxxフラグと呼べるものに関連付けられる。
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelFlg_InScope_AsFlg(Collection<CDef.Flg> cdefList) {
        doSetDelFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetDelFlg_InScope(Collection<String> delFlgList) {
        regINS(CK_INS, cTL(delFlgList), xgetCValueDelFlg(), "DEL_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (削除フラグ)DEL_FLG: {NotNull, CHAR(1), classification=Flg}
     * @param delFlgList The collection of delFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    protected void setDelFlg_NotInScope(Collection<String> delFlgList) {
        doSetDelFlg_NotInScope(delFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As Flg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (削除フラグ)DEL_FLG: {NotNull, CHAR(1), classification=Flg} <br>
     * フラグ。共通的なフラグを示す区分値で、基本的にXxxフラグと呼べるものに関連付けられる。
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelFlg_NotInScope_AsFlg(Collection<CDef.Flg> cdefList) {
        doSetDelFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetDelFlg_NotInScope(Collection<String> delFlgList) {
        regINS(CK_NINS, cTL(delFlgList), xgetCValueDelFlg(), "DEL_FLG");
    }

    protected void regDelFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelFlg(), "DEL_FLG"); }
    protected abstract ConditionValue xgetCValueDelFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @param registerDatetime The value of registerDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_Equal(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_EQ,  registerDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * <pre>e.g. setRegisterDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setRegisterDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setRegisterDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * <pre>e.g. setRegisterDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setRegisterDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "REGISTER_DATETIME"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueRegisterDatetime(), nm, op);
    }

    protected void regRegisterDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRegisterDatetime(), "REGISTER_DATETIME"); }
    protected abstract ConditionValue xgetCValueRegisterDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)}
     * @param registerUser The value of registerUser as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegisterUser_Equal(String registerUser) {
        doSetRegisterUser_Equal(fRES(registerUser));
    }

    protected void doSetRegisterUser_Equal(String registerUser) {
        regRegisterUser(CK_EQ, registerUser);
    }

    protected void regRegisterUser(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRegisterUser(), "REGISTER_USER"); }
    protected abstract ConditionValue xgetCValueRegisterUser();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @param updateDatetime The value of updateDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_Equal(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_EQ,  updateDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * <pre>e.g. setUpdateDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setUpdateDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setUpdateDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * <pre>e.g. setUpdateDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setUpdateDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "UPDATE_DATETIME"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueUpdateDatetime(), nm, op);
    }

    protected void regUpdateDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdateDatetime(), "UPDATE_DATETIME"); }
    protected abstract ConditionValue xgetCValueUpdateDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (更新ユーザー)UPDATE_USER: {NotNull, VARCHAR(200)}
     * @param updateUser The value of updateUser as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdateUser_Equal(String updateUser) {
        doSetUpdateUser_Equal(fRES(updateUser));
    }

    protected void doSetUpdateUser_Equal(String updateUser) {
        regUpdateUser(CK_EQ, updateUser);
    }

    protected void regUpdateUser(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdateUser(), "UPDATE_USER"); }
    protected abstract ConditionValue xgetCValueUpdateUser();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (バージョン番号)VERSION_NO: {NotNull, BIGINT(19)}
     * @param versionNo The value of versionNo as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setVersionNo_Equal(Long versionNo) {
        doSetVersionNo_Equal(versionNo);
    }

    protected void doSetVersionNo_Equal(Long versionNo) {
        regVersionNo(CK_EQ, versionNo);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (バージョン番号)VERSION_NO: {NotNull, BIGINT(19)}
     * @param minNumber The min number of versionNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of versionNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setVersionNo_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setVersionNo_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (バージョン番号)VERSION_NO: {NotNull, BIGINT(19)}
     * @param minNumber The min number of versionNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of versionNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setVersionNo_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueVersionNo(), "VERSION_NO", rangeOfOption);
    }

    protected void regVersionNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueVersionNo(), "VERSION_NO"); }
    protected abstract ConditionValue xgetCValueVersionNo();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO = (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<AccountItemCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, AccountItemCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<AccountItemCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, AccountItemCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<AccountItemCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, AccountItemCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<AccountItemCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, AccountItemCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<AccountItemCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, AccountItemCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;AccountItemCB&gt;() {
     *     public void query(AccountItemCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<AccountItemCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, AccountItemCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        AccountItemCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(AccountItemCQ sq);

    protected AccountItemCB xcreateScalarConditionCB() {
        AccountItemCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected AccountItemCB xcreateScalarConditionPartitionByCB() {
        AccountItemCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<AccountItemCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        AccountItemCB cb = new AccountItemCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "ACCOUNT_ITEM_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(AccountItemCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<AccountItemCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(AccountItemCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        AccountItemCB cb = new AccountItemCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "ACCOUNT_ITEM_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(AccountItemCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<AccountItemCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        AccountItemCB cb = new AccountItemCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(AccountItemCQ sq);

    // ===================================================================================
    //                                                                        Manual Order
    //                                                                        ============
    /**
     * Order along manual ordering information.
     * <pre>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * <p>This function with Union is unsupported!</p>
     * <p>The order values are bound (treated as bind parameter).</p>
     * @param opLambda The callback for option of manual-order containing order values. (NotNull)
     */
    public void withManualOrder(ManualOrderOptionCall opLambda) { // is user public!
        xdoWithManualOrder(cMOO(opLambda));
    }

    // ===================================================================================
    //                                                                    Small Adjustment
    //                                                                    ================
    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected AccountItemCB newMyCB() {
        return new AccountItemCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return AccountItemCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
