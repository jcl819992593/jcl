package com.huasheng.dao.newdao;

import com.huasheng.pojo.newpojo.KtDrugClinicalTrial;

public interface KtDrugClinicalTrialDao {
    int deleteByPrimaryKey(KtDrugClinicalTrial key);

    int insert(KtDrugClinicalTrial record);

    int insertSelective(KtDrugClinicalTrial record);

    KtDrugClinicalTrial selectByPrimaryKey(KtDrugClinicalTrial key);

    int updateByPrimaryKeySelective(KtDrugClinicalTrial record);

    int updateByPrimaryKey(KtDrugClinicalTrial record);

    KtDrugClinicalTrial getDrugClinicalTrialByClinicalTrialKey(String clinicalTrialKey);
}