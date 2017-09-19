package com.huasheng.dao.newdao;

import com.huasheng.pojo.newpojo.KtPlanInstructionMessage;

import java.util.List;

public interface KtPlanInstructionMessageDao {
    int deleteByPrimaryKey(String planInstructionMessageKey);

    int insert(KtPlanInstructionMessage record);

    int insertSelective(KtPlanInstructionMessage record);

    KtPlanInstructionMessage selectByPrimaryKey(String planInstructionMessageKey);

    int updateByPrimaryKeySelective(KtPlanInstructionMessage record);

    int updateByPrimaryKey(KtPlanInstructionMessage record);

    List<KtPlanInstructionMessage> getKtPlanInstructionMessageList(String planInstructionKey);

    int insertPlanInstructionMessageList(List<KtPlanInstructionMessage> list);
}