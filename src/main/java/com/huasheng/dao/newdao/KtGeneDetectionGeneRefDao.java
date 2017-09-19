package com.huasheng.dao.newdao;

import com.huasheng.pojo.newpojo.KtGeneDetectionGeneRef;

import java.util.List;

public interface KtGeneDetectionGeneRefDao {
    int deleteByPrimaryKey(KtGeneDetectionGeneRef key);

    int insert(KtGeneDetectionGeneRef record);

    int insertSelective(KtGeneDetectionGeneRef record);

    void deleteByDetectionKey(String detectionKey);

    int insertMore(List<KtGeneDetectionGeneRef> detectionGeneRefList);
}