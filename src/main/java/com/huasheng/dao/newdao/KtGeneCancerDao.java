package com.huasheng.dao.newdao;

import com.huasheng.pojo.newpojo.KtGeneCancer;

import java.util.List;

public interface KtGeneCancerDao {
    int deleteByPrimaryKey(KtGeneCancer key);

    int insert(KtGeneCancer record);

    int insertSelective(KtGeneCancer record);

    KtGeneCancer selectByPrimaryKey(String geneKey,String cancerKey);

    int updateByPrimaryKeySelective(KtGeneCancer record);

    int updateByPrimaryKey(KtGeneCancer record);

    int insertList(List<KtGeneCancer> list);
}