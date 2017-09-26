package com.huasheng.dao.kndao;

import com.huasheng.pojo.knpojo.KnInheritedTumorSyndromeGene;

import java.util.List;

public interface KnInheritedTumorSyndromeGeneDao {
    int deleteByPrimaryKey(String id);

    int insert(KnInheritedTumorSyndromeGene record);

    int insertSelective(KnInheritedTumorSyndromeGene record);

    KnInheritedTumorSyndromeGene selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(KnInheritedTumorSyndromeGene record);

    int updateByPrimaryKey(KnInheritedTumorSyndromeGene record);

    List<KnInheritedTumorSyndromeGene> getKnInheritedTumorSyndromeGeneList();
}