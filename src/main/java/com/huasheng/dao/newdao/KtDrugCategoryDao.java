package com.huasheng.dao.newdao;

import com.huasheng.pojo.newpojo.KtDrugCategory;

import java.util.List;

public interface KtDrugCategoryDao {
    int deleteByPrimaryKey(KtDrugCategory key);

    int insert(KtDrugCategory record);

    int insertSelective(KtDrugCategory record);

    KtDrugCategory selectByPrimaryKey(KtDrugCategory key);

    int updateByPrimaryKeySelective(KtDrugCategory record);

    int updateByPrimaryKey(KtDrugCategory record);

    /**
     * 插入药物作用类别
     * @param list
     * @return
     */
    int addKtDrugCategoryMore(List<KtDrugCategory> list);

    List<KtDrugCategory> selectByDrugKey(String drugKey);

    int deleteByDrugKey(String drugKey);
}