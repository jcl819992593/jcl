package com.huasheng.dao.kndao;

import com.huasheng.pojo.knpojo.KnScientficResearchGene;

import java.util.List;

public interface KnScientficResearchGeneDao {
    int deleteByPrimaryKey(String id);

    int insert(KnScientficResearchGene record);

    int insertSelective(KnScientficResearchGene record);

    KnScientficResearchGene selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(KnScientficResearchGene record);

    int updateByPrimaryKey(KnScientficResearchGene record);

    List<KnScientficResearchGene> getKnScientficResearchGeneList();
}