package com.huasheng.dao.olddao;

import com.huasheng.pojo.oldpojo.OldKtMeshCategory;

import java.util.List;

public interface OldKtMeshCategoryDao {
    int deleteByPrimaryKey(String id);

    int insert(OldKtMeshCategory record);

    int insertSelective(OldKtMeshCategory record);

    OldKtMeshCategory selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(OldKtMeshCategory record);

    int updateByPrimaryKey(OldKtMeshCategory record);

    List<OldKtMeshCategory> getOldMeshCategoryList();
}