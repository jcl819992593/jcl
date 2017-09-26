package com.huasheng.dao.newdao;


import com.huasheng.pojo.newpojo.KtClinicalTrialCancer;

import java.util.List;

public interface KtClinicalTrialCancerDao {
    int deleteByPrimaryKey(KtClinicalTrialCancer key);

    int insert(KtClinicalTrialCancer record);

    int insertSelective(KtClinicalTrialCancer record);

    KtClinicalTrialCancer selectByPrimaryKey(KtClinicalTrialCancer key);

    int updateByPrimaryKeySelective(KtClinicalTrialCancer record);

    int updateByPrimaryKey(KtClinicalTrialCancer record);

    KtClinicalTrialCancer getClinicalTrialCancerByClinicalTrialKey(String clinicalTrialKey);

    int insertList(List<KtClinicalTrialCancer> list);
}