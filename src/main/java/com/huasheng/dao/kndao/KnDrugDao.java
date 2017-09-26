package com.huasheng.dao.kndao;

import com.huasheng.pojo.knpojo.KnDrug;

import java.util.List;

public interface KnDrugDao {
    int deleteByPrimaryKey(String id);

    int insert(KnDrug record);

    int insertSelective(KnDrug record);

    KnDrug selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(KnDrug record);

    int updateByPrimaryKey(KnDrug record);

    List<KnDrug> getKnDrugList();
}