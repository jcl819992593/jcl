package com.huasheng.dao.kndao;

import com.huasheng.pojo.knpojo.KnClinicalTrials;

import java.util.List;

public interface KnClinicalTrialsDao {
    int deleteByPrimaryKey(String id);

    int insert(KnClinicalTrials record);

    int insertSelective(KnClinicalTrials record);

    KnClinicalTrials selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(KnClinicalTrials record);

    int updateByPrimaryKey(KnClinicalTrials record);

    List<KnClinicalTrials> getKnClinicalTrialsList();
}