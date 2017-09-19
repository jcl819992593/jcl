package com.huasheng.dao.newdao;

import com.huasheng.pojo.newpojo.KtGeneDetectionWayWays;

import java.util.List;

public interface KtGeneDetectionWayWaysDao {
    int deleteByPrimaryKey(KtGeneDetectionWayWays key);

    int insert(KtGeneDetectionWayWays record);

    int insertSelective(KtGeneDetectionWayWays record);

    int insertMore(List<KtGeneDetectionWayWays> detectionWayWaysList);
}