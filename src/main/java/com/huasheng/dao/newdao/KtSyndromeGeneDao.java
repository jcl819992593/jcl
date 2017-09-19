package com.huasheng.dao.newdao;

import com.huasheng.pojo.newpojo.KtSyndromeGene;

import java.util.List;

public interface KtSyndromeGeneDao {
    int deleteByPrimaryKey(KtSyndromeGene key);

    int insert(KtSyndromeGene record);

    int insertSelective(KtSyndromeGene record);

    KtSyndromeGene selectByPrimaryKey(KtSyndromeGene key);

    int updateByPrimaryKeySelective(KtSyndromeGene record);

    int updateByPrimaryKey(KtSyndromeGene record);

    int insertMore(List<KtSyndromeGene> list);

    List<KtSyndromeGene> getSyndromeGeneList(String syndromeKey);

    int deleteByKey(String syndromeKey);
}