package com.huasheng.dao.olddao;

import com.huasheng.pojo.oldpojo.OldKtSideEffect;

import java.util.List;

public interface OldKtSideEffectDao {
    int deleteByPrimaryKey(String id);

    int insert(OldKtSideEffect record);

    int insertSelective(OldKtSideEffect record);

    OldKtSideEffect selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(OldKtSideEffect record);

    int updateByPrimaryKey(OldKtSideEffect record);

    List<OldKtSideEffect> getOldKtSideEffectList();
}