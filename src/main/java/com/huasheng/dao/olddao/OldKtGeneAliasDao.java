package com.huasheng.dao.olddao;

import com.huasheng.pojo.oldpojo.OldKtGeneAlias;

import java.util.List;

public interface OldKtGeneAliasDao {
    int deleteByPrimaryKey(String id);

    int insert(OldKtGeneAlias record);

    int insertSelective(OldKtGeneAlias record);

    OldKtGeneAlias selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(OldKtGeneAlias record);

    int updateByPrimaryKey(OldKtGeneAlias record);

    List<OldKtGeneAlias> getOldKtGeneAliasList();
}