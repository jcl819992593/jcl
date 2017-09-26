package com.huasheng.dao.kndao;

import com.huasheng.pojo.knpojo.KnGeneGeneMetabolism;

import java.util.List;

public interface KnGeneGeneMetabolismDao {
    int insert(KnGeneGeneMetabolism record);

    int insertSelective(KnGeneGeneMetabolism record);

    List<KnGeneGeneMetabolism> getKnGeneGeneMetabolismList();
}