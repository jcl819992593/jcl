package com.huasheng.dao.olddao;

import com.huasheng.pojo.oldpojo.OldKtPlanStudy;

import java.util.List;

public interface OldKtPlanStudyDao {
    int deleteByPrimaryKey(String id);

    int insert(OldKtPlanStudy record);

    int insertSelective(OldKtPlanStudy record);

    OldKtPlanStudy selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(OldKtPlanStudy record);

    int updateByPrimaryKey(OldKtPlanStudy record);

    List<OldKtPlanStudy> getOldPlanStudyList();
}