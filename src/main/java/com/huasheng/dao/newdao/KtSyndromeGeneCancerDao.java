package com.huasheng.dao.newdao;


import com.huasheng.pojo.newpojo.KtSyndromeCancer;
import com.huasheng.pojo.newpojo.KtSyndromeGeneCancer;

import java.util.List;
import java.util.Map;

public interface KtSyndromeGeneCancerDao {
    int deleteByPrimaryKey(String syndromeKey);

    int insert(KtSyndromeGeneCancer record);

    int insertSelective(KtSyndromeGeneCancer record);

    KtSyndromeGeneCancer selectByPrimaryKey(String syndromeKey);

    int updateByPrimaryKeySelective(KtSyndromeGeneCancer record);

    int updateByPrimaryKey(KtSyndromeGeneCancer record);

    List<Map<String,Object>> getSyndromeGeneCancerList(Map<String, Object> map);

    int updateCheckState(KtSyndromeGeneCancer ktSyndromeGeneCancer);

    List<KtSyndromeCancer> getSyndromeCancerList(String syndromeKey);

    int getSyndromeCount(Map<String, Object> map);

    int getSyndromeCountMonth(Map<String, Object> map);

    int deleteAllSyndrome();
}