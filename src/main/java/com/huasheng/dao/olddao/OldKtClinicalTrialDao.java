package com.huasheng.dao.olddao;

import com.huasheng.pojo.oldpojo.OldKtClinicalTrial;

import java.util.List;

public interface OldKtClinicalTrialDao {
    int deleteByPrimaryKey(String id);

    int insert(OldKtClinicalTrial record);

    int insertSelective(OldKtClinicalTrial record);

    OldKtClinicalTrial selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(OldKtClinicalTrial record);

    int updateByPrimaryKey(OldKtClinicalTrial record);

    List<OldKtClinicalTrial> getOldKtClinicalTrialList();
}