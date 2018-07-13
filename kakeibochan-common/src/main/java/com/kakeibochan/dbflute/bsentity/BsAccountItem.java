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
 * The entity of (勘定科目)ACCOUNT_ITEM as TABLE. <br>
 * <pre>
 * [primary-key]
 *     ACCOUNT_ITEM_ID
 *
 * [column]
 *     ACCOUNT_ITEM_ID, MEMBER_ID, CATEGORY_TYPE, ACCOUNT_TITLE, DEL_FLG, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ACCOUNT_ITEM_ID
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
 *     recordList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long accountItemId = entity.getAccountItemId();
 * Long memberId = entity.getMemberId();
 * String categoryType = entity.getCategoryType();
 * String accountTitle = entity.getAccountTitle();
 * String delFlg = entity.getDelFlg();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerUser = entity.getRegisterUser();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateUser = entity.getUpdateUser();
 * Long versionNo = entity.getVersionNo();
 * entity.setAccountItemId(accountItemId);
 * entity.setMemberId(memberId);
 * entity.setCategoryType(categoryType);
 * entity.setAccountTitle(accountTitle);
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
public abstract class BsAccountItem extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** (勘定科目ID)ACCOUNT_ITEM_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _accountItemId;

    /** (会員ID)MEMBER_ID: {IX, NotNull, BIGINT(19), FK to MEMBER} */
    protected Long _memberId;

    /** (カテゴリ種別)CATEGORY_TYPE: {NotNull, VARCHAR(10), classification=CategoryType} */
    protected String _categoryType;

    /** (勘定科目名)ACCOUNT_TITLE: {NotNull, VARCHAR(200)} */
    protected String _accountTitle;

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
        return "ACCOUNT_ITEM";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_accountItemId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of categoryType as the classification of CategoryType. <br>
     * (カテゴリ種別)CATEGORY_TYPE: {NotNull, VARCHAR(10), classification=CategoryType} <br>
     * 勘定科目の種別を表す区分値
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.CategoryType getCategoryTypeAsCategoryType() {
        return CDef.CategoryType.codeOf(getCategoryType());
    }

    /**
     * Set the value of categoryType as the classification of CategoryType. <br>
     * (カテゴリ種別)CATEGORY_TYPE: {NotNull, VARCHAR(10), classification=CategoryType} <br>
     * 勘定科目の種別を表す区分値
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setCategoryTypeAsCategoryType(CDef.CategoryType cdef) {
        setCategoryType(cdef != null ? cdef.code() : null);
    }

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
     * Set the value of categoryType as Income (INCOME). <br>
     * 収入: 収入を表す
     */
    public void setCategoryType_Income() {
        setCategoryTypeAsCategoryType(CDef.CategoryType.Income);
    }

    /**
     * Set the value of categoryType as Spend (SPEND). <br>
     * 支出: 支出を表す
     */
    public void setCategoryType_Spend() {
        setCategoryTypeAsCategoryType(CDef.CategoryType.Spend);
    }

    /**
     * Set the value of categoryType as Move (MOVE). <br>
     * 振替: 振替を表す
     */
    public void setCategoryType_Move() {
        setCategoryTypeAsCategoryType(CDef.CategoryType.Move);
    }

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
     * Is the value of categoryType Income? <br>
     * 収入: 収入を表す
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isCategoryTypeIncome() {
        CDef.CategoryType cdef = getCategoryTypeAsCategoryType();
        return cdef != null ? cdef.equals(CDef.CategoryType.Income) : false;
    }

    /**
     * Is the value of categoryType Spend? <br>
     * 支出: 支出を表す
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isCategoryTypeSpend() {
        CDef.CategoryType cdef = getCategoryTypeAsCategoryType();
        return cdef != null ? cdef.equals(CDef.CategoryType.Spend) : false;
    }

    /**
     * Is the value of categoryType Move? <br>
     * 振替: 振替を表す
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isCategoryTypeMove() {
        CDef.CategoryType cdef = getCategoryTypeAsCategoryType();
        return cdef != null ? cdef.equals(CDef.CategoryType.Move) : false;
    }

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
     * Get the value of the column 'categoryType' as classification alias.
     * @return The string of classification alias. (NullAllowed: when the column value is null)
     */
    public String getCategoryTypeAlias() {
        CDef.CategoryType cdef = getCategoryTypeAsCategoryType();
        return cdef != null ? cdef.alias() : null;
    }

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
    /** (明細)RECORD by ACCOUNT_ITEM_ID, named 'recordList'. */
    protected List<Record> _recordList;

    /**
     * [get] (明細)RECORD by ACCOUNT_ITEM_ID, named 'recordList'.
     * @return The entity list of referrer property 'recordList'. (NotNull: even if no loading, returns empty list)
     */
    public List<Record> getRecordList() {
        if (_recordList == null) { _recordList = newReferrerList(); }
        return _recordList;
    }

    /**
     * [set] (明細)RECORD by ACCOUNT_ITEM_ID, named 'recordList'.
     * @param recordList The entity list of referrer property 'recordList'. (NullAllowed)
     */
    public void setRecordList(List<Record> recordList) {
        _recordList = recordList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsAccountItem) {
            BsAccountItem other = (BsAccountItem)obj;
            if (!xSV(_accountItemId, other._accountItemId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _accountItemId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_member != null && _member.isPresent())
        { sb.append(li).append(xbRDS(_member, "member")); }
        if (_recordList != null) { for (Record et : _recordList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "recordList")); } } }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_accountItemId));
        sb.append(dm).append(xfND(_memberId));
        sb.append(dm).append(xfND(_categoryType));
        sb.append(dm).append(xfND(_accountTitle));
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
        if (_recordList != null && !_recordList.isEmpty())
        { sb.append(dm).append("recordList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public AccountItem clone() {
        return (AccountItem)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (勘定科目ID)ACCOUNT_ITEM_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @return The value of the column 'ACCOUNT_ITEM_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getAccountItemId() {
        checkSpecifiedProperty("accountItemId");
        return _accountItemId;
    }

    /**
     * [set] (勘定科目ID)ACCOUNT_ITEM_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @param accountItemId The value of the column 'ACCOUNT_ITEM_ID'. (basically NotNull if update: for the constraint)
     */
    public void setAccountItemId(Long accountItemId) {
        registerModifiedProperty("accountItemId");
        _accountItemId = accountItemId;
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
     * [get] (カテゴリ種別)CATEGORY_TYPE: {NotNull, VARCHAR(10), classification=CategoryType} <br>
     * @return The value of the column 'CATEGORY_TYPE'. (basically NotNull if selected: for the constraint)
     */
    public String getCategoryType() {
        checkSpecifiedProperty("categoryType");
        return convertEmptyToNull(_categoryType);
    }

    /**
     * [set] (カテゴリ種別)CATEGORY_TYPE: {NotNull, VARCHAR(10), classification=CategoryType} <br>
     * @param categoryType The value of the column 'CATEGORY_TYPE'. (basically NotNull if update: for the constraint)
     */
    protected void setCategoryType(String categoryType) {
        checkClassificationCode("CATEGORY_TYPE", CDef.DefMeta.CategoryType, categoryType);
        registerModifiedProperty("categoryType");
        _categoryType = categoryType;
    }

    /**
     * [get] (勘定科目名)ACCOUNT_TITLE: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'ACCOUNT_TITLE'. (basically NotNull if selected: for the constraint)
     */
    public String getAccountTitle() {
        checkSpecifiedProperty("accountTitle");
        return convertEmptyToNull(_accountTitle);
    }

    /**
     * [set] (勘定科目名)ACCOUNT_TITLE: {NotNull, VARCHAR(200)} <br>
     * @param accountTitle The value of the column 'ACCOUNT_TITLE'. (basically NotNull if update: for the constraint)
     */
    public void setAccountTitle(String accountTitle) {
        registerModifiedProperty("accountTitle");
        _accountTitle = accountTitle;
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
     * @param categoryType The value of the column 'CATEGORY_TYPE'. (basically NotNull if update: for the constraint)
     */
    public void mynativeMappingCategoryType(String categoryType) {
        setCategoryType(categoryType);
    }

    /**
     * For framework so basically DON'T use this method.
     * @param delFlg The value of the column 'DEL_FLG'. (basically NotNull if update: for the constraint)
     */
    public void mynativeMappingDelFlg(String delFlg) {
        setDelFlg(delFlg);
    }
}
