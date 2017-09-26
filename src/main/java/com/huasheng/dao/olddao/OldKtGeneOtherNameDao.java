package com.huasheng.dao.olddao;

import com.huasheng.pojo.oldpojo.OldKtGeneOtherName;

import java.util.List;

public interface OldKtGeneOtherNameDao {
    int deleteByPrimaryKey(String id);

    int insert(OldKtGeneOtherName record);

    int insertSelective(OldKtGeneOtherName record);

    OldKtGeneOtherName selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(OldKtGeneOtherName record);

    int updateByPrimaryKey(OldKtGeneOtherName record);

    List<OldKtGeneOtherName> getOldGeneOtherNameList();
}