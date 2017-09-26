package com.huasheng.dao.olddao;

import com.huasheng.pojo.oldpojo.OldKtProteinSynonym;

import java.util.List;

public interface OldKtProteinSynonymDao {
    int deleteByPrimaryKey(String id);

    int insert(OldKtProteinSynonym record);

    int insertSelective(OldKtProteinSynonym record);

    OldKtProteinSynonym selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(OldKtProteinSynonym record);

    int updateByPrimaryKey(OldKtProteinSynonym record);

    List<OldKtProteinSynonym> getOldKtProteinSynonymList();
}