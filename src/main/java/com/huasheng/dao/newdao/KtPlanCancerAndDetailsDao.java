package com.huasheng.dao.newdao;

import com.huasheng.pojo.newpojo.KtPlanCancerAndDetails;

public interface KtPlanCancerAndDetailsDao {
    int deleteByPrimaryKey(KtPlanCancerAndDetails key);

    int insert(KtPlanCancerAndDetails record);

    int insertSelective(KtPlanCancerAndDetails record);

    KtPlanCancerAndDetails selectByPrimaryKey(KtPlanCancerAndDetails key);

    int updateByPrimaryKeySelective(KtPlanCancerAndDetails record);

    int updateByPrimaryKey(KtPlanCancerAndDetails record);

    KtPlanCancerAndDetails getPlanCancerAndDetailsByKey(String medicationPlanKey);
}