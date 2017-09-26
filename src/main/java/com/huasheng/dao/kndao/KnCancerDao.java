package com.huasheng.dao.kndao;

import com.huasheng.pojo.knpojo.KnCancer;

import java.util.List;

public interface KnCancerDao {
    int deleteByPrimaryKey(String id);

    int insert(KnCancer record);

    int insertSelective(KnCancer record);

    KnCancer selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(KnCancer record);

    int updateByPrimaryKey(KnCancer record);

    List<KnCancer> getKnCancerList();
}