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
 * The entity of (資産)ASSET as TABLE. <br>
 * <pre>
 * [primary-key]
 *     ASSET_ID
 *
 * [column]
 *     ASSET_ID, MEMBER_ID, ASSET_NAME, DEL_FLG, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ASSET_ID
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
 *     recordByDepositAccountIdList, recordByWithdrawalAccountIdList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long assetId = entity.getAssetId();
 * Long memberId = entity.getMemberId();
 * String assetName = entity.getAssetName();
 * String delFlg = entity.getDelFlg();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerUser = entity.getRegisterUser();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateUser = entity.getUpdateUser();
 * Long versionNo = entity.getVersionNo();
 * entity.setAssetId(assetId);
 * entity.setMemberId(memberId);
 * entity.setAssetName(assetName);
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
public abstract class BsAsset extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** (資産ID)ASSET_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _assetId;

    /** (会員ID)MEMBER_ID: {IX, NotNull, BIGINT(19), FK to MEMBER} */
    protected Long _memberId;

    /** (資産名)ASSET_NAME: {NotNull, VARCHAR(200)} */
    protected String _assetName;

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
        return "ASSET";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_assetId == null) { return false; }
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

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** (明細)RECORD by DEPOSIT_ACCOUNT_ID, named 'recordByDepositAccountIdList'. */
    protected List<Record> _recordByDepositAccountIdList;

    /**
     * [get] (明細)RECORD by DEPOSIT_ACCOUNT_ID, named 'recordByDepositAccountIdList'.
     * @return The entity list of referrer property 'recordByDepositAccountIdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<Record> getRecordByDepositAccountIdList() {
        if (_recordByDepositAccountIdList == null) { _recordByDepositAccountIdList = newReferrerList(); }
        return _recordByDepositAccountIdList;
    }

    /**
     * [set] (明細)RECORD by DEPOSIT_ACCOUNT_ID, named 'recordByDepositAccountIdList'.
     * @param recordByDepositAccountIdList The entity list of referrer property 'recordByDepositAccountIdList'. (NullAllowed)
     */
    public void setRecordByDepositAccountIdList(List<Record> recordByDepositAccountIdList) {
        _recordByDepositAccountIdList = recordByDepositAccountIdList;
    }

    /** (明細)RECORD by WITHDRAWAL_ACCOUNT_ID, named 'recordByWithdrawalAccountIdList'. */
    protected List<Record> _recordByWithdrawalAccountIdList;

    /**
     * [get] (明細)RECORD by WITHDRAWAL_ACCOUNT_ID, named 'recordByWithdrawalAccountIdList'.
     * @return The entity list of referrer property 'recordByWithdrawalAccountIdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<Record> getRecordByWithdrawalAccountIdList() {
        if (_recordByWithdrawalAccountIdList == null) { _recordByWithdrawalAccountIdList = newReferrerList(); }
        return _recordByWithdrawalAccountIdList;
    }

    /**
     * [set] (明細)RECORD by WITHDRAWAL_ACCOUNT_ID, named 'recordByWithdrawalAccountIdList'.
     * @param recordByWithdrawalAccountIdList The entity list of referrer property 'recordByWithdrawalAccountIdList'. (NullAllowed)
     */
    public void setRecordByWithdrawalAccountIdList(List<Record> recordByWithdrawalAccountIdList) {
        _recordByWithdrawalAccountIdList = recordByWithdrawalAccountIdList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsAsset) {
            BsAsset other = (BsAsset)obj;
            if (!xSV(_assetId, other._assetId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _assetId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_member != null && _member.isPresent())
        { sb.append(li).append(xbRDS(_member, "member")); }
        if (_recordByDepositAccountIdList != null) { for (Record et : _recordByDepositAccountIdList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "recordByDepositAccountIdList")); } } }
        if (_recordByWithdrawalAccountIdList != null) { for (Record et : _recordByWithdrawalAccountIdList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "recordByWithdrawalAccountIdList")); } } }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_assetId));
        sb.append(dm).append(xfND(_memberId));
        sb.append(dm).append(xfND(_assetName));
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
        if (_member != null && _member.isPresent())
        { sb.append(dm).append("member"); }
        if (_recordByDepositAccountIdList != null && !_recordByDepositAccountIdList.isEmpty())
        { sb.append(dm).append("recordByDepositAccountIdList"); }
        if (_recordByWithdrawalAccountIdList != null && !_recordByWithdrawalAccountIdList.isEmpty())
        { sb.append(dm).append("recordByWithdrawalAccountIdList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public Asset clone() {
        return (Asset)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (資産ID)ASSET_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @return The value of the column 'ASSET_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getAssetId() {
        checkSpecifiedProperty("assetId");
        return _assetId;
    }

    /**
     * [set] (資産ID)ASSET_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @param assetId The value of the column 'ASSET_ID'. (basically NotNull if update: for the constraint)
     */
    public void setAssetId(Long assetId) {
        registerModifiedProperty("assetId");
        _assetId = assetId;
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
     * [get] (資産名)ASSET_NAME: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'ASSET_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getAssetName() {
        checkSpecifiedProperty("assetName");
        return convertEmptyToNull(_assetName);
    }

    /**
     * [set] (資産名)ASSET_NAME: {NotNull, VARCHAR(200)} <br>
     * @param assetName The value of the column 'ASSET_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setAssetName(String assetName) {
        registerModifiedProperty("assetName");
        _assetName = assetName;
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
