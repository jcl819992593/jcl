package com.huasheng.dao.olddao;

import com.huasheng.pojo.oldpojo.OldKtEvidenceDrug;

import java.util.List;

public interface OldKtEvidenceDrugDao {
    int deleteByPrimaryKey(String id);

    int insert(OldKtEvidenceDrug record);

    int insertSelective(OldKtEvidenceDrug record);

    OldKtEvidenceDrug selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(OldKtEvidenceDrug record);

    int updateByPrimaryKey(OldKtEvidenceDrug record);

    List<OldKtEvidenceDrug> getOldEvidenceDrugList();
}