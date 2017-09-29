package com.huasheng.dao.newdao;


import com.huasheng.pojo.newpojo.KtClinicalTrialGene;

import java.util.List;

public interface KtClinicalTrialGeneDao {
    int deleteByPrimaryKey(KtClinicalTrialGene key);

    int insert(KtClinicalTrialGene record);

    int insertSelective(KtClinicalTrialGene record);

    KtClinicalTrialGene selectByPrimaryKey(KtClinicalTrialGene key);

    int updateByPrimaryKeySelective(KtClinicalTrialGene record);

    int updateByPrimaryKey(KtClinicalTrialGene record);

    KtClinicalTrialGene getClinicalTrialByClinicalTrialKey(String clinicalTrialKey);

    int insertList(List<KtClinicalTrialGene> ktClinicalTrialGeneList);
}