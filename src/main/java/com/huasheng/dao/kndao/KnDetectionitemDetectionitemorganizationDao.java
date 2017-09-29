package com.huasheng.dao.kndao;

import com.huasheng.pojo.knpojo.KnDetectionitemDetectionitemorganization;

import java.util.List;

public interface KnDetectionitemDetectionitemorganizationDao {
    int insert(KnDetectionitemDetectionitemorganization record);

    int insertSelective(KnDetectionitemDetectionitemorganization record);

    List<KnDetectionitemDetectionitemorganization> getItemOrganizationList();
}