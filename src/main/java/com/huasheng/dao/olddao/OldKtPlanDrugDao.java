package com.huasheng.dao.olddao;

import com.huasheng.pojo.oldpojo.OldKtPlanDrug;

import java.util.List;

public interface OldKtPlanDrugDao {
    int deleteByPrimaryKey(String id);

    int insert(OldKtPlanDrug record);

    int insertSelective(OldKtPlanDrug record);

    OldKtPlanDrug selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(OldKtPlanDrug record);

    int updateByPrimaryKey(OldKtPlanDrug record);

    List<OldKtPlanDrug> getOldPlanDrugList();
}