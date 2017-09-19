package com.huasheng.dao.newdao;

import com.huasheng.pojo.newpojo.KtGeneDetectionWayOrgs;

import java.util.List;

public interface KtGeneDetectionWayOrgsDao {
    int deleteByPrimaryKey(KtGeneDetectionWayOrgs key);

    int insert(KtGeneDetectionWayOrgs record);

    int insertSelective(KtGeneDetectionWayOrgs record);

    int insertMore(List<KtGeneDetectionWayOrgs> detectionWayOrgsList);
}