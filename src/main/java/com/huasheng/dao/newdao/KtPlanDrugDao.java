package com.huasheng.dao.newdao;

import com.huasheng.pojo.newpojo.KtPlanDrug;

import java.util.List;

public interface KtPlanDrugDao {
    int deleteByPrimaryKey(KtPlanDrug key);

    int insert(KtPlanDrug record);

    int insertSelective(KtPlanDrug record);

    KtPlanDrug selectByPrimaryKey(KtPlanDrug key);

    int updateByPrimaryKeySelective(KtPlanDrug record);

    int updateByPrimaryKey(KtPlanDrug record);

    List<KtPlanDrug> getktPlanDrugList(String medicationPlanKey);

    int insertPlanDrugList(List<KtPlanDrug> list);

    int deleteByMedicationPlanKey(String medicationPlanKey);
}