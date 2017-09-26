package com.huasheng.dao.newdao;

import com.huasheng.pojo.newpojo.KtPlanInstruction;

import java.util.List;

public interface KtPlanInstructionDao {
    int deleteByPrimaryKey(String planInstructionKey);

    int insert(KtPlanInstruction record);

    int insertSelective(KtPlanInstruction record);

    KtPlanInstruction selectByPrimaryKey(String planInstructionKey);

    int updateByPrimaryKeySelective(KtPlanInstruction record);

    int updateByPrimaryKey(KtPlanInstruction record);

    List<KtPlanInstruction> getPlanInstructionList(String medicationPlanKey);

    int insertPlanInstructionList(List<KtPlanInstruction> list);

    int deleteByMedicationPlanKey(String medicationPlanKey);

    KtPlanInstruction selectById(Integer instructionId);
}