package com.huasheng.dao.kndao;

import com.huasheng.pojo.knpojo.KnClinicalTrialsGene;

import java.util.List;

public interface KnClinicalTrialsGeneDao {
    int deleteByPrimaryKey(String id);

    int insert(KnClinicalTrialsGene record);

    int insertSelective(KnClinicalTrialsGene record);

    KnClinicalTrialsGene selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(KnClinicalTrialsGene record);

    int updateByPrimaryKey(KnClinicalTrialsGene record);


    List<KnClinicalTrialsGene> getKnClinicalTrialsGeneList();
}