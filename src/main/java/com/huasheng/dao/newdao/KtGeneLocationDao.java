package com.huasheng.dao.newdao;

import com.huasheng.pojo.newpojo.KtGeneLocation;

import java.util.List;

public interface KtGeneLocationDao {
    int deleteByPrimaryKey(String geneLocationKey);

    int insert(KtGeneLocation record);

    int insertSelective(KtGeneLocation record);

    KtGeneLocation selectByPrimaryKey(String geneLocationKey);

    int updateByPrimaryKeySelective(KtGeneLocation record);

    int updateByPrimaryKey(KtGeneLocation record);

    KtGeneLocation selectByGeneKey(String geneKey);

    void deleteByGeneKey(String geneKey);

    int insertList(List<KtGeneLocation> list);
}