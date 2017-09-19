package com.huasheng.dao.newdao;


import com.huasheng.pojo.newpojo.KtChemicalCategory;

import java.util.List;
import java.util.Map;

public interface KtChemicalCategoryDao {
    int deleteByPrimaryKey(String chemicalCategoryKey);

    int insert(KtChemicalCategory record);

    int insertSelective(KtChemicalCategory record);

    KtChemicalCategory selectByPrimaryKey(String chemicalCategoryKey);

    int updateByPrimaryKeySelective(KtChemicalCategory record);

    int updateByPrimaryKey(KtChemicalCategory record);

    List<KtChemicalCategory> getChemicalCategoryList(Map<String, Object> map);

    KtChemicalCategory getCategoryByParentKey(String parentKey);

    int checkBack(Map<String, Object> map);

    int getChemicalPending(Map<String, Object> map);

    int getChemicalMonth(Map<String, Object> map);

    int deleteAllChemicalCategory();
}