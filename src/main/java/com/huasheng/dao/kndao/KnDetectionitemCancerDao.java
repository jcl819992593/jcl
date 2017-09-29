package com.huasheng.dao.kndao;

import com.huasheng.pojo.knpojo.KnDetectionitemCancer;

import java.util.List;

public interface KnDetectionitemCancerDao {
    int insert(KnDetectionitemCancer record);

    int insertSelective(KnDetectionitemCancer record);

    List<KnDetectionitemCancer> getKnDetectionitemCancerList();

    List<KnDetectionitemCancer> getKnDetectionitemCancerByItemId(String detectionitemId);
}