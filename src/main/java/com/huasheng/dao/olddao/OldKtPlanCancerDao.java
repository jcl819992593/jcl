package com.huasheng.dao.olddao;

import com.huasheng.pojo.oldpojo.OldKtPlanCancer;

import java.util.List;

public interface OldKtPlanCancerDao {
    int deleteByPrimaryKey(String id);

    int insert(OldKtPlanCancer record);

    int insertSelective(OldKtPlanCancer record);

    OldKtPlanCancer selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(OldKtPlanCancer record);

    int updateByPrimaryKey(OldKtPlanCancer record);

    List<OldKtPlanCancer> getOldPlanCancerList();
}