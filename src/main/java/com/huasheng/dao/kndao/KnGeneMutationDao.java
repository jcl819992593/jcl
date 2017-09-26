package com.huasheng.dao.kndao;

import com.huasheng.pojo.knpojo.KnGeneMutation;

import java.util.List;

public interface KnGeneMutationDao {
    int deleteByPrimaryKey(String id);

    int insert(KnGeneMutation record);

    int insertSelective(KnGeneMutation record);

    KnGeneMutation selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(KnGeneMutation record);

    int updateByPrimaryKey(KnGeneMutation record);

    List<KnGeneMutation> getKnGeneMutationList();
}