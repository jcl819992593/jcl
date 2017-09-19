package com.huasheng.dao.newdao;

import com.huasheng.pojo.newpojo.KtVariantTumorTypeDoid;

import java.util.List;

public interface KtVariantTumorTypeDoidDao {
    int deleteByPrimaryKey(KtVariantTumorTypeDoid key);

    int insert(KtVariantTumorTypeDoid record);

    int insertSelective(KtVariantTumorTypeDoid record);

    KtVariantTumorTypeDoid selectByPrimaryKey(KtVariantTumorTypeDoid key);

    int updateByPrimaryKeySelective(KtVariantTumorTypeDoid record);

    int updateByPrimaryKey(KtVariantTumorTypeDoid record);

    KtVariantTumorTypeDoid getVariantTumorTypeDoid(String typeKey);

    int insertMore(List<KtVariantTumorTypeDoid> list);
}