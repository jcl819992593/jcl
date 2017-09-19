package com.huasheng.dao.newdao;

import com.huasheng.pojo.newpojo.KtPlanAsco;

public interface KtPlanAscoDao {
    int deleteByPrimaryKey(String planAscoKey);

    int insert(KtPlanAsco record);

    int insertSelective(KtPlanAsco record);

    KtPlanAsco selectByPrimaryKey(String planAscoKey);

    int updateByPrimaryKeySelective(KtPlanAsco record);

    int updateByPrimaryKey(KtPlanAsco record);

    KtPlanAsco getPlanAscoByKey(String medicationPlanKey);
}