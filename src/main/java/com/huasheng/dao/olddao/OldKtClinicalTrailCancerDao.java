package com.huasheng.dao.olddao;

import com.huasheng.pojo.oldpojo.OldKtClinicalTrailCancer;

import java.util.List;

public interface OldKtClinicalTrailCancerDao {
    int deleteByPrimaryKey(String id);

    int insert(OldKtClinicalTrailCancer record);

    int insertSelective(OldKtClinicalTrailCancer record);

    OldKtClinicalTrailCancer selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(OldKtClinicalTrailCancer record);

    int updateByPrimaryKey(OldKtClinicalTrailCancer record);

    List<OldKtClinicalTrailCancer> getOldClinicalTrailCancerList();
}