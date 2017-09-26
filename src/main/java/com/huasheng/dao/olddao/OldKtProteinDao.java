package com.huasheng.dao.olddao;

import com.huasheng.pojo.oldpojo.OldKtProtein;

import java.util.List;

public interface OldKtProteinDao {
    int deleteByPrimaryKey(String id);

    int insert(OldKtProtein record);

    int insertSelective(OldKtProtein record);

    OldKtProtein selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(OldKtProtein record);

    int updateByPrimaryKey(OldKtProtein record);

    List<OldKtProtein> getOldKtProteinList();
}