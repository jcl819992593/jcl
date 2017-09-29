package com.huasheng.dao.kndao;

import com.huasheng.pojo.knpojo.KnDetectionOrganization;

import java.util.List;

public interface KnDetectionOrganizationDao {
    int deleteByPrimaryKey(String id);

    int insert(KnDetectionOrganization record);

    int insertSelective(KnDetectionOrganization record);

    KnDetectionOrganization selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(KnDetectionOrganization record);

    int updateByPrimaryKey(KnDetectionOrganization record);

    List<KnDetectionOrganization> getOrganizationList();
}