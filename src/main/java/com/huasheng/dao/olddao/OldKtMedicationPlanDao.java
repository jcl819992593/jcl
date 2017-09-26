package com.huasheng.dao.olddao;

import com.huasheng.pojo.oldpojo.OldKtMedicationPlan;

import java.util.List;

public interface OldKtMedicationPlanDao {
    int deleteByPrimaryKey(String id);

    int insert(OldKtMedicationPlan record);

    int insertSelective(OldKtMedicationPlan record);

    OldKtMedicationPlan selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(OldKtMedicationPlan record);

    int updateByPrimaryKey(OldKtMedicationPlan record);

    List<OldKtMedicationPlan> getOldKtMedicationPlanList();
}