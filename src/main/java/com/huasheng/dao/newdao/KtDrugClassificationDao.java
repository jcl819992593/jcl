package com.huasheng.dao.newdao;

import com.huasheng.pojo.newpojo.KtDrugClassification;

public interface KtDrugClassificationDao {
    int deleteByPrimaryKey(KtDrugClassification key);

    int insert(KtDrugClassification record);

    int insertSelective(KtDrugClassification record);

    KtDrugClassification selectByPrimaryKey(KtDrugClassification key);

    int updateByPrimaryKeySelective(KtDrugClassification record);

    int updateByPrimaryKey(KtDrugClassification record);

    KtDrugClassification selectByDrugKey(String drugKey);

    int deleteByDrugKey(String drugKey);
}