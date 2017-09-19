package com.huasheng.dao.newdao;

import com.huasheng.pojo.newpojo.KtPlanNccn;

public interface KtPlanNccnDao {
    int deleteByPrimaryKey(String planNccnKey);

    int insert(KtPlanNccn record);

    int insertSelective(KtPlanNccn record);

    KtPlanNccn selectByPrimaryKey(String planNccnKey);

    int updateByPrimaryKeySelective(KtPlanNccn record);

    int updateByPrimaryKey(KtPlanNccn record);

    KtPlanNccn getPlanNccnByKey(String medicationPlanKey);
}