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
 * The abstract condition-query of MEMBER.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsMemberCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsMemberCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "MEMBER";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (会員ID)MEMBER_ID: {PK, ID, NotNull, BIGINT(19)}
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
     * (会員ID)MEMBER_ID: {PK, ID, NotNull, BIGINT(19)}
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
     * (会員ID)MEMBER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param memberId The value of memberId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberId_GreaterThan(Long memberId) {
        regMemberId(CK_GT, memberId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (会員ID)MEMBER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param memberId The value of memberId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberId_LessThan(Long memberId) {
        regMemberId(CK_LT, memberId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (会員ID)MEMBER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param memberId The value of memberId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberId_GreaterEqual(Long memberId) {
        regMemberId(CK_GE, memberId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (会員ID)MEMBER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param memberId The value of memberId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberId_LessEqual(Long memberId) {
        regMemberId(CK_LE, memberId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (会員ID)MEMBER_ID: {PK, ID, NotNull, BIGINT(19)}
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
     * (会員ID)MEMBER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of memberId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of memberId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setMemberId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMemberId(), "MEMBER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (会員ID)MEMBER_ID: {PK, ID, NotNull, BIGINT(19)}
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
     * (会員ID)MEMBER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param memberIdList The collection of memberId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemberId_NotInScope(Collection<Long> memberIdList) {
        doSetMemberId_NotInScope(memberIdList);
    }

    protected void doSetMemberId_NotInScope(Collection<Long> memberIdList) {
        regINS(CK_NINS, cTL(memberIdList), xgetCValueMemberId(), "MEMBER_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select MEMBER_ID from ACCOUNT_ITEM where ...)} <br>
     * (勘定科目)ACCOUNT_ITEM by MEMBER_ID, named 'accountItemAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsAccountItem</span>(itemCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     itemCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of AccountItemList for 'exists'. (NotNull)
     */
    public void existsAccountItem(SubQuery<AccountItemCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        AccountItemCB cb = new AccountItemCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMemberId_ExistsReferrer_AccountItemList(cb.query());
        registerExistsReferrer(cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "accountItemList");
    }
    public abstract String keepMemberId_ExistsReferrer_AccountItemList(AccountItemCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select MEMBER_ID from ASSET where ...)} <br>
     * (資産)ASSET by MEMBER_ID, named 'assetAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsAsset</span>(assetCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     assetCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of AssetList for 'exists'. (NotNull)
     */
    public void existsAsset(SubQuery<AssetCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        AssetCB cb = new AssetCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMemberId_ExistsReferrer_AssetList(cb.query());
        registerExistsReferrer(cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "assetList");
    }
    public abstract String keepMemberId_ExistsReferrer_AssetList(AssetCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select MEMBER_ID from RECORD where ...)} <br>
     * (明細)RECORD by MEMBER_ID, named 'recordAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMemberId_ExistsReferrer_RecordList(cb.query());
        registerExistsReferrer(cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "recordList");
    }
    public abstract String keepMemberId_ExistsReferrer_RecordList(RecordCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select MEMBER_ID from ACCOUNT_ITEM where ...)} <br>
     * (勘定科目)ACCOUNT_ITEM by MEMBER_ID, named 'accountItemAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsAccountItem</span>(itemCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     itemCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MemberId_NotExistsReferrer_AccountItemList for 'not exists'. (NotNull)
     */
    public void notExistsAccountItem(SubQuery<AccountItemCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        AccountItemCB cb = new AccountItemCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMemberId_NotExistsReferrer_AccountItemList(cb.query());
        registerNotExistsReferrer(cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "accountItemList");
    }
    public abstract String keepMemberId_NotExistsReferrer_AccountItemList(AccountItemCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select MEMBER_ID from ASSET where ...)} <br>
     * (資産)ASSET by MEMBER_ID, named 'assetAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsAsset</span>(assetCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     assetCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MemberId_NotExistsReferrer_AssetList for 'not exists'. (NotNull)
     */
    public void notExistsAsset(SubQuery<AssetCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        AssetCB cb = new AssetCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMemberId_NotExistsReferrer_AssetList(cb.query());
        registerNotExistsReferrer(cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "assetList");
    }
    public abstract String keepMemberId_NotExistsReferrer_AssetList(AssetCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select MEMBER_ID from RECORD where ...)} <br>
     * (明細)RECORD by MEMBER_ID, named 'recordAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsRecord</span>(recordCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     recordCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MemberId_NotExistsReferrer_RecordList for 'not exists'. (NotNull)
     */
    public void notExistsRecord(SubQuery<RecordCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        RecordCB cb = new RecordCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMemberId_NotExistsReferrer_RecordList(cb.query());
        registerNotExistsReferrer(cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "recordList");
    }
    public abstract String keepMemberId_NotExistsReferrer_RecordList(RecordCQ sq);

    public void xsderiveAccountItemList(String fn, SubQuery<AccountItemCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        AccountItemCB cb = new AccountItemCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepMemberId_SpecifyDerivedReferrer_AccountItemList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "accountItemList", al, op);
    }
    public abstract String keepMemberId_SpecifyDerivedReferrer_AccountItemList(AccountItemCQ sq);

    public void xsderiveAssetList(String fn, SubQuery<AssetCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        AssetCB cb = new AssetCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepMemberId_SpecifyDerivedReferrer_AssetList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "assetList", al, op);
    }
    public abstract String keepMemberId_SpecifyDerivedReferrer_AssetList(AssetCQ sq);

    public void xsderiveRecordList(String fn, SubQuery<RecordCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        RecordCB cb = new RecordCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepMemberId_SpecifyDerivedReferrer_RecordList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "recordList", al, op);
    }
    public abstract String keepMemberId_SpecifyDerivedReferrer_RecordList(RecordCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from ACCOUNT_ITEM where ...)} <br>
     * (勘定科目)ACCOUNT_ITEM by MEMBER_ID, named 'accountItemAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedAccountItem()</span>.<span style="color: #CC4747">max</span>(itemCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     itemCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     itemCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<AccountItemCB> derivedAccountItem() {
        return xcreateQDRFunctionAccountItemList();
    }
    protected HpQDRFunction<AccountItemCB> xcreateQDRFunctionAccountItemList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveAccountItemList(fn, sq, rd, vl, op));
    }
    public void xqderiveAccountItemList(String fn, SubQuery<AccountItemCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        AccountItemCB cb = new AccountItemCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepMemberId_QueryDerivedReferrer_AccountItemList(cb.query()); String prpp = keepMemberId_QueryDerivedReferrer_AccountItemListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "MEMBER_ID", "MEMBER_ID", sqpp, "accountItemList", rd, vl, prpp, op);
    }
    public abstract String keepMemberId_QueryDerivedReferrer_AccountItemList(AccountItemCQ sq);
    public abstract String keepMemberId_QueryDerivedReferrer_AccountItemListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from ASSET where ...)} <br>
     * (資産)ASSET by MEMBER_ID, named 'assetAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedAsset()</span>.<span style="color: #CC4747">max</span>(assetCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     assetCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     assetCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<AssetCB> derivedAsset() {
        return xcreateQDRFunctionAssetList();
    }
    protected HpQDRFunction<AssetCB> xcreateQDRFunctionAssetList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveAssetList(fn, sq, rd, vl, op));
    }
    public void xqderiveAssetList(String fn, SubQuery<AssetCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        AssetCB cb = new AssetCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepMemberId_QueryDerivedReferrer_AssetList(cb.query()); String prpp = keepMemberId_QueryDerivedReferrer_AssetListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "MEMBER_ID", "MEMBER_ID", sqpp, "assetList", rd, vl, prpp, op);
    }
    public abstract String keepMemberId_QueryDerivedReferrer_AssetList(AssetCQ sq);
    public abstract String keepMemberId_QueryDerivedReferrer_AssetListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from RECORD where ...)} <br>
     * (明細)RECORD by MEMBER_ID, named 'recordAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepMemberId_QueryDerivedReferrer_RecordList(cb.query()); String prpp = keepMemberId_QueryDerivedReferrer_RecordListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "MEMBER_ID", "MEMBER_ID", sqpp, "recordList", rd, vl, prpp, op);
    }
    public abstract String keepMemberId_QueryDerivedReferrer_RecordList(RecordCQ sq);
    public abstract String keepMemberId_QueryDerivedReferrer_RecordListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (会員ID)MEMBER_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setMemberId_IsNull() { regMemberId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (会員ID)MEMBER_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setMemberId_IsNotNull() { regMemberId(CK_ISNN, DOBJ); }

    protected void regMemberId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMemberId(), "MEMBER_ID"); }
    protected abstract ConditionValue xgetCValueMemberId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (メールアドレス)MAIL_ADDRESS: {UQ, NotNull, VARCHAR(200)}
     * @param mailAddress The value of mailAddress as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMailAddress_Equal(String mailAddress) {
        doSetMailAddress_Equal(fRES(mailAddress));
    }

    protected void doSetMailAddress_Equal(String mailAddress) {
        regMailAddress(CK_EQ, mailAddress);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (メールアドレス)MAIL_ADDRESS: {UQ, NotNull, VARCHAR(200)}
     * @param mailAddress The value of mailAddress as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMailAddress_NotEqual(String mailAddress) {
        doSetMailAddress_NotEqual(fRES(mailAddress));
    }

    protected void doSetMailAddress_NotEqual(String mailAddress) {
        regMailAddress(CK_NES, mailAddress);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (メールアドレス)MAIL_ADDRESS: {UQ, NotNull, VARCHAR(200)}
     * @param mailAddressList The collection of mailAddress as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMailAddress_InScope(Collection<String> mailAddressList) {
        doSetMailAddress_InScope(mailAddressList);
    }

    protected void doSetMailAddress_InScope(Collection<String> mailAddressList) {
        regINS(CK_INS, cTL(mailAddressList), xgetCValueMailAddress(), "MAIL_ADDRESS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (メールアドレス)MAIL_ADDRESS: {UQ, NotNull, VARCHAR(200)}
     * @param mailAddressList The collection of mailAddress as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMailAddress_NotInScope(Collection<String> mailAddressList) {
        doSetMailAddress_NotInScope(mailAddressList);
    }

    protected void doSetMailAddress_NotInScope(Collection<String> mailAddressList) {
        regINS(CK_NINS, cTL(mailAddressList), xgetCValueMailAddress(), "MAIL_ADDRESS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (メールアドレス)MAIL_ADDRESS: {UQ, NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setMailAddress_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param mailAddress The value of mailAddress as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setMailAddress_LikeSearch(String mailAddress, ConditionOptionCall<LikeSearchOption> opLambda) {
        setMailAddress_LikeSearch(mailAddress, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (メールアドレス)MAIL_ADDRESS: {UQ, NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setMailAddress_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param mailAddress The value of mailAddress as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setMailAddress_LikeSearch(String mailAddress, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(mailAddress), xgetCValueMailAddress(), "MAIL_ADDRESS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (メールアドレス)MAIL_ADDRESS: {UQ, NotNull, VARCHAR(200)}
     * @param mailAddress The value of mailAddress as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setMailAddress_NotLikeSearch(String mailAddress, ConditionOptionCall<LikeSearchOption> opLambda) {
        setMailAddress_NotLikeSearch(mailAddress, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (メールアドレス)MAIL_ADDRESS: {UQ, NotNull, VARCHAR(200)}
     * @param mailAddress The value of mailAddress as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setMailAddress_NotLikeSearch(String mailAddress, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(mailAddress), xgetCValueMailAddress(), "MAIL_ADDRESS", likeSearchOption);
    }

    protected void regMailAddress(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMailAddress(), "MAIL_ADDRESS"); }
    protected abstract ConditionValue xgetCValueMailAddress();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (名前)NAME: {NotNull, VARCHAR(200)}
     * @param name The value of name as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setName_Equal(String name) {
        doSetName_Equal(fRES(name));
    }

    protected void doSetName_Equal(String name) {
        regName(CK_EQ, name);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (名前)NAME: {NotNull, VARCHAR(200)}
     * @param name The value of name as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setName_NotEqual(String name) {
        doSetName_NotEqual(fRES(name));
    }

    protected void doSetName_NotEqual(String name) {
        regName(CK_NES, name);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (名前)NAME: {NotNull, VARCHAR(200)}
     * @param nameList The collection of name as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setName_InScope(Collection<String> nameList) {
        doSetName_InScope(nameList);
    }

    protected void doSetName_InScope(Collection<String> nameList) {
        regINS(CK_INS, cTL(nameList), xgetCValueName(), "NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (名前)NAME: {NotNull, VARCHAR(200)}
     * @param nameList The collection of name as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setName_NotInScope(Collection<String> nameList) {
        doSetName_NotInScope(nameList);
    }

    protected void doSetName_NotInScope(Collection<String> nameList) {
        regINS(CK_NINS, cTL(nameList), xgetCValueName(), "NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (名前)NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param name The value of name as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setName_LikeSearch(String name, ConditionOptionCall<LikeSearchOption> opLambda) {
        setName_LikeSearch(name, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (名前)NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param name The value of name as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setName_LikeSearch(String name, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(name), xgetCValueName(), "NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (名前)NAME: {NotNull, VARCHAR(200)}
     * @param name The value of name as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setName_NotLikeSearch(String name, ConditionOptionCall<LikeSearchOption> opLambda) {
        setName_NotLikeSearch(name, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (名前)NAME: {NotNull, VARCHAR(200)}
     * @param name The value of name as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setName_NotLikeSearch(String name, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(name), xgetCValueName(), "NAME", likeSearchOption);
    }

    protected void regName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueName(), "NAME"); }
    protected abstract ConditionValue xgetCValueName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (パスワード)PASSWORD: {NotNull, VARCHAR(200)}
     * @param password The value of password as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPassword_Equal(String password) {
        doSetPassword_Equal(fRES(password));
    }

    protected void doSetPassword_Equal(String password) {
        regPassword(CK_EQ, password);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (パスワード)PASSWORD: {NotNull, VARCHAR(200)}
     * @param password The value of password as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPassword_NotEqual(String password) {
        doSetPassword_NotEqual(fRES(password));
    }

    protected void doSetPassword_NotEqual(String password) {
        regPassword(CK_NES, password);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (パスワード)PASSWORD: {NotNull, VARCHAR(200)}
     * @param passwordList The collection of password as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPassword_InScope(Collection<String> passwordList) {
        doSetPassword_InScope(passwordList);
    }

    protected void doSetPassword_InScope(Collection<String> passwordList) {
        regINS(CK_INS, cTL(passwordList), xgetCValuePassword(), "PASSWORD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (パスワード)PASSWORD: {NotNull, VARCHAR(200)}
     * @param passwordList The collection of password as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPassword_NotInScope(Collection<String> passwordList) {
        doSetPassword_NotInScope(passwordList);
    }

    protected void doSetPassword_NotInScope(Collection<String> passwordList) {
        regINS(CK_NINS, cTL(passwordList), xgetCValuePassword(), "PASSWORD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (パスワード)PASSWORD: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setPassword_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param password The value of password as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPassword_LikeSearch(String password, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPassword_LikeSearch(password, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (パスワード)PASSWORD: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setPassword_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param password The value of password as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setPassword_LikeSearch(String password, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(password), xgetCValuePassword(), "PASSWORD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (パスワード)PASSWORD: {NotNull, VARCHAR(200)}
     * @param password The value of password as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPassword_NotLikeSearch(String password, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPassword_NotLikeSearch(password, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (パスワード)PASSWORD: {NotNull, VARCHAR(200)}
     * @param password The value of password as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setPassword_NotLikeSearch(String password, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(password), xgetCValuePassword(), "PASSWORD", likeSearchOption);
    }

    protected void regPassword(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePassword(), "PASSWORD"); }
    protected abstract ConditionValue xgetCValuePassword();

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
    public HpSLCFunction<MemberCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, MemberCB.class);
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
    public HpSLCFunction<MemberCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, MemberCB.class);
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
    public HpSLCFunction<MemberCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, MemberCB.class);
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
    public HpSLCFunction<MemberCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, MemberCB.class);
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
    public HpSLCFunction<MemberCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, MemberCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MemberCB&gt;() {
     *     public void query(MemberCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MemberCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, MemberCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        MemberCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(MemberCQ sq);

    protected MemberCB xcreateScalarConditionCB() {
        MemberCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected MemberCB xcreateScalarConditionPartitionByCB() {
        MemberCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<MemberCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MemberCB cb = new MemberCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "MEMBER_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(MemberCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<MemberCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(MemberCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MemberCB cb = new MemberCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "MEMBER_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(MemberCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<MemberCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MemberCB cb = new MemberCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(MemberCQ sq);

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
    protected MemberCB newMyCB() {
        return new MemberCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return MemberCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
