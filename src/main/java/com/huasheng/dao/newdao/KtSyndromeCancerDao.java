package com.huasheng.dao.newdao;

import com.huasheng.pojo.newpojo.KtSyndromeCancer;

import java.util.List;

public interface KtSyndromeCancerDao {
    int deleteByPrimaryKey(KtSyndromeCancer key);

    int insert(KtSyndromeCancer record);

    int insertSelective(KtSyndromeCancer record);

    KtSyndromeCancer selectByPrimaryKey(KtSyndromeCancer key);

    int updateByPrimaryKeySelective(KtSyndromeCancer record);

    int updateByPrimaryKey(KtSyndromeCancer record);

    int insertMore(List<KtSyndromeCancer> list);

    List<KtSyndromeCancer> getSyndromeCancerList(String syndromeKey);

    int deleteByKey(String syndromeKey);
}