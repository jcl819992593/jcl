package com.huasheng.dao.newdao;

import com.huasheng.pojo.newpojo.KtDrugProductInstruction;

import java.util.List;

public interface KtDrugProductInstructionDao {
    int deleteByPrimaryKey(String instructionKey);

    int insert(KtDrugProductInstruction record);

    int insertSelective(KtDrugProductInstruction record);

    KtDrugProductInstruction selectByPrimaryKey(String instructionKey);

    int updateByPrimaryKeySelective(KtDrugProductInstruction record);

    int updateByPrimaryKey(KtDrugProductInstruction record);

    int addKtDrugProductInstruction(List<KtDrugProductInstruction> list);

    List<KtDrugProductInstruction> getInstructionByProductKey(String productKey);
    int deleteKtDrugProductInstruction(String productKey);
}