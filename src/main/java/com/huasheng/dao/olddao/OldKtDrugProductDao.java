package com.huasheng.dao.olddao;

import com.huasheng.pojo.oldpojo.OldKtDrugProduct;

import java.util.List;

public interface OldKtDrugProductDao {
    int deleteByPrimaryKey(String id);

    int insert(OldKtDrugProduct record);

    int insertSelective(OldKtDrugProduct record);

    OldKtDrugProduct selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(OldKtDrugProduct record);

    int updateByPrimaryKey(OldKtDrugProduct record);

    List<OldKtDrugProduct> getOldKtDrugProductList();
}