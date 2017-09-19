package com.huasheng.dao.newdao;


import com.huasheng.pojo.newpojo.KtClinicalTrialOutcome;

import java.util.List;

public interface KtClinicalTrialOutcomeDao {
    int deleteByPrimaryKey(String clinicalTrialOutcomeKey);

    int insert(KtClinicalTrialOutcome record);

    int insertSelective(KtClinicalTrialOutcome record);

    KtClinicalTrialOutcome selectByPrimaryKey(String clinicalTrialOutcomeKey);

    int updateByPrimaryKeySelective(KtClinicalTrialOutcome record);

    int updateByPrimaryKey(KtClinicalTrialOutcome record);

    int insertList(List<KtClinicalTrialOutcome> ktClinicalTrialOutcomes);

    List<KtClinicalTrialOutcome> getClinicalTrialOutcomeByClinicalTrialKey(String clinicalTrialKey);

    int deleteByClinicalTrialKey(String clinicalTrialKey);
}