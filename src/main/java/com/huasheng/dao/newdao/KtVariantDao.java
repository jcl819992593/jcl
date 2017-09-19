package com.huasheng.dao.newdao;

import com.huasheng.pojo.newpojo.KtVariant;

import java.util.List;
import java.util.Map;

public interface KtVariantDao {
    int deleteByPrimaryKey(String variantKey);

    int insert(KtVariant record);

    int insertSelective(KtVariant record);

    KtVariant selectByPrimaryKey(String variantKey);

    int updateByPrimaryKeySelective(KtVariant record);

    int updateByPrimaryKey(KtVariant record);

    List<KtVariant> getVariantList(Map<String, Object> map);


    int updateTranslator(KtVariant variant);

    /**
     * 自建数据审核
     * @param ktVariant
     * @return
     */
    int updateCheckState(KtVariant ktVariant);

    int getvariantPending(Map<String, Object> map);

    KtVariant getVariantById(Integer variantId);

    int getVariantTranslateMonth(Map<String, Object> map);
}