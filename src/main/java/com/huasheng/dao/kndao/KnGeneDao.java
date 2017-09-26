package com.huasheng.dao.kndao;

import com.huasheng.pojo.knpojo.KnGene;

import java.util.List;

public interface KnGeneDao {
    int deleteByPrimaryKey(String id);

    int insert(KnGene record);

    int insertSelective(KnGene record);

    KnGene selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(KnGene record);

    int updateByPrimaryKey(KnGene record);

    List<KnGene> getKnGeneList();
}