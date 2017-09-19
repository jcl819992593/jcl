package com.huasheng.dao.newdao;


import com.huasheng.pojo.newpojo.KtVariantExternalId;

public interface KtVariantExternalIdDao {
    int deleteByPrimaryKey(String id);

    int insert(KtVariantExternalId record);

    int insertSelective(KtVariantExternalId record);

    KtVariantExternalId selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(KtVariantExternalId record);

    int updateByPrimaryKey(KtVariantExternalId record);
}