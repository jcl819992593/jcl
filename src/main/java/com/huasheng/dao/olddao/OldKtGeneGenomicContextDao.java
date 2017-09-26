package com.huasheng.dao.olddao;

import com.huasheng.pojo.oldpojo.OldKtGeneGenomicContext;

import java.util.List;

public interface OldKtGeneGenomicContextDao {
    int deleteByPrimaryKey(String id);

    int insert(OldKtGeneGenomicContext record);

    int insertSelective(OldKtGeneGenomicContext record);

    OldKtGeneGenomicContext selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(OldKtGeneGenomicContext record);

    int updateByPrimaryKey(OldKtGeneGenomicContext record);

    List<OldKtGeneGenomicContext> getOldGeneGenomicContextList();
}