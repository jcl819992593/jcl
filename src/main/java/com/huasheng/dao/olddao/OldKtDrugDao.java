package com.huasheng.dao.olddao;

import com.huasheng.pojo.oldpojo.OldKtDrug;

import java.util.List;

public interface OldKtDrugDao {
    int deleteByPrimaryKey(String id);

    int insert(OldKtDrug record);

    int insertSelective(OldKtDrug record);

    OldKtDrug selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(OldKtDrug record);

    int updateByPrimaryKey(OldKtDrug record);

    List<OldKtDrug> getOldDrugList();

    OldKtDrug selectById(Integer id);
}