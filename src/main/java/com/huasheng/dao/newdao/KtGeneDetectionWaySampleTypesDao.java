package com.huasheng.dao.newdao;

import com.huasheng.pojo.newpojo.KtGeneDetectionWaySampleTypes;

import java.util.List;

public interface KtGeneDetectionWaySampleTypesDao {
    int deleteByPrimaryKey(KtGeneDetectionWaySampleTypes key);

    int insert(KtGeneDetectionWaySampleTypes record);

    int insertSelective(KtGeneDetectionWaySampleTypes record);

    int insertMore(List<KtGeneDetectionWaySampleTypes> detectionWaySampleTypesList);
}