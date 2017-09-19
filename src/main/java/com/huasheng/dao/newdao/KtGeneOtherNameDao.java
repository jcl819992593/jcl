package com.huasheng.dao.newdao;

import com.huasheng.pojo.newpojo.KtGeneOtherName;

import java.util.List;

public interface KtGeneOtherNameDao {
    int deleteByPrimaryKey(String geneOtherNameKey);

    int insert(KtGeneOtherName record);

    int insertSelective(KtGeneOtherName record);

    KtGeneOtherName selectByPrimaryKey(String geneOtherNameKey);

    int updateByPrimaryKeySelective(KtGeneOtherName record);

    int updateByPrimaryKey(KtGeneOtherName record);

    int addKtGeneOtherName(List<KtGeneOtherName> list);

    List<KtGeneOtherName>  selectByGeneKey(String geneKey);

    void deleteByGeneKey(String geneKey);
}