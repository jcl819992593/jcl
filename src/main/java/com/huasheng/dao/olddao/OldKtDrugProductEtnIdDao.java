package com.huasheng.dao.olddao;

import com.huasheng.pojo.oldpojo.OldKtDrugProductEtnId;

import java.util.List;

public interface OldKtDrugProductEtnIdDao {
    int deleteByPrimaryKey(String id);

    int insert(OldKtDrugProductEtnId record);

    int insertSelective(OldKtDrugProductEtnId record);

    OldKtDrugProductEtnId selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(OldKtDrugProductEtnId record);

    int updateByPrimaryKey(OldKtDrugProductEtnId record);

    List<OldKtDrugProductEtnId> getOldKtDrugProductEtnIdList();
}