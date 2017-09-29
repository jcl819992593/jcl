package com.huasheng.dao.kndao;

import com.huasheng.pojo.knpojo.KnDetectionItem;
import com.huasheng.pojo.knpojo.KnDetectionitemDetectionsubitem;

public interface KnDetectionitemDetectionsubitemDao {
    int insert(KnDetectionitemDetectionsubitem record);

    int insertSelective(KnDetectionitemDetectionsubitem record);

    KnDetectionitemDetectionsubitem  getBySubItemId(String detectionsubitemId);
}