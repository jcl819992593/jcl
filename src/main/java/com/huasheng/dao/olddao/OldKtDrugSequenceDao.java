package com.huasheng.dao.olddao;

import com.huasheng.pojo.oldpojo.OldKtDrugSequence;

import java.util.List;

public interface OldKtDrugSequenceDao {
    int deleteByPrimaryKey(String id);

    int insert(OldKtDrugSequence record);

    int insertSelective(OldKtDrugSequence record);

    OldKtDrugSequence selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(OldKtDrugSequence record);

    int updateByPrimaryKey(OldKtDrugSequence record);

    List<OldKtDrugSequence> getOldKtDrugSequenceList();
}