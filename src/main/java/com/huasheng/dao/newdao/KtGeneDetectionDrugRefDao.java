package com.huasheng.dao.newdao;

import com.huasheng.pojo.newpojo.KtGeneDetectionDrugRef;

import java.util.List;

public interface KtGeneDetectionDrugRefDao {
    int deleteByPrimaryKey(KtGeneDetectionDrugRef key);

    int insert(KtGeneDetectionDrugRef record);

    int insertSelective(KtGeneDetectionDrugRef record);

    void deleteByDetectionKey(String detectionKey);

    int insertMore(List<KtGeneDetectionDrugRef> detectionDrugRefList);
}