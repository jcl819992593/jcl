package com.huasheng.dao.newdao;

import com.huasheng.pojo.newpojo.KtScientificResearchCancer;

import java.util.List;

public interface KtScientificResearchCancerDao {
    int deleteByPrimaryKey(String key);

    int insert(KtScientificResearchCancer record);

    int insertSelective(KtScientificResearchCancer record);

    KtScientificResearchCancer selectByPrimaryKey(KtScientificResearchCancer key);

    int updateByPrimaryKeySelective(KtScientificResearchCancer record);

    int updateByPrimaryKey(KtScientificResearchCancer record);

    int insertMore(List<KtScientificResearchCancer> list);

    List<KtScientificResearchCancer> getScientificResearchCancerByResearchKey(String researchKey);
}