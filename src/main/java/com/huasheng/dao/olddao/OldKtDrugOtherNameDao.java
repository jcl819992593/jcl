package com.huasheng.dao.olddao;

import com.huasheng.pojo.oldpojo.OldKtDrugOtherName;

import java.util.List;

public interface OldKtDrugOtherNameDao {
    int deleteByPrimaryKey(String id);

    int insert(OldKtDrugOtherName record);

    int insertSelective(OldKtDrugOtherName record);

    OldKtDrugOtherName selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(OldKtDrugOtherName record);

    int updateByPrimaryKey(OldKtDrugOtherName record);

    List<OldKtDrugOtherName> getOldDrugOtherNameList();
}