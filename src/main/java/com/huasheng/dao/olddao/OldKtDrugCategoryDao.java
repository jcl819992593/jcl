package com.huasheng.dao.olddao;

import com.huasheng.pojo.oldpojo.OldKtDrugCategory;

import java.util.List;

public interface OldKtDrugCategoryDao {
    int deleteByPrimaryKey(String id);

    int insert(OldKtDrugCategory record);

    int insertSelective(OldKtDrugCategory record);

    OldKtDrugCategory selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(OldKtDrugCategory record);

    int updateByPrimaryKey(OldKtDrugCategory record);

    List<OldKtDrugCategory> getOldDrugCategoryList();
}