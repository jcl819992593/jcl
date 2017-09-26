package com.huasheng.dao.olddao;

import com.huasheng.pojo.oldpojo.OldKtDrugSynonym;

import java.util.List;

public interface OldKtDrugSynonymDao {
    int deleteByPrimaryKey(String id);

    int insert(OldKtDrugSynonym record);

    int insertSelective(OldKtDrugSynonym record);

    OldKtDrugSynonym selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(OldKtDrugSynonym record);

    int updateByPrimaryKey(OldKtDrugSynonym record);

    List<OldKtDrugSynonym> getDrugSynonymList();
}