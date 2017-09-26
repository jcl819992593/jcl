package com.huasheng.dao.newdao;


import com.huasheng.pojo.newpojo.KtCancerPhenotype;

import java.util.List;

public interface KtCancerPhenotypeDao {
    int deleteByPrimaryKey(String cancerPhenotypeKey);

    int insert(KtCancerPhenotype record);

    int insertSelective(KtCancerPhenotype record);

    KtCancerPhenotype selectByPrimaryKey(String cancerPhenotypeKey);

    int updateByPrimaryKeySelective(KtCancerPhenotype record);

    int updateByPrimaryKey(KtCancerPhenotype record);

    KtCancerPhenotype selectByCancerKey(String cancerKey);

    int insertList(List<KtCancerPhenotype> list);
}