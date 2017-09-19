package com.huasheng.dao.newdao;

import com.huasheng.pojo.newpojo.KtPlanConsensus;

public interface KtPlanConsensusDao {
    int deleteByPrimaryKey(String planConsensusKey);

    int insert(KtPlanConsensus record);

    int insertSelective(KtPlanConsensus record);

    KtPlanConsensus selectByPrimaryKey(String planConsensusKey);

    int updateByPrimaryKeySelective(KtPlanConsensus record);

    int updateByPrimaryKey(KtPlanConsensus record);

    KtPlanConsensus getPlanConsensusByKey(String medicationPlanKey);
}