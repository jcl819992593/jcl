package com.huasheng.dao.newdao;

import com.huasheng.pojo.newpojo.KtGeneGenomicContext;

import java.util.List;

public interface KtGeneGenomicContextDao {
    int deleteByPrimaryKey(String geneGenomicContextKey);

    int insert(KtGeneGenomicContext record);

    int insertSelective(KtGeneGenomicContext record);

    KtGeneGenomicContext selectByPrimaryKey(String geneGenomicContextKey);

    int updateByPrimaryKeySelective(KtGeneGenomicContext record);

    int updateByPrimaryKey(KtGeneGenomicContext record);

    KtGeneGenomicContext selectByGeneKey(String geneKey);

    void deleteByGeneKey(String geneKey);

    int deleteAllContext();

    int insertlist(List<KtGeneGenomicContext> list);
}