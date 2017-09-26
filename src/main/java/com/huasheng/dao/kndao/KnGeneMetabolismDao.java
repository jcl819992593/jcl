package com.huasheng.dao.kndao;

import com.huasheng.pojo.knpojo.KnGeneMetabolism;

import java.util.List;

public interface KnGeneMetabolismDao {
    int deleteByPrimaryKey(String id);

    int insert(KnGeneMetabolism record);

    int insertSelective(KnGeneMetabolism record);

    KnGeneMetabolism selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(KnGeneMetabolism record);

    int updateByPrimaryKey(KnGeneMetabolism record);

    List<KnGeneMetabolism> getKnGeneMetabolismList();
}