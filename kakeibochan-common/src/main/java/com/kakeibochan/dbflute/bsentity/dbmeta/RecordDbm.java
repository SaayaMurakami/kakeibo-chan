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
 * The DB meta of RECORD. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class RecordDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final RecordDbm _instance = new RecordDbm();
    private RecordDbm() {}
    public static RecordDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((Record)et).getRecordId(), (et, vl) -> ((Record)et).setRecordId(ctl(vl)), "recordId");
        setupEpg(_epgMap, et -> ((Record)et).getMemberId(), (et, vl) -> ((Record)et).setMemberId(ctl(vl)), "memberId");
        setupEpg(_epgMap, et -> ((Record)et).getAccountItemId(), (et, vl) -> ((Record)et).setAccountItemId(ctl(vl)), "accountItemId");
        setupEpg(_epgMap, et -> ((Record)et).getDepositAccountId(), (et, vl) -> ((Record)et).setDepositAccountId(ctl(vl)), "depositAccountId");
        setupEpg(_epgMap, et -> ((Record)et).getWithdrawalAccountId(), (et, vl) -> ((Record)et).setWithdrawalAccountId(ctl(vl)), "withdrawalAccountId");
        setupEpg(_epgMap, et -> ((Record)et).getDate(), (et, vl) -> ((Record)et).setDate(ctld(vl)), "date");
        setupEpg(_epgMap, et -> ((Record)et).getAmount(), (et, vl) -> ((Record)et).setAmount(cti(vl)), "amount");
        setupEpg(_epgMap, et -> ((Record)et).getMemo(), (et, vl) -> ((Record)et).setMemo((String)vl), "memo");
        setupEpg(_epgMap, et -> ((Record)et).getDelFlg(), (et, vl) -> {
            CDef.Flg cls = (CDef.Flg)gcls(et, columnDelFlg(), vl);
            if (cls != null) {
                ((Record)et).setDelFlgAsFlg(cls);
            } else {
                ((Record)et).mynativeMappingDelFlg((String)vl);
            }
        }, "delFlg");
        setupEpg(_epgMap, et -> ((Record)et).getRegisterDatetime(), (et, vl) -> ((Record)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((Record)et).getRegisterUser(), (et, vl) -> ((Record)et).setRegisterUser((String)vl), "registerUser");
        setupEpg(_epgMap, et -> ((Record)et).getUpdateDatetime(), (et, vl) -> ((Record)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
        setupEpg(_epgMap, et -> ((Record)et).getUpdateUser(), (et, vl) -> ((Record)et).setUpdateUser((String)vl), "updateUser");
        setupEpg(_epgMap, et -> ((Record)et).getVersionNo(), (et, vl) -> ((Record)et).setVersionNo(ctl(vl)), "versionNo");
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
        setupEfpg(_efpgMap, et -> ((Record)et).getAccountItem(), (et, vl) -> ((Record)et).setAccountItem((OptionalEntity<AccountItem>)vl), "accountItem");
        setupEfpg(_efpgMap, et -> ((Record)et).getAssetByWithdrawalAccountId(), (et, vl) -> ((Record)et).setAssetByWithdrawalAccountId((OptionalEntity<Asset>)vl), "assetByWithdrawalAccountId");
        setupEfpg(_efpgMap, et -> ((Record)et).getMember(), (et, vl) -> ((Record)et).setMember((OptionalEntity<Member>)vl), "member");
        setupEfpg(_efpgMap, et -> ((Record)et).getAssetByDepositAccountId(), (et, vl) -> ((Record)et).setAssetByDepositAccountId((OptionalEntity<Asset>)vl), "assetByDepositAccountId");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "RECORD";
    protected final String _tableDispName = "RECORD";
    protected final String _tablePropertyName = "record";
    protected final TableSqlName _tableSqlName = new TableSqlName("RECORD", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }
    protected final String _tableAlias = "明細";
    public String getTableAlias() { return _tableAlias; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnRecordId = cci("RECORD_ID", "RECORD_ID", null, "明細ID", Long.class, "recordId", null, true, true, true, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMemberId = cci("MEMBER_ID", "MEMBER_ID", null, "会員ID", Long.class, "memberId", null, false, false, true, "BIGINT", 19, 0, null, null, false, null, null, "member", null, null, false);
    protected final ColumnInfo _columnAccountItemId = cci("ACCOUNT_ITEM_ID", "ACCOUNT_ITEM_ID", null, "勘定科目ID", Long.class, "accountItemId", null, false, false, true, "BIGINT", 19, 0, null, null, false, null, null, "accountItem", null, null, false);
    protected final ColumnInfo _columnDepositAccountId = cci("DEPOSIT_ACCOUNT_ID", "DEPOSIT_ACCOUNT_ID", null, "入金先口座ID", Long.class, "depositAccountId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, "assetByDepositAccountId", null, null, false);
    protected final ColumnInfo _columnWithdrawalAccountId = cci("WITHDRAWAL_ACCOUNT_ID", "WITHDRAWAL_ACCOUNT_ID", null, "出金元口座ID", Long.class, "withdrawalAccountId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, "assetByWithdrawalAccountId", null, null, false);
    protected final ColumnInfo _columnDate = cci("DATE", "DATE", null, "日付", java.time.LocalDate.class, "date", null, false, false, true, "DATE", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAmount = cci("AMOUNT", "AMOUNT", null, "金額", Integer.class, "amount", null, false, false, true, "INT", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMemo = cci("MEMO", "MEMO", null, "メモ", String.class, "memo", null, false, false, false, "VARCHAR", 200, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelFlg = cci("DEL_FLG", "DEL_FLG", null, "削除フラグ", String.class, "delFlg", null, false, false, true, "CHAR", 1, 0, null, null, false, null, null, null, null, CDef.DefMeta.Flg, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("REGISTER_DATETIME", "REGISTER_DATETIME", null, "登録日時", java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterUser = cci("REGISTER_USER", "REGISTER_USER", null, "登録ユーザー", String.class, "registerUser", null, false, false, true, "VARCHAR", 200, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("UPDATE_DATETIME", "UPDATE_DATETIME", null, "更新日時", java.time.LocalDateTime.class, "updateDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateUser = cci("UPDATE_USER", "UPDATE_USER", null, "更新ユーザー", String.class, "updateUser", null, false, false, true, "VARCHAR", 200, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, "バージョン番号", Long.class, "versionNo", null, false, false, true, "BIGINT", 19, 0, null, null, false, OptimisticLockType.VERSION_NO, null, null, null, null, false);

    /**
     * (明細ID)RECORD_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRecordId() { return _columnRecordId; }
    /**
     * (会員ID)MEMBER_ID: {IX, NotNull, BIGINT(19), FK to MEMBER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberId() { return _columnMemberId; }
    /**
     * (勘定科目ID)ACCOUNT_ITEM_ID: {IX, NotNull, BIGINT(19), FK to ACCOUNT_ITEM}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAccountItemId() { return _columnAccountItemId; }
    /**
     * (入金先口座ID)DEPOSIT_ACCOUNT_ID: {IX, BIGINT(19), FK to ASSET}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDepositAccountId() { return _columnDepositAccountId; }
    /**
     * (出金元口座ID)WITHDRAWAL_ACCOUNT_ID: {IX, BIGINT(19), FK to ASSET}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWithdrawalAccountId() { return _columnWithdrawalAccountId; }
    /**
     * (日付)DATE: {NotNull, DATE(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDate() { return _columnDate; }
    /**
     * (金額)AMOUNT: {NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAmount() { return _columnAmount; }
    /**
     * (メモ)MEMO: {VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemo() { return _columnMemo; }
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
        ls.add(columnRecordId());
        ls.add(columnMemberId());
        ls.add(columnAccountItemId());
        ls.add(columnDepositAccountId());
        ls.add(columnWithdrawalAccountId());
        ls.add(columnDate());
        ls.add(columnAmount());
        ls.add(columnMemo());
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
    protected UniqueInfo cpui() { return hpcpui(columnRecordId()); }
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
     * (勘定科目)ACCOUNT_ITEM by my ACCOUNT_ITEM_ID, named 'accountItem'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignAccountItem() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnAccountItemId(), AccountItemDbm.getInstance().columnAccountItemId());
        return cfi("record_ibfk_1", "accountItem", this, AccountItemDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "recordList", false);
    }
    /**
     * (資産)ASSET by my WITHDRAWAL_ACCOUNT_ID, named 'assetByWithdrawalAccountId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignAssetByWithdrawalAccountId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnWithdrawalAccountId(), AssetDbm.getInstance().columnAssetId());
        return cfi("record_ibfk_2", "assetByWithdrawalAccountId", this, AssetDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "recordByWithdrawalAccountIdList", false);
    }
    /**
     * (会員)MEMBER by my MEMBER_ID, named 'member'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMember() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), MemberDbm.getInstance().columnMemberId());
        return cfi("record_ibfk_4", "member", this, MemberDbm.getInstance(), mp, 2, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "recordList", false);
    }
    /**
     * (資産)ASSET by my DEPOSIT_ACCOUNT_ID, named 'assetByDepositAccountId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignAssetByDepositAccountId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDepositAccountId(), AssetDbm.getInstance().columnAssetId());
        return cfi("record_ibfk_3", "assetByDepositAccountId", this, AssetDbm.getInstance(), mp, 3, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "recordByDepositAccountIdList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

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
    public String getEntityTypeName() { return "com.kakeibochan.dbflute.exentity.Record"; }
    public String getConditionBeanTypeName() { return "com.kakeibochan.dbflute.cbean.RecordCB"; }
    public String getBehaviorTypeName() { return "com.kakeibochan.dbflute.exbhv.RecordBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<Record> getEntityType() { return Record.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Record newEntity() { return new Record(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((Record)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((Record)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
