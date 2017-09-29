package com.huasheng.dao.newdao;

import com.huasheng.pojo.newpojo.KtGeneDetectionCancerRef;

import java.util.List;

public interface KtGeneDetectionCancerRefDao {
    int deleteByPrimaryKey(KtGeneDetectionCancerRef key);

    int insert(KtGeneDetectionCancerRef record);

    int insertSelective(KtGeneDetectionCancerRef record);

    void deleteByDetectionKey(String detectionKey);

    int insertMore(List<KtGeneDetectionCancerRef> detectionCancerRefList);

    int getKtGeneDetectionCancerRefCount();

    int getKtGeneDetectionDrugRefCount();

    int getCount();
}