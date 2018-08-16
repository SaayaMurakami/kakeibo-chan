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
package com.kakeibochan.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.Entity;
import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.dbflute.optional.OptionalEntity;
import com.kakeibochan.dbflute.allcommon.EntityDefinedCommonColumn;
import com.kakeibochan.dbflute.allcommon.DBMetaInstanceHandler;
import com.kakeibochan.dbflute.allcommon.CDef;
import com.kakeibochan.dbflute.exentity.*;

/**
 * The entity of (明細)RECORD as TABLE. <br>
 * <pre>
 * [primary-key]
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
 *     accountItem, assetByWithdrawalAccountId, member, assetByDepositAccountId
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long recordId = entity.getRecordId();
 * Long memberId = entity.getMemberId();
 * Long accountItemId = entity.getAccountItemId();
 * Long depositAccountId = entity.getDepositAccountId();
 * Long withdrawalAccountId = entity.getWithdrawalAccountId();
 * java.time.LocalDate date = entity.getDate();
 * Integer amount = entity.getAmount();
 * String memo = entity.getMemo();
 * String delFlg = entity.getDelFlg();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerUser = entity.getRegisterUser();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateUser = entity.getUpdateUser();
 * Long versionNo = entity.getVersionNo();
 * entity.setRecordId(recordId);
 * entity.setMemberId(memberId);
 * entity.setAccountItemId(accountItemId);
 * entity.setDepositAccountId(depositAccountId);
 * entity.setWithdrawalAccountId(withdrawalAccountId);
 * entity.setDate(date);
 * entity.setAmount(amount);
 * entity.setMemo(memo);
 * entity.setDelFlg(delFlg);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterUser(registerUser);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateUser(updateUser);
 * entity.setVersionNo(versionNo);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsRecord extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** (明細ID)RECORD_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _recordId;

    /** (会員ID)MEMBER_ID: {IX, NotNull, BIGINT(19), FK to MEMBER} */
    protected Long _memberId;

    /** (勘定科目ID)ACCOUNT_ITEM_ID: {IX, NotNull, BIGINT(19), FK to ACCOUNT_ITEM} */
    protected Long _accountItemId;

    /** (入金先口座ID)DEPOSIT_ACCOUNT_ID: {IX, BIGINT(19), FK to ASSET} */
    protected Long _depositAccountId;

    /** (出金元口座ID)WITHDRAWAL_ACCOUNT_ID: {IX, BIGINT(19), FK to ASSET} */
    protected Long _withdrawalAccountId;

    /** (日付)DATE: {NotNull, DATE(10)} */
    protected java.time.LocalDate _date;

    /** (金額)AMOUNT: {NotNull, INT(10)} */
    protected Integer _amount;

    /** (メモ)MEMO: {VARCHAR(200)} */
    protected String _memo;

    /** (削除フラグ)DEL_FLG: {NotNull, CHAR(1), classification=Flg} */
    protected String _delFlg;

    /** (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)} */
    protected java.time.LocalDateTime _registerDatetime;

    /** (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)} */
    protected String _registerUser;

    /** (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)} */
    protected java.time.LocalDateTime _updateDatetime;

    /** (更新ユーザー)UPDATE_USER: {NotNull, VARCHAR(200)} */
    protected String _updateUser;

    /** (バージョン番号)VERSION_NO: {NotNull, BIGINT(19)} */
    protected Long _versionNo;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "RECORD";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_recordId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of delFlg as the classification of Flg. <br>
     * (削除フラグ)DEL_FLG: {NotNull, CHAR(1), classification=Flg} <br>
     * フラグ。共通的なフラグを示す区分値で、基本的にXxxフラグと呼べるものに関連付けられる。
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.Flg getDelFlgAsFlg() {
        return CDef.Flg.codeOf(getDelFlg());
    }

    /**
     * Set the value of delFlg as the classification of Flg. <br>
     * (削除フラグ)DEL_FLG: {NotNull, CHAR(1), classification=Flg} <br>
     * フラグ。共通的なフラグを示す区分値で、基本的にXxxフラグと呼べるものに関連付けられる。
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setDelFlgAsFlg(CDef.Flg cdef) {
        setDelFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Set the value of delFlg as boolean. <br>
     * (削除フラグ)DEL_FLG: {NotNull, CHAR(1), classification=Flg} <br>
     * フラグ。共通的なフラグを示す区分値で、基本的にXxxフラグと呼べるものに関連付けられる。
     * @param determination The determination, true or false. (NullAllowed: if null, null value is set to the column)
     */
    public void setDelFlgAsBoolean(Boolean determination) {
        setDelFlgAsFlg(CDef.Flg.codeOf(determination));
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of delFlg as True (Y). <br>
     * Yes: フラグがTrue(Yes)であることを示す
     */
    public void setDelFlg_True() {
        setDelFlgAsFlg(CDef.Flg.True);
    }

    /**
     * Set the value of delFlg as False (N). <br>
     * No: フラグがFalse(No)であることを示す
     */
    public void setDelFlg_False() {
        setDelFlgAsFlg(CDef.Flg.False);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of delFlg True? <br>
     * Yes: フラグがTrue(Yes)であることを示す
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDelFlgTrue() {
        CDef.Flg cdef = getDelFlgAsFlg();
        return cdef != null ? cdef.equals(CDef.Flg.True) : false;
    }

    /**
     * Is the value of delFlg False? <br>
     * No: フラグがFalse(No)であることを示す
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDelFlgFalse() {
        CDef.Flg cdef = getDelFlgAsFlg();
        return cdef != null ? cdef.equals(CDef.Flg.False) : false;
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    /**
     * Get the value of the column 'delFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getDelFlgName() {
        CDef.Flg cdef = getDelFlgAsFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'delFlg' as classification alias.
     * @return The string of classification alias. (NullAllowed: when the column value is null)
     */
    public String getDelFlgAlias() {
        CDef.Flg cdef = getDelFlgAsFlg();
        return cdef != null ? cdef.alias() : null;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** (勘定科目)ACCOUNT_ITEM by my ACCOUNT_ITEM_ID, named 'accountItem'. */
    protected OptionalEntity<AccountItem> _accountItem;

    /**
     * [get] (勘定科目)ACCOUNT_ITEM by my ACCOUNT_ITEM_ID, named 'accountItem'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'accountItem'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<AccountItem> getAccountItem() {
        if (_accountItem == null) { _accountItem = OptionalEntity.relationEmpty(this, "accountItem"); }
        return _accountItem;
    }

    /**
     * [set] (勘定科目)ACCOUNT_ITEM by my ACCOUNT_ITEM_ID, named 'accountItem'.
     * @param accountItem The entity of foreign property 'accountItem'. (NullAllowed)
     */
    public void setAccountItem(OptionalEntity<AccountItem> accountItem) {
        _accountItem = accountItem;
    }

    /** (資産)ASSET by my WITHDRAWAL_ACCOUNT_ID, named 'assetByWithdrawalAccountId'. */
    protected OptionalEntity<Asset> _assetByWithdrawalAccountId;

    /**
     * [get] (資産)ASSET by my WITHDRAWAL_ACCOUNT_ID, named 'assetByWithdrawalAccountId'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'assetByWithdrawalAccountId'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<Asset> getAssetByWithdrawalAccountId() {
        if (_assetByWithdrawalAccountId == null) { _assetByWithdrawalAccountId = OptionalEntity.relationEmpty(this, "assetByWithdrawalAccountId"); }
        return _assetByWithdrawalAccountId;
    }

    /**
     * [set] (資産)ASSET by my WITHDRAWAL_ACCOUNT_ID, named 'assetByWithdrawalAccountId'.
     * @param assetByWithdrawalAccountId The entity of foreign property 'assetByWithdrawalAccountId'. (NullAllowed)
     */
    public void setAssetByWithdrawalAccountId(OptionalEntity<Asset> assetByWithdrawalAccountId) {
        _assetByWithdrawalAccountId = assetByWithdrawalAccountId;
    }

    /** (会員)MEMBER by my MEMBER_ID, named 'member'. */
    protected OptionalEntity<Member> _member;

    /**
     * [get] (会員)MEMBER by my MEMBER_ID, named 'member'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'member'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<Member> getMember() {
        if (_member == null) { _member = OptionalEntity.relationEmpty(this, "member"); }
        return _member;
    }

    /**
     * [set] (会員)MEMBER by my MEMBER_ID, named 'member'.
     * @param member The entity of foreign property 'member'. (NullAllowed)
     */
    public void setMember(OptionalEntity<Member> member) {
        _member = member;
    }

    /** (資産)ASSET by my DEPOSIT_ACCOUNT_ID, named 'assetByDepositAccountId'. */
    protected OptionalEntity<Asset> _assetByDepositAccountId;

    /**
     * [get] (資産)ASSET by my DEPOSIT_ACCOUNT_ID, named 'assetByDepositAccountId'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'assetByDepositAccountId'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<Asset> getAssetByDepositAccountId() {
        if (_assetByDepositAccountId == null) { _assetByDepositAccountId = OptionalEntity.relationEmpty(this, "assetByDepositAccountId"); }
        return _assetByDepositAccountId;
    }

    /**
     * [set] (資産)ASSET by my DEPOSIT_ACCOUNT_ID, named 'assetByDepositAccountId'.
     * @param assetByDepositAccountId The entity of foreign property 'assetByDepositAccountId'. (NullAllowed)
     */
    public void setAssetByDepositAccountId(OptionalEntity<Asset> assetByDepositAccountId) {
        _assetByDepositAccountId = assetByDepositAccountId;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsRecord) {
            BsRecord other = (BsRecord)obj;
            if (!xSV(_recordId, other._recordId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _recordId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_accountItem != null && _accountItem.isPresent())
        { sb.append(li).append(xbRDS(_accountItem, "accountItem")); }
        if (_assetByWithdrawalAccountId != null && _assetByWithdrawalAccountId.isPresent())
        { sb.append(li).append(xbRDS(_assetByWithdrawalAccountId, "assetByWithdrawalAccountId")); }
        if (_member != null && _member.isPresent())
        { sb.append(li).append(xbRDS(_member, "member")); }
        if (_assetByDepositAccountId != null && _assetByDepositAccountId.isPresent())
        { sb.append(li).append(xbRDS(_assetByDepositAccountId, "assetByDepositAccountId")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_recordId));
        sb.append(dm).append(xfND(_memberId));
        sb.append(dm).append(xfND(_accountItemId));
        sb.append(dm).append(xfND(_depositAccountId));
        sb.append(dm).append(xfND(_withdrawalAccountId));
        sb.append(dm).append(xfND(_date));
        sb.append(dm).append(xfND(_amount));
        sb.append(dm).append(xfND(_memo));
        sb.append(dm).append(xfND(_delFlg));
        sb.append(dm).append(xfND(_registerDatetime));
        sb.append(dm).append(xfND(_registerUser));
        sb.append(dm).append(xfND(_updateDatetime));
        sb.append(dm).append(xfND(_updateUser));
        sb.append(dm).append(xfND(_versionNo));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_accountItem != null && _accountItem.isPresent())
        { sb.append(dm).append("accountItem"); }
        if (_assetByWithdrawalAccountId != null && _assetByWithdrawalAccountId.isPresent())
        { sb.append(dm).append("assetByWithdrawalAccountId"); }
        if (_member != null && _member.isPresent())
        { sb.append(dm).append("member"); }
        if (_assetByDepositAccountId != null && _assetByDepositAccountId.isPresent())
        { sb.append(dm).append("assetByDepositAccountId"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public Record clone() {
        return (Record)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (明細ID)RECORD_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @return The value of the column 'RECORD_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getRecordId() {
        checkSpecifiedProperty("recordId");
        return _recordId;
    }

    /**
     * [set] (明細ID)RECORD_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @param recordId The value of the column 'RECORD_ID'. (basically NotNull if update: for the constraint)
     */
    public void setRecordId(Long recordId) {
        registerModifiedProperty("recordId");
        _recordId = recordId;
    }

    /**
     * [get] (会員ID)MEMBER_ID: {IX, NotNull, BIGINT(19), FK to MEMBER} <br>
     * @return The value of the column 'MEMBER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getMemberId() {
        checkSpecifiedProperty("memberId");
        return _memberId;
    }

    /**
     * [set] (会員ID)MEMBER_ID: {IX, NotNull, BIGINT(19), FK to MEMBER} <br>
     * @param memberId The value of the column 'MEMBER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMemberId(Long memberId) {
        registerModifiedProperty("memberId");
        _memberId = memberId;
    }

    /**
     * [get] (勘定科目ID)ACCOUNT_ITEM_ID: {IX, NotNull, BIGINT(19), FK to ACCOUNT_ITEM} <br>
     * @return The value of the column 'ACCOUNT_ITEM_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getAccountItemId() {
        checkSpecifiedProperty("accountItemId");
        return _accountItemId;
    }

    /**
     * [set] (勘定科目ID)ACCOUNT_ITEM_ID: {IX, NotNull, BIGINT(19), FK to ACCOUNT_ITEM} <br>
     * @param accountItemId The value of the column 'ACCOUNT_ITEM_ID'. (basically NotNull if update: for the constraint)
     */
    public void setAccountItemId(Long accountItemId) {
        registerModifiedProperty("accountItemId");
        _accountItemId = accountItemId;
    }

    /**
     * [get] (入金先口座ID)DEPOSIT_ACCOUNT_ID: {IX, BIGINT(19), FK to ASSET} <br>
     * @return The value of the column 'DEPOSIT_ACCOUNT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getDepositAccountId() {
        checkSpecifiedProperty("depositAccountId");
        return _depositAccountId;
    }

    /**
     * [set] (入金先口座ID)DEPOSIT_ACCOUNT_ID: {IX, BIGINT(19), FK to ASSET} <br>
     * @param depositAccountId The value of the column 'DEPOSIT_ACCOUNT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDepositAccountId(Long depositAccountId) {
        registerModifiedProperty("depositAccountId");
        _depositAccountId = depositAccountId;
    }

    /**
     * [get] (出金元口座ID)WITHDRAWAL_ACCOUNT_ID: {IX, BIGINT(19), FK to ASSET} <br>
     * @return The value of the column 'WITHDRAWAL_ACCOUNT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getWithdrawalAccountId() {
        checkSpecifiedProperty("withdrawalAccountId");
        return _withdrawalAccountId;
    }

    /**
     * [set] (出金元口座ID)WITHDRAWAL_ACCOUNT_ID: {IX, BIGINT(19), FK to ASSET} <br>
     * @param withdrawalAccountId The value of the column 'WITHDRAWAL_ACCOUNT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWithdrawalAccountId(Long withdrawalAccountId) {
        registerModifiedProperty("withdrawalAccountId");
        _withdrawalAccountId = withdrawalAccountId;
    }

    /**
     * [get] (日付)DATE: {NotNull, DATE(10)} <br>
     * @return The value of the column 'DATE'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDate getDate() {
        checkSpecifiedProperty("date");
        return _date;
    }

    /**
     * [set] (日付)DATE: {NotNull, DATE(10)} <br>
     * @param date The value of the column 'DATE'. (basically NotNull if update: for the constraint)
     */
    public void setDate(java.time.LocalDate date) {
        registerModifiedProperty("date");
        _date = date;
    }

    /**
     * [get] (金額)AMOUNT: {NotNull, INT(10)} <br>
     * @return The value of the column 'AMOUNT'. (basically NotNull if selected: for the constraint)
     */
    public Integer getAmount() {
        checkSpecifiedProperty("amount");
        return _amount;
    }

    /**
     * [set] (金額)AMOUNT: {NotNull, INT(10)} <br>
     * @param amount The value of the column 'AMOUNT'. (basically NotNull if update: for the constraint)
     */
    public void setAmount(Integer amount) {
        registerModifiedProperty("amount");
        _amount = amount;
    }

    /**
     * [get] (メモ)MEMO: {VARCHAR(200)} <br>
     * 支出内容の補足説明
     * @return The value of the column 'MEMO'. (NullAllowed even if selected: for no constraint)
     */
    public String getMemo() {
        checkSpecifiedProperty("memo");
        return convertEmptyToNull(_memo);
    }

    /**
     * [set] (メモ)MEMO: {VARCHAR(200)} <br>
     * 支出内容の補足説明
     * @param memo The value of the column 'MEMO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMemo(String memo) {
        registerModifiedProperty("memo");
        _memo = memo;
    }

    /**
     * [get] (削除フラグ)DEL_FLG: {NotNull, CHAR(1), classification=Flg} <br>
     * @return The value of the column 'DEL_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getDelFlg() {
        checkSpecifiedProperty("delFlg");
        return convertEmptyToNull(_delFlg);
    }

    /**
     * [set] (削除フラグ)DEL_FLG: {NotNull, CHAR(1), classification=Flg} <br>
     * @param delFlg The value of the column 'DEL_FLG'. (basically NotNull if update: for the constraint)
     */
    protected void setDelFlg(String delFlg) {
        checkClassificationCode("DEL_FLG", CDef.DefMeta.Flg, delFlg);
        registerModifiedProperty("delFlg");
        _delFlg = delFlg;
    }

    /**
     * [get] (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)} <br>
     * @return The value of the column 'REGISTER_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getRegisterDatetime() {
        checkSpecifiedProperty("registerDatetime");
        return _registerDatetime;
    }

    /**
     * [set] (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)} <br>
     * @param registerDatetime The value of the column 'REGISTER_DATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterDatetime(java.time.LocalDateTime registerDatetime) {
        registerModifiedProperty("registerDatetime");
        _registerDatetime = registerDatetime;
    }

    /**
     * [get] (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'REGISTER_USER'. (basically NotNull if selected: for the constraint)
     */
    public String getRegisterUser() {
        checkSpecifiedProperty("registerUser");
        return convertEmptyToNull(_registerUser);
    }

    /**
     * [set] (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)} <br>
     * @param registerUser The value of the column 'REGISTER_USER'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterUser(String registerUser) {
        registerModifiedProperty("registerUser");
        _registerUser = registerUser;
    }

    /**
     * [get] (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)} <br>
     * @return The value of the column 'UPDATE_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getUpdateDatetime() {
        checkSpecifiedProperty("updateDatetime");
        return _updateDatetime;
    }

    /**
     * [set] (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)} <br>
     * @param updateDatetime The value of the column 'UPDATE_DATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setUpdateDatetime(java.time.LocalDateTime updateDatetime) {
        registerModifiedProperty("updateDatetime");
        _updateDatetime = updateDatetime;
    }

    /**
     * [get] (更新ユーザー)UPDATE_USER: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'UPDATE_USER'. (basically NotNull if selected: for the constraint)
     */
    public String getUpdateUser() {
        checkSpecifiedProperty("updateUser");
        return convertEmptyToNull(_updateUser);
    }

    /**
     * [set] (更新ユーザー)UPDATE_USER: {NotNull, VARCHAR(200)} <br>
     * @param updateUser The value of the column 'UPDATE_USER'. (basically NotNull if update: for the constraint)
     */
    public void setUpdateUser(String updateUser) {
        registerModifiedProperty("updateUser");
        _updateUser = updateUser;
    }

    /**
     * [get] (バージョン番号)VERSION_NO: {NotNull, BIGINT(19)} <br>
     * @return The value of the column 'VERSION_NO'. (basically NotNull if selected: for the constraint)
     */
    public Long getVersionNo() {
        checkSpecifiedProperty("versionNo");
        return _versionNo;
    }

    /**
     * [set] (バージョン番号)VERSION_NO: {NotNull, BIGINT(19)} <br>
     * @param versionNo The value of the column 'VERSION_NO'. (basically NotNull if update: for the constraint)
     */
    public void setVersionNo(Long versionNo) {
        registerModifiedProperty("versionNo");
        _versionNo = versionNo;
    }

    /**
     * For framework so basically DON'T use this method.
     * @param delFlg The value of the column 'DEL_FLG'. (basically NotNull if update: for the constraint)
     */
    public void mynativeMappingDelFlg(String delFlg) {
        setDelFlg(delFlg);
    }
}
