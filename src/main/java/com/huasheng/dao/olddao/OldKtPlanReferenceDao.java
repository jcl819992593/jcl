package com.huasheng.dao.olddao;

import com.huasheng.pojo.oldpojo.OldKtPlanReference;

import java.util.List;

public interface OldKtPlanReferenceDao {
    int deleteByPrimaryKey(String id);

    int insert(OldKtPlanReference record);

    int insertSelective(OldKtPlanReference record);

    OldKtPlanReference selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(OldKtPlanReference record);

    int updateByPrimaryKey(OldKtPlanReference record);

    List<OldKtPlanReference> getOldPlanReferenceList();
}