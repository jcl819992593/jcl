package com.huasheng.dao.kndao;

import com.huasheng.pojo.knpojo.KnCancerPhenotypic;

import java.util.List;

public interface KnCancerPhenotypicDao {
    int deleteByPrimaryKey(String id);

    int insert(KnCancerPhenotypic record);

    int insertSelective(KnCancerPhenotypic record);

    KnCancerPhenotypic selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(KnCancerPhenotypic record);

    int updateByPrimaryKey(KnCancerPhenotypic record);

    List<KnCancerPhenotypic> getKnCancerPhenotypicList();
}