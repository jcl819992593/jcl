package com.huasheng.dao.olddao;

import com.huasheng.pojo.oldpojo.OldKtGeneExternalId;

import java.util.List;

public interface OldKtGeneExternalIdDao {
    int deleteByPrimaryKey(String id);

    int insert(OldKtGeneExternalId record);

    int insertSelective(OldKtGeneExternalId record);

    OldKtGeneExternalId selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(OldKtGeneExternalId record);

    int updateByPrimaryKey(OldKtGeneExternalId record);

    List<OldKtGeneExternalId> getOldGeneExternalIdList();
}