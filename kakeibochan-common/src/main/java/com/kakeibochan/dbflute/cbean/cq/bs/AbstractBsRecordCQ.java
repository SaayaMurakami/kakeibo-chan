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
 * The abstract condition-query of RECORD.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsRecordCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsRecordCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "RECORD";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (明細ID)RECORD_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param recordId The value of recordId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRecordId_Equal(Long recordId) {
        doSetRecordId_Equal(recordId);
    }

    protected void doSetRecordId_Equal(Long recordId) {
        regRecordId(CK_EQ, recordId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (明細ID)RECORD_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param recordId The value of recordId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRecordId_NotEqual(Long recordId) {
        doSetRecordId_NotEqual(recordId);
    }

    protected void doSetRecordId_NotEqual(Long recordId) {
        regRecordId(CK_NES, recordId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (明細ID)RECORD_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param recordId The value of recordId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRecordId_GreaterThan(Long recordId) {
        regRecordId(CK_GT, recordId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (明細ID)RECORD_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param recordId The value of recordId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRecordId_LessThan(Long recordId) {
        regRecordId(CK_LT, recordId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (明細ID)RECORD_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param recordId The value of recordId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRecordId_GreaterEqual(Long recordId) {
        regRecordId(CK_GE, recordId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (明細ID)RECORD_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param recordId The value of recordId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRecordId_LessEqual(Long recordId) {
        regRecordId(CK_LE, recordId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (明細ID)RECORD_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of recordId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of recordId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setRecordId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setRecordId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (明細ID)RECORD_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of recordId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of recordId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setRecordId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueRecordId(), "RECORD_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (明細ID)RECORD_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param recordIdList The collection of recordId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRecordId_InScope(Collection<Long> recordIdList) {
        doSetRecordId_InScope(recordIdList);
    }

    protected void doSetRecordId_InScope(Collection<Long> recordIdList) {
        regINS(CK_INS, cTL(recordIdList), xgetCValueRecordId(), "RECORD_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (明細ID)RECORD_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param recordIdList The collection of recordId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRecordId_NotInScope(Collection<Long> recordIdList) {
        doSetRecordId_NotInScope(recordIdList);
    }

    protected void doSetRecordId_NotInScope(Collection<Long> recordIdList) {
        regINS(CK_NINS, cTL(recordIdList), xgetCValueRecordId(), "RECORD_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (明細ID)RECORD_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setRecordId_IsNull() { regRecordId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (明細ID)RECORD_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setRecordId_IsNotNull() { regRecordId(CK_ISNN, DOBJ); }

    protected void regRecordId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRecordId(), "RECORD_ID"); }
    protected abstract ConditionValue xgetCValueRecordId();

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
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (勘定科目ID)ACCOUNT_ITEM_ID: {IX, NotNull, BIGINT(19), FK to ACCOUNT_ITEM}
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
     * (勘定科目ID)ACCOUNT_ITEM_ID: {IX, NotNull, BIGINT(19), FK to ACCOUNT_ITEM}
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
     * (勘定科目ID)ACCOUNT_ITEM_ID: {IX, NotNull, BIGINT(19), FK to ACCOUNT_ITEM}
     * @param accountItemId The value of accountItemId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAccountItemId_GreaterThan(Long accountItemId) {
        regAccountItemId(CK_GT, accountItemId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (勘定科目ID)ACCOUNT_ITEM_ID: {IX, NotNull, BIGINT(19), FK to ACCOUNT_ITEM}
     * @param accountItemId The value of accountItemId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAccountItemId_LessThan(Long accountItemId) {
        regAccountItemId(CK_LT, accountItemId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (勘定科目ID)ACCOUNT_ITEM_ID: {IX, NotNull, BIGINT(19), FK to ACCOUNT_ITEM}
     * @param accountItemId The value of accountItemId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAccountItemId_GreaterEqual(Long accountItemId) {
        regAccountItemId(CK_GE, accountItemId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (勘定科目ID)ACCOUNT_ITEM_ID: {IX, NotNull, BIGINT(19), FK to ACCOUNT_ITEM}
     * @param accountItemId The value of accountItemId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAccountItemId_LessEqual(Long accountItemId) {
        regAccountItemId(CK_LE, accountItemId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (勘定科目ID)ACCOUNT_ITEM_ID: {IX, NotNull, BIGINT(19), FK to ACCOUNT_ITEM}
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
     * (勘定科目ID)ACCOUNT_ITEM_ID: {IX, NotNull, BIGINT(19), FK to ACCOUNT_ITEM}
     * @param minNumber The min number of accountItemId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of accountItemId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setAccountItemId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAccountItemId(), "ACCOUNT_ITEM_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (勘定科目ID)ACCOUNT_ITEM_ID: {IX, NotNull, BIGINT(19), FK to ACCOUNT_ITEM}
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
     * (勘定科目ID)ACCOUNT_ITEM_ID: {IX, NotNull, BIGINT(19), FK to ACCOUNT_ITEM}
     * @param accountItemIdList The collection of accountItemId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAccountItemId_NotInScope(Collection<Long> accountItemIdList) {
        doSetAccountItemId_NotInScope(accountItemIdList);
    }

    protected void doSetAccountItemId_NotInScope(Collection<Long> accountItemIdList) {
        regINS(CK_NINS, cTL(accountItemIdList), xgetCValueAccountItemId(), "ACCOUNT_ITEM_ID");
    }

    protected void regAccountItemId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAccountItemId(), "ACCOUNT_ITEM_ID"); }
    protected abstract ConditionValue xgetCValueAccountItemId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (入金先口座ID)DEPOSIT_ACCOUNT_ID: {IX, BIGINT(19), FK to ASSET}
     * @param depositAccountId The value of depositAccountId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDepositAccountId_Equal(Long depositAccountId) {
        doSetDepositAccountId_Equal(depositAccountId);
    }

    protected void doSetDepositAccountId_Equal(Long depositAccountId) {
        regDepositAccountId(CK_EQ, depositAccountId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (入金先口座ID)DEPOSIT_ACCOUNT_ID: {IX, BIGINT(19), FK to ASSET}
     * @param depositAccountId The value of depositAccountId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDepositAccountId_NotEqual(Long depositAccountId) {
        doSetDepositAccountId_NotEqual(depositAccountId);
    }

    protected void doSetDepositAccountId_NotEqual(Long depositAccountId) {
        regDepositAccountId(CK_NES, depositAccountId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (入金先口座ID)DEPOSIT_ACCOUNT_ID: {IX, BIGINT(19), FK to ASSET}
     * @param depositAccountId The value of depositAccountId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDepositAccountId_GreaterThan(Long depositAccountId) {
        regDepositAccountId(CK_GT, depositAccountId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (入金先口座ID)DEPOSIT_ACCOUNT_ID: {IX, BIGINT(19), FK to ASSET}
     * @param depositAccountId The value of depositAccountId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDepositAccountId_LessThan(Long depositAccountId) {
        regDepositAccountId(CK_LT, depositAccountId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (入金先口座ID)DEPOSIT_ACCOUNT_ID: {IX, BIGINT(19), FK to ASSET}
     * @param depositAccountId The value of depositAccountId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDepositAccountId_GreaterEqual(Long depositAccountId) {
        regDepositAccountId(CK_GE, depositAccountId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (入金先口座ID)DEPOSIT_ACCOUNT_ID: {IX, BIGINT(19), FK to ASSET}
     * @param depositAccountId The value of depositAccountId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDepositAccountId_LessEqual(Long depositAccountId) {
        regDepositAccountId(CK_LE, depositAccountId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (入金先口座ID)DEPOSIT_ACCOUNT_ID: {IX, BIGINT(19), FK to ASSET}
     * @param minNumber The min number of depositAccountId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of depositAccountId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setDepositAccountId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setDepositAccountId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (入金先口座ID)DEPOSIT_ACCOUNT_ID: {IX, BIGINT(19), FK to ASSET}
     * @param minNumber The min number of depositAccountId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of depositAccountId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setDepositAccountId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDepositAccountId(), "DEPOSIT_ACCOUNT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (入金先口座ID)DEPOSIT_ACCOUNT_ID: {IX, BIGINT(19), FK to ASSET}
     * @param depositAccountIdList The collection of depositAccountId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDepositAccountId_InScope(Collection<Long> depositAccountIdList) {
        doSetDepositAccountId_InScope(depositAccountIdList);
    }

    protected void doSetDepositAccountId_InScope(Collection<Long> depositAccountIdList) {
        regINS(CK_INS, cTL(depositAccountIdList), xgetCValueDepositAccountId(), "DEPOSIT_ACCOUNT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (入金先口座ID)DEPOSIT_ACCOUNT_ID: {IX, BIGINT(19), FK to ASSET}
     * @param depositAccountIdList The collection of depositAccountId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDepositAccountId_NotInScope(Collection<Long> depositAccountIdList) {
        doSetDepositAccountId_NotInScope(depositAccountIdList);
    }

    protected void doSetDepositAccountId_NotInScope(Collection<Long> depositAccountIdList) {
        regINS(CK_NINS, cTL(depositAccountIdList), xgetCValueDepositAccountId(), "DEPOSIT_ACCOUNT_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (入金先口座ID)DEPOSIT_ACCOUNT_ID: {IX, BIGINT(19), FK to ASSET}
     */
    public void setDepositAccountId_IsNull() { regDepositAccountId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (入金先口座ID)DEPOSIT_ACCOUNT_ID: {IX, BIGINT(19), FK to ASSET}
     */
    public void setDepositAccountId_IsNotNull() { regDepositAccountId(CK_ISNN, DOBJ); }

    protected void regDepositAccountId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDepositAccountId(), "DEPOSIT_ACCOUNT_ID"); }
    protected abstract ConditionValue xgetCValueDepositAccountId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (出金元口座ID)WITHDRAWAL_ACCOUNT_ID: {IX, BIGINT(19), FK to ASSET}
     * @param withdrawalAccountId The value of withdrawalAccountId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setWithdrawalAccountId_Equal(Long withdrawalAccountId) {
        doSetWithdrawalAccountId_Equal(withdrawalAccountId);
    }

    protected void doSetWithdrawalAccountId_Equal(Long withdrawalAccountId) {
        regWithdrawalAccountId(CK_EQ, withdrawalAccountId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (出金元口座ID)WITHDRAWAL_ACCOUNT_ID: {IX, BIGINT(19), FK to ASSET}
     * @param withdrawalAccountId The value of withdrawalAccountId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWithdrawalAccountId_NotEqual(Long withdrawalAccountId) {
        doSetWithdrawalAccountId_NotEqual(withdrawalAccountId);
    }

    protected void doSetWithdrawalAccountId_NotEqual(Long withdrawalAccountId) {
        regWithdrawalAccountId(CK_NES, withdrawalAccountId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (出金元口座ID)WITHDRAWAL_ACCOUNT_ID: {IX, BIGINT(19), FK to ASSET}
     * @param withdrawalAccountId The value of withdrawalAccountId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWithdrawalAccountId_GreaterThan(Long withdrawalAccountId) {
        regWithdrawalAccountId(CK_GT, withdrawalAccountId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (出金元口座ID)WITHDRAWAL_ACCOUNT_ID: {IX, BIGINT(19), FK to ASSET}
     * @param withdrawalAccountId The value of withdrawalAccountId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWithdrawalAccountId_LessThan(Long withdrawalAccountId) {
        regWithdrawalAccountId(CK_LT, withdrawalAccountId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (出金元口座ID)WITHDRAWAL_ACCOUNT_ID: {IX, BIGINT(19), FK to ASSET}
     * @param withdrawalAccountId The value of withdrawalAccountId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWithdrawalAccountId_GreaterEqual(Long withdrawalAccountId) {
        regWithdrawalAccountId(CK_GE, withdrawalAccountId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (出金元口座ID)WITHDRAWAL_ACCOUNT_ID: {IX, BIGINT(19), FK to ASSET}
     * @param withdrawalAccountId The value of withdrawalAccountId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWithdrawalAccountId_LessEqual(Long withdrawalAccountId) {
        regWithdrawalAccountId(CK_LE, withdrawalAccountId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (出金元口座ID)WITHDRAWAL_ACCOUNT_ID: {IX, BIGINT(19), FK to ASSET}
     * @param minNumber The min number of withdrawalAccountId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of withdrawalAccountId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setWithdrawalAccountId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setWithdrawalAccountId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (出金元口座ID)WITHDRAWAL_ACCOUNT_ID: {IX, BIGINT(19), FK to ASSET}
     * @param minNumber The min number of withdrawalAccountId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of withdrawalAccountId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setWithdrawalAccountId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueWithdrawalAccountId(), "WITHDRAWAL_ACCOUNT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (出金元口座ID)WITHDRAWAL_ACCOUNT_ID: {IX, BIGINT(19), FK to ASSET}
     * @param withdrawalAccountIdList The collection of withdrawalAccountId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWithdrawalAccountId_InScope(Collection<Long> withdrawalAccountIdList) {
        doSetWithdrawalAccountId_InScope(withdrawalAccountIdList);
    }

    protected void doSetWithdrawalAccountId_InScope(Collection<Long> withdrawalAccountIdList) {
        regINS(CK_INS, cTL(withdrawalAccountIdList), xgetCValueWithdrawalAccountId(), "WITHDRAWAL_ACCOUNT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (出金元口座ID)WITHDRAWAL_ACCOUNT_ID: {IX, BIGINT(19), FK to ASSET}
     * @param withdrawalAccountIdList The collection of withdrawalAccountId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWithdrawalAccountId_NotInScope(Collection<Long> withdrawalAccountIdList) {
        doSetWithdrawalAccountId_NotInScope(withdrawalAccountIdList);
    }

    protected void doSetWithdrawalAccountId_NotInScope(Collection<Long> withdrawalAccountIdList) {
        regINS(CK_NINS, cTL(withdrawalAccountIdList), xgetCValueWithdrawalAccountId(), "WITHDRAWAL_ACCOUNT_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (出金元口座ID)WITHDRAWAL_ACCOUNT_ID: {IX, BIGINT(19), FK to ASSET}
     */
    public void setWithdrawalAccountId_IsNull() { regWithdrawalAccountId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (出金元口座ID)WITHDRAWAL_ACCOUNT_ID: {IX, BIGINT(19), FK to ASSET}
     */
    public void setWithdrawalAccountId_IsNotNull() { regWithdrawalAccountId(CK_ISNN, DOBJ); }

    protected void regWithdrawalAccountId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWithdrawalAccountId(), "WITHDRAWAL_ACCOUNT_ID"); }
    protected abstract ConditionValue xgetCValueWithdrawalAccountId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (日付)DATE: {NotNull, DATE(10)}
     * @param date The value of date as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDate_Equal(java.time.LocalDate date) {
        regDate(CK_EQ,  date);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (日付)DATE: {NotNull, DATE(10)}
     * @param date The value of date as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDate_GreaterThan(java.time.LocalDate date) {
        regDate(CK_GT,  date);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (日付)DATE: {NotNull, DATE(10)}
     * @param date The value of date as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDate_LessThan(java.time.LocalDate date) {
        regDate(CK_LT,  date);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (日付)DATE: {NotNull, DATE(10)}
     * @param date The value of date as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDate_GreaterEqual(java.time.LocalDate date) {
        regDate(CK_GE,  date);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (日付)DATE: {NotNull, DATE(10)}
     * @param date The value of date as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDate_LessEqual(java.time.LocalDate date) {
        regDate(CK_LE, date);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (日付)DATE: {NotNull, DATE(10)}
     * <pre>e.g. setDate_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of date. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of date. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setDate_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (日付)DATE: {NotNull, DATE(10)}
     * <pre>e.g. setDate_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of date. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of date. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, FromToOption fromToOption) {
        String nm = "DATE"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueDate(), nm, op);
    }

    protected void regDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDate(), "DATE"); }
    protected abstract ConditionValue xgetCValueDate();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (金額)AMOUNT: {NotNull, INT(10)}
     * @param amount The value of amount as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAmount_Equal(Integer amount) {
        doSetAmount_Equal(amount);
    }

    protected void doSetAmount_Equal(Integer amount) {
        regAmount(CK_EQ, amount);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (金額)AMOUNT: {NotNull, INT(10)}
     * @param amount The value of amount as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAmount_NotEqual(Integer amount) {
        doSetAmount_NotEqual(amount);
    }

    protected void doSetAmount_NotEqual(Integer amount) {
        regAmount(CK_NES, amount);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (金額)AMOUNT: {NotNull, INT(10)}
     * @param amount The value of amount as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAmount_GreaterThan(Integer amount) {
        regAmount(CK_GT, amount);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (金額)AMOUNT: {NotNull, INT(10)}
     * @param amount The value of amount as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAmount_LessThan(Integer amount) {
        regAmount(CK_LT, amount);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (金額)AMOUNT: {NotNull, INT(10)}
     * @param amount The value of amount as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAmount_GreaterEqual(Integer amount) {
        regAmount(CK_GE, amount);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (金額)AMOUNT: {NotNull, INT(10)}
     * @param amount The value of amount as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAmount_LessEqual(Integer amount) {
        regAmount(CK_LE, amount);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (金額)AMOUNT: {NotNull, INT(10)}
     * @param minNumber The min number of amount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of amount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setAmount_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setAmount_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (金額)AMOUNT: {NotNull, INT(10)}
     * @param minNumber The min number of amount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of amount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setAmount_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAmount(), "AMOUNT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (金額)AMOUNT: {NotNull, INT(10)}
     * @param amountList The collection of amount as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAmount_InScope(Collection<Integer> amountList) {
        doSetAmount_InScope(amountList);
    }

    protected void doSetAmount_InScope(Collection<Integer> amountList) {
        regINS(CK_INS, cTL(amountList), xgetCValueAmount(), "AMOUNT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (金額)AMOUNT: {NotNull, INT(10)}
     * @param amountList The collection of amount as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAmount_NotInScope(Collection<Integer> amountList) {
        doSetAmount_NotInScope(amountList);
    }

    protected void doSetAmount_NotInScope(Collection<Integer> amountList) {
        regINS(CK_NINS, cTL(amountList), xgetCValueAmount(), "AMOUNT");
    }

    protected void regAmount(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAmount(), "AMOUNT"); }
    protected abstract ConditionValue xgetCValueAmount();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (メモ)MEMO: {VARCHAR(200)}
     * @param memo The value of memo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemo_Equal(String memo) {
        doSetMemo_Equal(fRES(memo));
    }

    protected void doSetMemo_Equal(String memo) {
        regMemo(CK_EQ, memo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (メモ)MEMO: {VARCHAR(200)}
     * @param memo The value of memo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemo_NotEqual(String memo) {
        doSetMemo_NotEqual(fRES(memo));
    }

    protected void doSetMemo_NotEqual(String memo) {
        regMemo(CK_NES, memo);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (メモ)MEMO: {VARCHAR(200)}
     * @param memoList The collection of memo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemo_InScope(Collection<String> memoList) {
        doSetMemo_InScope(memoList);
    }

    protected void doSetMemo_InScope(Collection<String> memoList) {
        regINS(CK_INS, cTL(memoList), xgetCValueMemo(), "MEMO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (メモ)MEMO: {VARCHAR(200)}
     * @param memoList The collection of memo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemo_NotInScope(Collection<String> memoList) {
        doSetMemo_NotInScope(memoList);
    }

    protected void doSetMemo_NotInScope(Collection<String> memoList) {
        regINS(CK_NINS, cTL(memoList), xgetCValueMemo(), "MEMO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (メモ)MEMO: {VARCHAR(200)} <br>
     * <pre>e.g. setMemo_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param memo The value of memo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setMemo_LikeSearch(String memo, ConditionOptionCall<LikeSearchOption> opLambda) {
        setMemo_LikeSearch(memo, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (メモ)MEMO: {VARCHAR(200)} <br>
     * <pre>e.g. setMemo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param memo The value of memo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setMemo_LikeSearch(String memo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(memo), xgetCValueMemo(), "MEMO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (メモ)MEMO: {VARCHAR(200)}
     * @param memo The value of memo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setMemo_NotLikeSearch(String memo, ConditionOptionCall<LikeSearchOption> opLambda) {
        setMemo_NotLikeSearch(memo, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (メモ)MEMO: {VARCHAR(200)}
     * @param memo The value of memo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setMemo_NotLikeSearch(String memo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(memo), xgetCValueMemo(), "MEMO", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (メモ)MEMO: {VARCHAR(200)}
     */
    public void setMemo_IsNull() { regMemo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * (メモ)MEMO: {VARCHAR(200)}
     */
    public void setMemo_IsNullOrEmpty() { regMemo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (メモ)MEMO: {VARCHAR(200)}
     */
    public void setMemo_IsNotNull() { regMemo(CK_ISNN, DOBJ); }

    protected void regMemo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMemo(), "MEMO"); }
    protected abstract ConditionValue xgetCValueMemo();

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
    public HpSLCFunction<RecordCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, RecordCB.class);
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
    public HpSLCFunction<RecordCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, RecordCB.class);
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
    public HpSLCFunction<RecordCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, RecordCB.class);
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
    public HpSLCFunction<RecordCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, RecordCB.class);
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
    public HpSLCFunction<RecordCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, RecordCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;RecordCB&gt;() {
     *     public void query(RecordCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<RecordCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, RecordCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        RecordCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(RecordCQ sq);

    protected RecordCB xcreateScalarConditionCB() {
        RecordCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected RecordCB xcreateScalarConditionPartitionByCB() {
        RecordCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<RecordCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        RecordCB cb = new RecordCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "RECORD_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(RecordCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<RecordCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(RecordCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        RecordCB cb = new RecordCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "RECORD_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(RecordCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<RecordCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        RecordCB cb = new RecordCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(RecordCQ sq);

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
    protected RecordCB newMyCB() {
        return new RecordCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return RecordCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
