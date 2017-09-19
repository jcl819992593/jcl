package com.huasheng.dao.newdao;

import com.huasheng.pojo.newpojo.KtGeneDetectionWayPlatforms;

import java.util.List;

public interface KtGeneDetectionWayPlatformsDao {
    int deleteByPrimaryKey(KtGeneDetectionWayPlatforms key);

    int insert(KtGeneDetectionWayPlatforms record);

    int insertSelective(KtGeneDetectionWayPlatforms record);

    int insertMore(List<KtGeneDetectionWayPlatforms> detectionWayPlatformsList);
}