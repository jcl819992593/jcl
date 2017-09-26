package com.huasheng.dao.newdao;

import com.huasheng.pojo.newpojo.KtDrugAdverseReaction;
import com.huasheng.pojo.newpojo.KtSideEffect;

import java.util.List;
import java.util.Map;

public interface KtSideEffectDao {
    int deleteByPrimaryKey(String sideEffectKey);

    int insert(KtSideEffect record);

    int insertSelective(KtSideEffect record);

    KtSideEffect selectByPrimaryKey(String sideEffectKey);

    int updateByPrimaryKeySelective(KtSideEffect record);

    int updateByPrimaryKey(KtSideEffect record);

    List<KtSideEffect> getSideEffectList(Map<String, Object> map);

    int updateSideEffectCheckState(KtSideEffect ktSideEffect);

    int getSideEffectPending(Map<String, Object> map);

    int getSideEffectMonth(Map<String, Object> map);

    List<KtDrugAdverseReaction> getSideEffectsByList(List<KtDrugAdverseReaction> sideEffects);

    int deleteAllSideEffect();

    int insertSideEffectList(List<KtSideEffect> list);
}