package com.huasheng.dao.kndao;

import com.huasheng.pojo.knpojo.KnInheritedTumorSyndrome;

import java.util.List;

public interface KnInheritedTumorSyndromeDao {
    int deleteByPrimaryKey(String id);

    int insert(KnInheritedTumorSyndrome record);

    int insertSelective(KnInheritedTumorSyndrome record);

    KnInheritedTumorSyndrome selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(KnInheritedTumorSyndrome record);

    int updateByPrimaryKey(KnInheritedTumorSyndrome record);

    List<KnInheritedTumorSyndrome> getKnInheritedTumorSyndromeList();
}