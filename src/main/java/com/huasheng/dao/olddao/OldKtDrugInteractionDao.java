package com.huasheng.dao.olddao;

import com.huasheng.pojo.oldpojo.OldKtDrugInteraction;

import java.util.List;

public interface OldKtDrugInteractionDao {
    int deleteByPrimaryKey(String id);

    int insert(OldKtDrugInteraction record);

    int insertSelective(OldKtDrugInteraction record);

    OldKtDrugInteraction selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(OldKtDrugInteraction record);

    int updateByPrimaryKey(OldKtDrugInteraction record);

    List<OldKtDrugInteraction> getOldDrugInteractionList();
}