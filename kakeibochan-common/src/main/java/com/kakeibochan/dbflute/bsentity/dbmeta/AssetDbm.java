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
package com.kakeibochan.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.optional.OptionalEntity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import com.kakeibochan.dbflute.allcommon.*;
import com.kakeibochan.dbflute.exentity.*;

/**
 * The DB meta of ASSET. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class AssetDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final AssetDbm _instance = new AssetDbm();
    private AssetDbm() {}
    public static AssetDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public String getProjectName() { return DBCurrent.getInstance().projectName(); }
    public String getProjectPrefix() { return DBCurrent.getInstance().projectPrefix(); }
    public String getGenerationGapBasePrefix() { return DBCurrent.getInstance().generationGapBasePrefix(); }
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    { xsetupEpg(); }
    protected void xsetupEpg() {
        setupEpg(_epgMap, et -> ((Asset)et).getAssetId(), (et, vl) -> ((Asset)et).setAssetId(ctl(vl)), "assetId");
        setupEpg(_epgMap, et -> ((Asset)et).getMemberId(), (et, vl) -> ((Asset)et).setMemberId(ctl(vl)), "memberId");
        setupEpg(_epgMap, et -> ((Asset)et).getAssetName(), (et, vl) -> ((Asset)et).setAssetName((String)vl), "assetName");
        setupEpg(_epgMap, et -> ((Asset)et).getDelFlg(), (et, vl) -> {
            CDef.Flg cls = (CDef.Flg)gcls(et, columnDelFlg(), vl);
            if (cls != null) {
                ((Asset)et).setDelFlgAsFlg(cls);
            } else {
                ((Asset)et).mynativeMappingDelFlg((String)vl);
            }
        }, "delFlg");
        setupEpg(_epgMap, et -> ((Asset)et).getRegisterDatetime(), (et, vl) -> ((Asset)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((Asset)et).getRegisterUser(), (et, vl) -> ((Asset)et).setRegisterUser((String)vl), "registerUser");
        setupEpg(_epgMap, et -> ((Asset)et).getUpdateDatetime(), (et, vl) -> ((Asset)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
        setupEpg(_epgMap, et -> ((Asset)et).getUpdateUser(), (et, vl) -> ((Asset)et).setUpdateUser((String)vl), "updateUser");
        setupEpg(_epgMap, et -> ((Asset)et).getVersionNo(), (et, vl) -> ((Asset)et).setVersionNo(ctl(vl)), "versionNo");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    @SuppressWarnings("unchecked")
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((Asset)et).getMember(), (et, vl) -> ((Asset)et).setMember((OptionalEntity<Member>)vl), "member");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "ASSET";
    protected final String _tableDispName = "ASSET";
    protected final String _tablePropertyName = "asset";
    protected final TableSqlName _tableSqlName = new TableSqlName("ASSET", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }
    protected final String _tableAlias = "資産";
    public String getTableAlias() { return _tableAlias; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnAssetId = cci("ASSET_ID", "ASSET_ID", null, "資産ID", Long.class, "assetId", null, true, true, true, "BIGINT", 19, 0, null, null, false, null, null, null, "recordByDepositAccountIdList,recordByWithdrawalAccountIdList", null, false);
    protected final ColumnInfo _columnMemberId = cci("MEMBER_ID", "MEMBER_ID", null, "会員ID", Long.class, "memberId", null, false, false, true, "BIGINT", 19, 0, null, null, false, null, null, "member", null, null, false);
    protected final ColumnInfo _columnAssetName = cci("ASSET_NAME", "ASSET_NAME", null, "資産名", String.class, "assetName", null, false, false, true, "VARCHAR", 200, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelFlg = cci("DEL_FLG", "DEL_FLG", null, "削除フラグ", String.class, "delFlg", null, false, false, true, "CHAR", 1, 0, null, null, false, null, null, null, null, CDef.DefMeta.Flg, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("REGISTER_DATETIME", "REGISTER_DATETIME", null, "登録日時", java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterUser = cci("REGISTER_USER", "REGISTER_USER", null, "登録ユーザー", String.class, "registerUser", null, false, false, true, "VARCHAR", 200, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("UPDATE_DATETIME", "UPDATE_DATETIME", null, "更新日時", java.time.LocalDateTime.class, "updateDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateUser = cci("UPDATE_USER", "UPDATE_USER", null, "更新ユーザー", String.class, "updateUser", null, false, false, true, "VARCHAR", 200, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, "バージョン番号", Long.class, "versionNo", null, false, false, true, "BIGINT", 19, 0, null, null, false, OptimisticLockType.VERSION_NO, null, null, null, null, false);

    /**
     * (資産ID)ASSET_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAssetId() { return _columnAssetId; }
    /**
     * (会員ID)MEMBER_ID: {IX, NotNull, BIGINT(19), FK to MEMBER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberId() { return _columnMemberId; }
    /**
     * (資産名)ASSET_NAME: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAssetName() { return _columnAssetName; }
    /**
     * (削除フラグ)DEL_FLG: {NotNull, CHAR(1), classification=Flg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelFlg() { return _columnDelFlg; }
    /**
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterDatetime() { return _columnRegisterDatetime; }
    /**
     * (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterUser() { return _columnRegisterUser; }
    /**
     * (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateDatetime() { return _columnUpdateDatetime; }
    /**
     * (更新ユーザー)UPDATE_USER: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateUser() { return _columnUpdateUser; }
    /**
     * (バージョン番号)VERSION_NO: {NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVersionNo() { return _columnVersionNo; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnAssetId());
        ls.add(columnMemberId());
        ls.add(columnAssetName());
        ls.add(columnDelFlg());
        ls.add(columnRegisterDatetime());
        ls.add(columnRegisterUser());
        ls.add(columnUpdateDatetime());
        ls.add(columnUpdateUser());
        ls.add(columnVersionNo());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnAssetId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * (会員)MEMBER by my MEMBER_ID, named 'member'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMember() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), MemberDbm.getInstance().columnMemberId());
        return cfi("asset_ibfk_1", "member", this, MemberDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "assetList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * (明細)RECORD by DEPOSIT_ACCOUNT_ID, named 'recordByDepositAccountIdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerRecordByDepositAccountIdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnAssetId(), RecordDbm.getInstance().columnDepositAccountId());
        return cri("record_ibfk_2", "recordByDepositAccountIdList", this, RecordDbm.getInstance(), mp, false, "assetByDepositAccountId");
    }
    /**
     * (明細)RECORD by WITHDRAWAL_ACCOUNT_ID, named 'recordByWithdrawalAccountIdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerRecordByWithdrawalAccountIdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnAssetId(), RecordDbm.getInstance().columnWithdrawalAccountId());
        return cri("record_ibfk_3", "recordByWithdrawalAccountIdList", this, RecordDbm.getInstance(), mp, false, "assetByWithdrawalAccountId");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }
    public boolean hasVersionNo() { return true; }
    public ColumnInfo getVersionNoColumnInfo() { return _columnVersionNo; }
    public boolean hasCommonColumn() { return true; }
    public List<ColumnInfo> getCommonColumnInfoList()
    { return newArrayList(columnRegisterDatetime(), columnRegisterUser(), columnUpdateDatetime(), columnUpdateUser()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeInsertList()
    { return newArrayList(columnRegisterDatetime(), columnRegisterUser(), columnUpdateDatetime(), columnUpdateUser()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeUpdateList()
    { return newArrayList(columnUpdateDatetime(), columnUpdateUser()); }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.kakeibochan.dbflute.exentity.Asset"; }
    public String getConditionBeanTypeName() { return "com.kakeibochan.dbflute.cbean.AssetCB"; }
    public String getBehaviorTypeName() { return "com.kakeibochan.dbflute.exbhv.AssetBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<Asset> getEntityType() { return Asset.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Asset newEntity() { return new Asset(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((Asset)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((Asset)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
