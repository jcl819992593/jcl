package com.huasheng.dao.olddao;

import com.huasheng.pojo.oldpojo.OldKtGene;

import java.util.List;

public interface OldKtGeneDao {
    int deleteByPrimaryKey(String id);

    int insert(OldKtGene record);

    int insertSelective(OldKtGene record);

    OldKtGene selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(OldKtGene record);

    int updateByPrimaryKey(OldKtGene record);

    List<OldKtGene> getOldGeneList();

    OldKtGene selectById(Integer geneId);
}