package com.huasheng.dao.newdao;

import com.huasheng.pojo.newpojo.KtDrug;

import java.util.List;
import java.util.Map;

public interface KtDrugDao {
    int deleteByPrimaryKey(String drugKey);

    int insert(KtDrug record);

    int insertSelective(KtDrug record);

    KtDrug selectByPrimaryKey(String drugKey);

    int updateByPrimaryKeySelective(KtDrug record);

    int updateByPrimaryKey(KtDrug record);

    List<Map<String,Object>> getDrugList(Map<String, Object> map);

    int checkDrug(KtDrug ktDrug);

    int assignTranslator(KtDrug ktDrug);

    KtDrug selectByDrugId(Integer drugId);

    int checkEnDrug(Map<String, Object> map);

    int getDrugCountPending(Map<String, Object> map);

    int getDrugCountTranslateMonth(Map<String, Object> map);

    int getDrugCountMonth(Map<String, Object> map);

    int deleteAllKtDrug();

    List<KtDrug> getNewDrugList();

    int insertDrugList(List<KtDrug> list);
}