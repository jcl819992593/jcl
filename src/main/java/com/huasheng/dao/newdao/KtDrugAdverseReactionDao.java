package com.huasheng.dao.newdao;

import com.huasheng.pojo.newpojo.KtDrugAdverseReaction;

import java.util.List;

public interface KtDrugAdverseReactionDao {
    int deleteByPrimaryKey(KtDrugAdverseReaction key);

    int insert(KtDrugAdverseReaction record);

    int insertSelective(KtDrugAdverseReaction record);

    KtDrugAdverseReaction selectByPrimaryKey(KtDrugAdverseReaction key);

    int updateByPrimaryKeySelective(KtDrugAdverseReaction record);

    int updateByPrimaryKey(KtDrugAdverseReaction record);

    int addKtDrugAdverseReactionMore(List<KtDrugAdverseReaction> list);

    List<KtDrugAdverseReaction> selectByDrugKey(String drugKey);

    int deleteByDrugKey(String drugKey);
}