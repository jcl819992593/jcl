package com.huasheng.dao.newdao;

import com.huasheng.pojo.newpojo.KtPlanDrugMessage;

import java.util.List;

public interface KtPlanDrugMessageDao {
    int deleteByPrimaryKey(String planDrugMessageKey);

    int insert(KtPlanDrugMessage record);

    int insertSelective(KtPlanDrugMessage record);

    KtPlanDrugMessage selectByPrimaryKey(String planDrugMessageKey);

    int updateByPrimaryKeySelective(KtPlanDrugMessage record);

    int updateByPrimaryKey(KtPlanDrugMessage record);

    List<KtPlanDrugMessage> getKtPlanDrugMessageListByKey(String medicationPlanKey);

    int insertPlanDrugMessageList(List<KtPlanDrugMessage> list);

    int deleteByMedicationPlanKey(String medicationPlanKey);
}