package com.huasheng.dao.kndao;

import com.huasheng.pojo.knpojo.KnClinicalTrialsCancer;
import com.huasheng.pojo.knpojo.KnClinicalTrialsDrug;

import java.util.List;

public interface KnClinicalTrialsCancerDao {
    int deleteByPrimaryKey(String id);

    int insert(KnClinicalTrialsCancer record);

    int insertSelective(KnClinicalTrialsCancer record);

    KnClinicalTrialsCancer selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(KnClinicalTrialsCancer record);

    int updateByPrimaryKey(KnClinicalTrialsCancer record);

    List<KnClinicalTrialsCancer> getKnClinicalTrialsCancerList();

}