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
package com.kakeibochan.dbflute.cbean.cq.ciq;

import java.util.Map;
import org.dbflute.cbean.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.ConditionOption;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import com.kakeibochan.dbflute.cbean.*;
import com.kakeibochan.dbflute.cbean.cq.bs.*;
import com.kakeibochan.dbflute.cbean.cq.*;

/**
 * The condition-query for in-line of ASSET.
 * @author DBFlute(AutoGenerator)
 */
public class AssetCIQ extends AbstractBsAssetCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsAssetCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AssetCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsAssetCQ myCQ) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
        _myCQ = myCQ;
        _foreignPropertyName = _myCQ.xgetForeignPropertyName(); // accept foreign property name
        _relationPath = _myCQ.xgetRelationPath(); // accept relation path
        _inline = true;
    }

    // ===================================================================================
    //                                                             Override about Register
    //                                                             =======================
    protected void reflectRelationOnUnionQuery(ConditionQuery bq, ConditionQuery uq)
    { throw new IllegalConditionBeanOperationException("InlineView cannot use Union: " + bq + " : " + uq); }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col)
    { regIQ(k, v, cv, col); }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col, ConditionOption op)
    { regIQ(k, v, cv, col, op); }

    @Override
    protected void registerWhereClause(String wc)
    { registerInlineWhereClause(wc); }

    @Override
    protected boolean isInScopeRelationSuppressLocalAliasName() {
        if (_onClause) { throw new IllegalConditionBeanOperationException("InScopeRelation on OnClause is unsupported."); }
        return true;
    }

    // ===================================================================================
    //                                                                Override about Query
    //                                                                ====================
    protected ConditionValue xgetCValueAssetId() { return _myCQ.xdfgetAssetId(); }
    public String keepAssetId_ExistsReferrer_RecordByWithdrawalAccountIdList(RecordCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepAssetId_ExistsReferrer_RecordByDepositAccountIdList(RecordCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepAssetId_NotExistsReferrer_RecordByWithdrawalAccountIdList(RecordCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepAssetId_NotExistsReferrer_RecordByDepositAccountIdList(RecordCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepAssetId_SpecifyDerivedReferrer_RecordByWithdrawalAccountIdList(RecordCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepAssetId_SpecifyDerivedReferrer_RecordByDepositAccountIdList(RecordCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepAssetId_QueryDerivedReferrer_RecordByWithdrawalAccountIdList(RecordCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepAssetId_QueryDerivedReferrer_RecordByWithdrawalAccountIdListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepAssetId_QueryDerivedReferrer_RecordByDepositAccountIdList(RecordCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepAssetId_QueryDerivedReferrer_RecordByDepositAccountIdListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueMemberId() { return _myCQ.xdfgetMemberId(); }
    protected ConditionValue xgetCValueAssetName() { return _myCQ.xdfgetAssetName(); }
    protected ConditionValue xgetCValueDelFlg() { return _myCQ.xdfgetDelFlg(); }
    protected ConditionValue xgetCValueRegisterDatetime() { return _myCQ.xdfgetRegisterDatetime(); }
    protected ConditionValue xgetCValueRegisterUser() { return _myCQ.xdfgetRegisterUser(); }
    protected ConditionValue xgetCValueUpdateDatetime() { return _myCQ.xdfgetUpdateDatetime(); }
    protected ConditionValue xgetCValueUpdateUser() { return _myCQ.xdfgetUpdateUser(); }
    protected ConditionValue xgetCValueVersionNo() { return _myCQ.xdfgetVersionNo(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(AssetCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(AssetCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(AssetCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(AssetCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return AssetCB.class.getName(); }
    protected String xinCQ() { return AssetCQ.class.getName(); }
}
