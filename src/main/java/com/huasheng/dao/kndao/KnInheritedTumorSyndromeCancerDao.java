package com.huasheng.dao.kndao;

import com.huasheng.pojo.knpojo.KnInheritedTumorSyndromeCancer;

import java.util.List;

public interface KnInheritedTumorSyndromeCancerDao {
    int deleteByPrimaryKey(String id);

    int insert(KnInheritedTumorSyndromeCancer record);

    int insertSelective(KnInheritedTumorSyndromeCancer record);

    KnInheritedTumorSyndromeCancer selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(KnInheritedTumorSyndromeCancer record);

    int updateByPrimaryKey(KnInheritedTumorSyndromeCancer record);

    List<KnInheritedTumorSyndromeCancer> getKnInheritedTumorSyndromeCancerList();
}