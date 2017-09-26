package com.huasheng.dao.olddao;

import com.huasheng.pojo.oldpojo.OldKtCancer;

import java.util.List;

public interface OldKtCancerDao {
    int deleteByPrimaryKey(String id);

    int insert(OldKtCancer record);

    int insertSelective(OldKtCancer record);

    OldKtCancer selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(OldKtCancer record);

    int updateByPrimaryKey(OldKtCancer record);

    List<OldKtCancer> getOldKtCancerList();
}