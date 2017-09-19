package com.huasheng.dao.newdao;

import com.huasheng.pojo.newpojo.KtGeneExternalId;

import java.util.List;

public interface KtGeneExternalIdDao {
    int deleteByPrimaryKey(String geneExternalIdKey);

    int insert(KtGeneExternalId record);

    int insertSelective(KtGeneExternalId record);

    KtGeneExternalId selectByPrimaryKey(String geneExternalIdKey);

    int updateByPrimaryKeySelective(KtGeneExternalId record);

    int updateByPrimaryKey(KtGeneExternalId record);

    int addKtGeneExternalId(List<KtGeneExternalId> list);

    List<KtGeneExternalId> selectByGeneKey(String geneKey);

    void deleteByGeneKey(String geneKey);
}