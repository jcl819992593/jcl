package com.huasheng.dao.olddao;

import com.huasheng.pojo.oldpojo.OldKtPlanInstructionMessage;

import java.util.List;

public interface OldKtPlanInstructionMessageDao {
    int deleteByPrimaryKey(String id);

    int insert(OldKtPlanInstructionMessage record);

    int insertSelective(OldKtPlanInstructionMessage record);

    OldKtPlanInstructionMessage selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(OldKtPlanInstructionMessage record);

    int updateByPrimaryKeyWithBLOBs(OldKtPlanInstructionMessage record);

    int updateByPrimaryKey(OldKtPlanInstructionMessage record);

    List<OldKtPlanInstructionMessage> getOldPlanInstructionMessageList();
}