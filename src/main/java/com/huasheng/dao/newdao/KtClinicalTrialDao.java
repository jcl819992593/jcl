package com.huasheng.dao.newdao;


import com.huasheng.pojo.newpojo.KtClinicalTrial;
import com.huasheng.pojo.newpojo.KtVariant;

import java.util.List;
import java.util.Map;

public interface KtClinicalTrialDao {
    int deleteByPrimaryKey(String clinicalTrialKey);

    int insert(KtClinicalTrial record);

    int insertSelective(KtClinicalTrial record);

    KtClinicalTrial selectByPrimaryKey(String clinicalTrialKey);

    int updateByPrimaryKeySelective(KtClinicalTrial record);

    int updateByPrimaryKey(KtClinicalTrial record);

    List<KtVariant> getClinicalTrialList(Map<String, Object> map);

    int updateCheckState(KtClinicalTrial ktClinicalTrial);

    int getClinicalTrialCount(Map<String, Object> map);

    int updateTranslator(KtClinicalTrial clinicalTrial);

    int getClinicalTrialCountMonth(Map<String, Object> map);

    int deleteAllClinicalTrial();
}