package com.huasheng.dao.olddao;

import com.huasheng.pojo.oldpojo.OldKtVariant;

import java.util.List;

public interface OldKtVariantDao {
    int deleteByPrimaryKey(String id);

    int insert(OldKtVariant record);

    int insertSelective(OldKtVariant record);

    OldKtVariant selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(OldKtVariant record);

    int updateByPrimaryKeyWithBLOBs(OldKtVariant record);

    int updateByPrimaryKey(OldKtVariant record);

    List<OldKtVariant> getOldKtVariantList();
}