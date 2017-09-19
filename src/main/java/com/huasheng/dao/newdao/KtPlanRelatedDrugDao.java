package com.huasheng.dao.newdao;

import com.huasheng.pojo.newpojo.KtPlanRelatedDrug;

public interface KtPlanRelatedDrugDao {
    int deleteByPrimaryKey(KtPlanRelatedDrug key);

    int insert(KtPlanRelatedDrug record);

    int insertSelective(KtPlanRelatedDrug record);

    KtPlanRelatedDrug selectByPrimaryKey(KtPlanRelatedDrug key);

    int updateByPrimaryKeySelective(KtPlanRelatedDrug record);

    int updateByPrimaryKey(KtPlanRelatedDrug record);

    KtPlanRelatedDrug getPlanRelatedDrugByKey(String medicationPlanKey);
}