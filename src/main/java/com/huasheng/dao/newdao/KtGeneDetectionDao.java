package com.huasheng.dao.newdao;

import com.huasheng.pojo.newpojo.KtGeneDetection;

import java.util.List;
import java.util.Map;

public interface KtGeneDetectionDao {
    int deleteByPrimaryKey(String detectionKey);

    int insert(KtGeneDetection record);

    int insertSelective(KtGeneDetection record);

    KtGeneDetection selectByPrimaryKey(String detectionKey);

    int updateByPrimaryKeySelective(KtGeneDetection record);

    int updateByPrimaryKey(KtGeneDetection record);

    List<Map<String,Object>> getDetectionList(Map<String, Object> map);

    Map<String,Object> getDetection(String detectionKey);

    int updateCheckState(KtGeneDetection detection);

    int getDeneDetectionCount(Map<String, Object> map);

    int deleteAllDetection();

    int getDeneDetectionCountMonth(Map<String, Object> map);

    int insertList(List<KtGeneDetection> ktGeneDetectionList);
}