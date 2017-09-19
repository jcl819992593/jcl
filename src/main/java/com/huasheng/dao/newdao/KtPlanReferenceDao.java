package com.huasheng.dao.newdao;

import com.huasheng.pojo.newpojo.KtPlanReference;

import java.util.List;

public interface KtPlanReferenceDao {
    int deleteByPrimaryKey(String planReferenceKey);

    int insert(KtPlanReference record);

    int insertSelective(KtPlanReference record);

    KtPlanReference selectByPrimaryKey(String planReferenceKey);

    int updateByPrimaryKeySelective(KtPlanReference record);

    int updateByPrimaryKey(KtPlanReference record);

    List<KtPlanReference> getMPlanReferenceList(String medicationPlanKey);

    int insertPlanReferenceList(List<KtPlanReference> list);

    int deleteByMedicationPlanKey(String medicationPlanKey);
}