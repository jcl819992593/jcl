package com.huasheng.dao.olddao;

import com.huasheng.pojo.oldpojo.OldKtChemicalSynonym;

import java.util.List;

public interface OldKtChemicalSynonymDao {
    int deleteByPrimaryKey(String id);

    int insert(OldKtChemicalSynonym record);

    int insertSelective(OldKtChemicalSynonym record);

    OldKtChemicalSynonym selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(OldKtChemicalSynonym record);

    int updateByPrimaryKey(OldKtChemicalSynonym record);

    List<OldKtChemicalSynonym> getOldKtChemicalSynonyms();
}