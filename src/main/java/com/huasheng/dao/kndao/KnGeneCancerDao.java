package com.huasheng.dao.kndao;

import com.huasheng.pojo.knpojo.KnGeneCancer;

import java.util.List;

public interface KnGeneCancerDao {
    int deleteByPrimaryKey(String id);

    int insert(KnGeneCancer record);

    int insertSelective(KnGeneCancer record);

    KnGeneCancer selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(KnGeneCancer record);

    int updateByPrimaryKey(KnGeneCancer record);

    List<KnGeneCancer> getKnGeneCancerList();
}