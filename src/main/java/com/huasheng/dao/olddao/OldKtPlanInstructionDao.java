package com.huasheng.dao.olddao;

import com.huasheng.pojo.oldpojo.OldKtPlanInstruction;

import java.util.List;

public interface OldKtPlanInstructionDao {
    int deleteByPrimaryKey(String id);

    int insert(OldKtPlanInstruction record);

    int insertSelective(OldKtPlanInstruction record);

    OldKtPlanInstruction selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(OldKtPlanInstruction record);

    int updateByPrimaryKey(OldKtPlanInstruction record);

    List<OldKtPlanInstruction> getOldPlanInstructionList();
}