package com.huasheng.dao.newdao;

import com.huasheng.pojo.newpojo.KtVariantMutationStatistic;

import java.util.List;

public interface KtVariantMutationStatisticDao {
    int deleteByPrimaryKey(KtVariantMutationStatistic key);

    int insert(KtVariantMutationStatistic record);

    int insertSelective(KtVariantMutationStatistic record);

    KtVariantMutationStatistic selectByPrimaryKey(KtVariantMutationStatistic key);

    int updateByPrimaryKeySelective(KtVariantMutationStatistic record);

    int updateByPrimaryKey(KtVariantMutationStatistic record);

    List<KtVariantMutationStatistic> getVariantMutationStatistic(String variantKey);

    int insertMore(List<KtVariantMutationStatistic> list);
    int deleteByVariantKey(String variantKey);
}