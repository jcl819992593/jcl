package com.huasheng.dao.newdao;

import com.huasheng.pojo.newpojo.KtProtein;

import java.util.List;
import java.util.Map;

public interface KtProteinDao {
    int deleteByPrimaryKey(String proteinKey);

    int insert(KtProtein record);

    int insertSelective(KtProtein record);

    KtProtein selectByPrimaryKey(String proteinKey);

    int updateByPrimaryKeySelective(KtProtein record);

    int updateByPrimaryKey(KtProtein record);
    List<Map<String,Object>> getProteinList(Map<String, Object> map);

    Map<String,Object> getProteinByProteinKey(String proteinKey);

    int updateProteinCheckState(KtProtein ktProtein);

    int updateTranslator(KtProtein ktProtein);

    int getProteinPending(Map<String, Object> map);

    KtProtein getProteinByGeneKey(String geneKey);

    int getProteinTranslateMonth(Map<String, Object> map);
}