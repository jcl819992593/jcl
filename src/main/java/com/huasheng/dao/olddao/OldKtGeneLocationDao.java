package com.huasheng.dao.olddao;

import com.huasheng.pojo.oldpojo.OldKtGeneLocation;

import java.util.List;

public interface OldKtGeneLocationDao {
    int deleteByPrimaryKey(String id);

    int insert(OldKtGeneLocation record);

    int insertSelective(OldKtGeneLocation record);

    OldKtGeneLocation selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(OldKtGeneLocation record);

    int updateByPrimaryKey(OldKtGeneLocation record);

    List<OldKtGeneLocation> getOldGeneLocationList();
}