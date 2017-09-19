package com.huasheng.dao.newdao;

import com.huasheng.pojo.newpojo.KtPlanStudy;

import java.util.List;

public interface KtPlanStudyDao {
    int deleteByPrimaryKey(String planStudyKey);

    int insert(KtPlanStudy record);

    int insertSelective(KtPlanStudy record);

    KtPlanStudy selectByPrimaryKey(String planStudyKey);

    int updateByPrimaryKeySelective(KtPlanStudy record);

    int updateByPrimaryKey(KtPlanStudy record);

    List<KtPlanStudy> getKtPlanStudyListByKey(String medicationPlanKey);

    int insertPlanStudyList(List<KtPlanStudy> list);

    int deleteByMedicationPlanKey(String medicationPlanKey);
}