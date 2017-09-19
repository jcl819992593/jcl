package com.huasheng.dao.newdao;

import com.huasheng.pojo.newpojo.KtDrugFephVariant;

import java.util.List;
import java.util.Map;

public interface KtDrugFephVariantDao {
    int deleteByPrimaryKey(KtDrugFephVariant key);

    int insert(KtDrugFephVariant record);

    int insertSelective(KtDrugFephVariant record);

    KtDrugFephVariant selectByPrimaryKey(KtDrugFephVariant key);

    int updateByPrimaryKeySelective(KtDrugFephVariant record);

    int updateByPrimaryKey(KtDrugFephVariant record);

    int addKtDrugFephVariants(List<KtDrugFephVariant> list);

    List<Map<String,Object>> getKtDrugFephVariant(String drugKey);
}