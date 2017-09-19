package com.huasheng.dao.newdao;

import com.huasheng.pojo.newpojo.KtScientificResearchGene;

import java.util.List;

public interface KtScientificResearchGeneDao {

    int insert(KtScientificResearchGene record);

    int insertSelective(KtScientificResearchGene record);

    List<KtScientificResearchGene> selectByPrimaryKey(String researchKey);

    int updateByPrimaryKeySelective(KtScientificResearchGene record);

    int updateByPrimaryKey(KtScientificResearchGene record);

    int insertMore(List<KtScientificResearchGene> list);

    int deleteByPrimaryKey(String researchKey);
}