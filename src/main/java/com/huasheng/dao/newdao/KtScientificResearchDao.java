package com.huasheng.dao.newdao;

import com.huasheng.pojo.newpojo.KtScientificResearch;
import com.huasheng.pojo.newpojo.KtVariant;

import java.util.List;
import java.util.Map;

public interface KtScientificResearchDao {
    int deleteByPrimaryKey(String researchKey);

    int insert(KtScientificResearch record);

    int insertSelective(KtScientificResearch record);

    KtScientificResearch selectByPrimaryKey(String researchKey);

    int updateByPrimaryKeySelective(KtScientificResearch record);

    int updateByPrimaryKey(KtScientificResearch record);

    List<KtVariant> getVariantList(Map<String, Object> map);

    int updateCheckState(KtScientificResearch ktScientificResearch);

    int getScientificResearchCount(Map<String, Object> map);

    int getScientificResearchCountMonth(Map<String, Object> map);

    int deleteAllScientificResearch();
}