package com.huasheng.dao.kndao;

import com.huasheng.pojo.knpojo.KnClinicalTrialsDrug;

import java.util.List;

public interface KnClinicalTrialsDrugDao {
    int deleteByPrimaryKey(String id);

    int insert(KnClinicalTrialsDrug record);

    int insertSelective(KnClinicalTrialsDrug record);

    KnClinicalTrialsDrug selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(KnClinicalTrialsDrug record);

    int updateByPrimaryKey(KnClinicalTrialsDrug record);

    List<KnClinicalTrialsDrug> getKnClinicalTrialsDrugList();
}