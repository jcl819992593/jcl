package com.huasheng.dao.newdao;

import com.huasheng.pojo.newpojo.KtScientificResearchDrug;

import java.util.List;

public interface KtScientificResearchDrugDao {
    int deleteByPrimaryKey(String key);

    int insert(KtScientificResearchDrug record);

    int insertSelective(KtScientificResearchDrug record);

    List<KtScientificResearchDrug> selectByPrimaryKey(String researchKey);

    int updateByPrimaryKeySelective(KtScientificResearchDrug record);

    int updateByPrimaryKey(KtScientificResearchDrug record);

    int insertMore(List<KtScientificResearchDrug> list);
}