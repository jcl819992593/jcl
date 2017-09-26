package com.huasheng.dao.newdao;

import com.huasheng.pojo.newpojo.KtPlanCancer;

import java.util.List;

public interface KtPlanCancerDao {
    int deleteByPrimaryKey(KtPlanCancer key);

    int insert(KtPlanCancer record);

    int insertSelective(KtPlanCancer record);

    KtPlanCancer selectByPrimaryKey(KtPlanCancer key);

    int updateByPrimaryKeySelective(KtPlanCancer record);

    int updateByPrimaryKey(KtPlanCancer record);

    KtPlanCancer getPlanCancerListByKey(String medicationPlanKey);

    int insertList(List<KtPlanCancer> list);
}