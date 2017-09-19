package com.huasheng.dao.newdao;


import com.huasheng.pojo.newpojo.KtCancerPhase;

import java.util.List;

public interface KtCancerPhaseDao {
    int deleteByPrimaryKey(String cancerPhaseKey);

    int insert(KtCancerPhase record);

    int insertSelective(KtCancerPhase record);

    KtCancerPhase selectByPrimaryKey(String cancerPhaseKey);

    int updateByPrimaryKeySelective(KtCancerPhase record);

    int updateByPrimaryKey(KtCancerPhase record);

    List<KtCancerPhase> selectByCancerKey(String cancerKey);

    int insertList(List<KtCancerPhase> cancerPhaseList);

    int deleteByCancerKey(String cancerKey);
}