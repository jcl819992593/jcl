package com.huasheng.dao.newdao;

import com.huasheng.pojo.newpojo.KtMedicationPlan;

import java.util.List;
import java.util.Map;

public interface KtMedicationPlanDao {
    int deleteByPrimaryKey(String medicationPlanKey);

    int insert(KtMedicationPlan record);

    int insertSelective(KtMedicationPlan record);

    KtMedicationPlan selectByPrimaryKey(String medicationPlanKey);

    int updateByPrimaryKeySelective(KtMedicationPlan record);

    int updateByPrimaryKey(KtMedicationPlan record);

    List<Map<String,Object>> getMedicationPlanList(Map<String, Object> map);

    int updateCheckState(KtMedicationPlan ktMedicationPlank);

    int getMedicationPlanCount(Map<String, Object> map);

    int getMedicationPlanCountMonth(Map<String, Object> map);

    int deleteAllMedicationPlan();
}