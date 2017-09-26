package com.huasheng.dao.olddao;

import com.huasheng.pojo.oldpojo.OldKtClinicalTrailOutcome;

import java.util.List;

public interface OldKtClinicalTrailOutcomeDao {
    int deleteByPrimaryKey(String id);

    int insert(OldKtClinicalTrailOutcome record);

    int insertSelective(OldKtClinicalTrailOutcome record);

    OldKtClinicalTrailOutcome selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(OldKtClinicalTrailOutcome record);

    int updateByPrimaryKey(OldKtClinicalTrailOutcome record);

    List<OldKtClinicalTrailOutcome> getOldClinicalTrailOutcomeList();
}