package com.huasheng.dao.newdao;

import com.huasheng.pojo.newpojo.KtChemicalCategorySynonym;

import java.util.List;
import java.util.Map;

public interface KtChemicalCategorySynonymDao {
    int deleteByPrimaryKey(String categorySynonymKey);

    int insert(KtChemicalCategorySynonym record);

    int insertSelective(KtChemicalCategorySynonym record);

    KtChemicalCategorySynonym selectByPrimaryKey(String categorySynonymKey);

    int updateByPrimaryKeySelective(KtChemicalCategorySynonym record);

    int updateByPrimaryKey(KtChemicalCategorySynonym record);

    int insertSynonyms(List<KtChemicalCategorySynonym> list);

    List<Map<String,Object>> getSynonymList();

    List<KtChemicalCategorySynonym> getSynonymByCategoryKey(String categoryKey);

    int deleteByCategoryKey(String categoryKey);
}