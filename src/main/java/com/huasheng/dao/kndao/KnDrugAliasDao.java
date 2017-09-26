package com.huasheng.dao.kndao;

import com.huasheng.pojo.knpojo.KnDrugAlias;

import java.util.List;

public interface KnDrugAliasDao {
    int deleteByPrimaryKey(String id);

    int insert(KnDrugAlias record);

    int insertSelective(KnDrugAlias record);

    KnDrugAlias selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(KnDrugAlias record);

    int updateByPrimaryKey(KnDrugAlias record);

    List<KnDrugAlias> getKnDrugAliasList();
}