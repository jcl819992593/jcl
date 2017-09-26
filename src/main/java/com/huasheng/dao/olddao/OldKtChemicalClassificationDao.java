package com.huasheng.dao.olddao;

import com.huasheng.pojo.oldpojo.OldKtChemicalClassification;

import java.util.List;

public interface OldKtChemicalClassificationDao {
    int deleteByPrimaryKey(String id);

    int insert(OldKtChemicalClassification record);

    int insertSelective(OldKtChemicalClassification record);

    OldKtChemicalClassification selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(OldKtChemicalClassification record);

    int updateByPrimaryKey(OldKtChemicalClassification record);

    List<OldKtChemicalClassification> getChemicalList();
}