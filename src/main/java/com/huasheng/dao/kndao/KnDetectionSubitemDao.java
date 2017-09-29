package com.huasheng.dao.kndao;

import com.huasheng.pojo.knpojo.KnDetectionSubitem;

import java.util.List;

public interface KnDetectionSubitemDao {
    int deleteByPrimaryKey(String id);

    int insert(KnDetectionSubitem record);

    int insertSelective(KnDetectionSubitem record);

    KnDetectionSubitem selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(KnDetectionSubitem record);

    int updateByPrimaryKey(KnDetectionSubitem record);

    KnDetectionSubitem getKnDetectionSubitemList(String subitemId);

    List<KnDetectionSubitem> getSubitemList();
}