package com.huasheng.dao.newdao;

import com.huasheng.pojo.newpojo.KtProteinSynonym;

import java.util.List;

public interface KtProteinSynonymDao {
    int deleteByPrimaryKey(String proteinSynonymKey);

    int insert(KtProteinSynonym record);

    int insertSelective(KtProteinSynonym record);

    KtProteinSynonym selectByPrimaryKey(String proteinSynonymKey);

    int updateByPrimaryKeySelective(KtProteinSynonym record);

    int updateByPrimaryKey(KtProteinSynonym record);

    int insertKtProteinSynonym(List<KtProteinSynonym> list);

    int deleteByProteinKey(String proteinKey);

    List<KtProteinSynonym> getProteinSynonymByProteinKey(String proteinKey);

    int deleteAllProteinSynonym();
}