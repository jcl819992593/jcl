package com.huasheng.dao.newdao;

import com.huasheng.pojo.newpojo.KtGeneAlias;

import java.util.List;

public interface KtGeneAliasDao {
    int deleteByPrimaryKey(String geneAliasKey);

    int insert(KtGeneAlias record);

    int insertSelective(KtGeneAlias record);

    KtGeneAlias selectByPrimaryKey(String geneAliasKey);

    int updateByPrimaryKeySelective(KtGeneAlias record);

    int updateByPrimaryKey(KtGeneAlias record);

    int addKtGeneAlias(List<KtGeneAlias> list);

    List<KtGeneAlias> selectByGeneKey(String geneKey);

    void deleteByGeneKey(String geneKey);

    int deleteAllGeneAlias();
}