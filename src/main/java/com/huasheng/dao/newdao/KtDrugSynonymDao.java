package com.huasheng.dao.newdao;

import com.huasheng.pojo.newpojo.KtDrugSynonym;

import java.util.List;

public interface KtDrugSynonymDao {
    int deleteByPrimaryKey(String synonymKey);

    int insert(KtDrugSynonym record);

    int insertSelective(KtDrugSynonym record);

    KtDrugSynonym selectByPrimaryKey(String synonymKey);

    int updateByPrimaryKeySelective(KtDrugSynonym record);

    int updateByPrimaryKey(KtDrugSynonym record);

    int addKtDrugSynonymMore(List<KtDrugSynonym> list);

    List<KtDrugSynonym> selectByDrugKey(String drugKey);

    int deleteByDrugKey(String drugKey);
}