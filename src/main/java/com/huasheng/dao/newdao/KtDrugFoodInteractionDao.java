package com.huasheng.dao.newdao;

import com.huasheng.pojo.newpojo.KtDrugFoodInteraction;

public interface KtDrugFoodInteractionDao {
    int deleteByPrimaryKey(String foodInteractionKey);

    int insert(KtDrugFoodInteraction record);

    int insertSelective(KtDrugFoodInteraction record);

    KtDrugFoodInteraction selectByPrimaryKey(String foodInteractionKey);

    int updateByPrimaryKeySelective(KtDrugFoodInteraction record);

    int updateByPrimaryKey(KtDrugFoodInteraction record);

    KtDrugFoodInteraction selectByDrugKey(String drugKey);
}