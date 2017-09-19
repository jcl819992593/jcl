package com.huasheng.dao.newdao;

import com.huasheng.pojo.newpojo.KtGeneDetectionWays;

import java.util.List;
import java.util.Map;

public interface KtGeneDetectionWaysDao {
    int deleteByPrimaryKey(String detectionWayKey);

    int insert(KtGeneDetectionWays record);

    int insertSelective(KtGeneDetectionWays record);

    KtGeneDetectionWays selectByPrimaryKey(String detectionWayKey);

    int updateByPrimaryKeySelective(KtGeneDetectionWays record);

    int updateByPrimaryKey(KtGeneDetectionWays record);

    int insertMore(List<KtGeneDetectionWays> detectionWaysList);

    void deleteByDetectionKey(String detectionKey);

    List<Map<String,Object>> getWaysList(String detectionKey);
}