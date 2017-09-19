package com.huasheng.dao.newdao;


import com.huasheng.pojo.newpojo.KtCancerTreatment;

public interface KtCancerTreatmentDao {
    int deleteByPrimaryKey(String cancerTreatmentKey);

    int insert(KtCancerTreatment record);

    int insertSelective(KtCancerTreatment record);

    KtCancerTreatment selectByPrimaryKey(String cancerTreatmentKey);

    int updateByPrimaryKeySelective(KtCancerTreatment record);

    int updateByPrimaryKey(KtCancerTreatment record);

    KtCancerTreatment selectByCancerKey(String cancerKey);
}