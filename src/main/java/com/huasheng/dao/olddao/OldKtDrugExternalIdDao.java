package com.huasheng.dao.olddao;

import com.huasheng.pojo.oldpojo.OldKtDrugExternalId;

import java.util.List;

public interface OldKtDrugExternalIdDao {
    int deleteByPrimaryKey(String id);

    int insert(OldKtDrugExternalId record);

    int insertSelective(OldKtDrugExternalId record);

    OldKtDrugExternalId selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(OldKtDrugExternalId record);

    int updateByPrimaryKey(OldKtDrugExternalId record);

    List<OldKtDrugExternalId> getOldKtDrugExternalIdList();
}