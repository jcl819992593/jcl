package com.huasheng.dao.kndao;

import com.huasheng.pojo.knpojo.KnDetectionItem;

import java.util.List;

public interface KnDetectionItemDao {
    int deleteByPrimaryKey(String id);

    int insert(KnDetectionItem record);

    int insertSelective(KnDetectionItem record);

    KnDetectionItem selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(KnDetectionItem record);

    int updateByPrimaryKey(KnDetectionItem record);

    List<KnDetectionItem> getKnDetectionItemList();
}