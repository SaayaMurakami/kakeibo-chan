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
import com.kakeibochan.dbflute.exentity.*;

/**
 * The entity of (会員)MEMBER as TABLE. <br>
 * <pre>
 * [primary-key]
 *     MEMBER_ID
 *
 * [column]
 *     MEMBER_ID, MAIL_ADDRESS, NAME, PASSWORD, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MEMBER_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     WITHDRAWAL(AsOne)
 *
 * [referrer table]
 *     ACCOUNT_ITEM, ASSET, RECORD, WITHDRAWAL
 *
 * [foreign property]
 *     withdrawalAsOne
 *
 * [referrer property]
 *     accountItemList, assetList, recordList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long memberId = entity.getMemberId();
 * String mailAddress = entity.getMailAddress();
 * String name = entity.getName();
 * String password = entity.getPassword();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerUser = entity.getRegisterUser();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateUser = entity.getUpdateUser();
 * Long versionNo = entity.getVersionNo();
 * entity.setMemberId(memberId);
 * entity.setMailAddress(mailAddress);
 * entity.setName(name);
 * entity.setPassword(password);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterUser(registerUser);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateUser(updateUser);
 * entity.setVersionNo(versionNo);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMember extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** (会員ID)MEMBER_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _memberId;

    /** (メールアドレス)MAIL_ADDRESS: {UQ, NotNull, VARCHAR(200)} */
    protected String _mailAddress;

    /** (名前)NAME: {NotNull, VARCHAR(200)} */
    protected String _name;

    /** (パスワード)PASSWORD: {NotNull, VARCHAR(200)} */
    protected String _password;

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
        return "MEMBER";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_memberId == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param mailAddress (メールアドレス): UQ, NotNull, VARCHAR(200). (NotNull)
     */
    public void uniqueBy(String mailAddress) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("mailAddress");
        setMailAddress(mailAddress);
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** (退会情報)WITHDRAWAL by MEMBER_ID, named 'withdrawalAsOne'. */
    protected OptionalEntity<Withdrawal> _withdrawalAsOne;

    /**
     * [get] (退会情報)WITHDRAWAL by MEMBER_ID, named 'withdrawalAsOne'.
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return the entity of foreign property(referrer-as-one) 'withdrawalAsOne'. (NotNull, EmptyAllowed: when e.g. no data, no setupSelect)
     */
    public OptionalEntity<Withdrawal> getWithdrawalAsOne() {
        if (_withdrawalAsOne == null) { _withdrawalAsOne = OptionalEntity.relationEmpty(this, "withdrawalAsOne"); }
        return _withdrawalAsOne;
    }

    /**
     * [set] (退会情報)WITHDRAWAL by MEMBER_ID, named 'withdrawalAsOne'.
     * @param withdrawalAsOne The entity of foreign property(referrer-as-one) 'withdrawalAsOne'. (NullAllowed)
     */
    public void setWithdrawalAsOne(OptionalEntity<Withdrawal> withdrawalAsOne) {
        _withdrawalAsOne = withdrawalAsOne;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** (勘定科目)ACCOUNT_ITEM by MEMBER_ID, named 'accountItemList'. */
    protected List<AccountItem> _accountItemList;

    /**
     * [get] (勘定科目)ACCOUNT_ITEM by MEMBER_ID, named 'accountItemList'.
     * @return The entity list of referrer property 'accountItemList'. (NotNull: even if no loading, returns empty list)
     */
    public List<AccountItem> getAccountItemList() {
        if (_accountItemList == null) { _accountItemList = newReferrerList(); }
        return _accountItemList;
    }

    /**
     * [set] (勘定科目)ACCOUNT_ITEM by MEMBER_ID, named 'accountItemList'.
     * @param accountItemList The entity list of referrer property 'accountItemList'. (NullAllowed)
     */
    public void setAccountItemList(List<AccountItem> accountItemList) {
        _accountItemList = accountItemList;
    }

    /** (資産)ASSET by MEMBER_ID, named 'assetList'. */
    protected List<Asset> _assetList;

    /**
     * [get] (資産)ASSET by MEMBER_ID, named 'assetList'.
     * @return The entity list of referrer property 'assetList'. (NotNull: even if no loading, returns empty list)
     */
    public List<Asset> getAssetList() {
        if (_assetList == null) { _assetList = newReferrerList(); }
        return _assetList;
    }

    /**
     * [set] (資産)ASSET by MEMBER_ID, named 'assetList'.
     * @param assetList The entity list of referrer property 'assetList'. (NullAllowed)
     */
    public void setAssetList(List<Asset> assetList) {
        _assetList = assetList;
    }

    /** (明細)RECORD by MEMBER_ID, named 'recordList'. */
    protected List<Record> _recordList;

    /**
     * [get] (明細)RECORD by MEMBER_ID, named 'recordList'.
     * @return The entity list of referrer property 'recordList'. (NotNull: even if no loading, returns empty list)
     */
    public List<Record> getRecordList() {
        if (_recordList == null) { _recordList = newReferrerList(); }
        return _recordList;
    }

    /**
     * [set] (明細)RECORD by MEMBER_ID, named 'recordList'.
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
        if (obj instanceof BsMember) {
            BsMember other = (BsMember)obj;
            if (!xSV(_memberId, other._memberId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _memberId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_withdrawalAsOne != null && _withdrawalAsOne.isPresent())
        { sb.append(li).append(xbRDS(_withdrawalAsOne, "withdrawalAsOne")); }
        if (_accountItemList != null) { for (AccountItem et : _accountItemList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "accountItemList")); } } }
        if (_assetList != null) { for (Asset et : _assetList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "assetList")); } } }
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
        sb.append(dm).append(xfND(_memberId));
        sb.append(dm).append(xfND(_mailAddress));
        sb.append(dm).append(xfND(_name));
        sb.append(dm).append(xfND(_password));
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
        if (_withdrawalAsOne != null && _withdrawalAsOne.isPresent())
        { sb.append(dm).append("withdrawalAsOne"); }
        if (_accountItemList != null && !_accountItemList.isEmpty())
        { sb.append(dm).append("accountItemList"); }
        if (_assetList != null && !_assetList.isEmpty())
        { sb.append(dm).append("assetList"); }
        if (_recordList != null && !_recordList.isEmpty())
        { sb.append(dm).append("recordList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public Member clone() {
        return (Member)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (会員ID)MEMBER_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @return The value of the column 'MEMBER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getMemberId() {
        checkSpecifiedProperty("memberId");
        return _memberId;
    }

    /**
     * [set] (会員ID)MEMBER_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @param memberId The value of the column 'MEMBER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMemberId(Long memberId) {
        registerModifiedProperty("memberId");
        _memberId = memberId;
    }

    /**
     * [get] (メールアドレス)MAIL_ADDRESS: {UQ, NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'MAIL_ADDRESS'. (basically NotNull if selected: for the constraint)
     */
    public String getMailAddress() {
        checkSpecifiedProperty("mailAddress");
        return convertEmptyToNull(_mailAddress);
    }

    /**
     * [set] (メールアドレス)MAIL_ADDRESS: {UQ, NotNull, VARCHAR(200)} <br>
     * @param mailAddress The value of the column 'MAIL_ADDRESS'. (basically NotNull if update: for the constraint)
     */
    public void setMailAddress(String mailAddress) {
        registerModifiedProperty("mailAddress");
        _mailAddress = mailAddress;
    }

    /**
     * [get] (名前)NAME: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getName() {
        checkSpecifiedProperty("name");
        return convertEmptyToNull(_name);
    }

    /**
     * [set] (名前)NAME: {NotNull, VARCHAR(200)} <br>
     * @param name The value of the column 'NAME'. (basically NotNull if update: for the constraint)
     */
    public void setName(String name) {
        registerModifiedProperty("name");
        _name = name;
    }

    /**
     * [get] (パスワード)PASSWORD: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'PASSWORD'. (basically NotNull if selected: for the constraint)
     */
    public String getPassword() {
        checkSpecifiedProperty("password");
        return convertEmptyToNull(_password);
    }

    /**
     * [set] (パスワード)PASSWORD: {NotNull, VARCHAR(200)} <br>
     * @param password The value of the column 'PASSWORD'. (basically NotNull if update: for the constraint)
     */
    public void setPassword(String password) {
        registerModifiedProperty("password");
        _password = password;
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
}
