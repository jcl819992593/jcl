package com.huasheng.dao.newdao;

import com.huasheng.pojo.newpojo.KtVariantTumorType;

import java.util.List;

public interface KtVariantTumorTypeDao {
    int deleteByPrimaryKey(String typeKey);

    int insert(KtVariantTumorType record);

    int insertSelective(KtVariantTumorType record);

    KtVariantTumorType selectByPrimaryKey(String typeKey);

    int updateByPrimaryKeySelective(KtVariantTumorType record);

    int updateByPrimaryKey(KtVariantTumorType record);

    /**
     * 根据突变主键查肿瘤类型
     * @param variantKey
     * @return
     */
    List<KtVariantTumorType> getVariantTumorType(String variantKey);

    int insertMore(List<KtVariantTumorType> list);

    int deleteByVariantKey(String variantKey);
}