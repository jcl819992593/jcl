package com.huasheng.dao.newdao;


import com.huasheng.pojo.newpojo.KtCancerGuide;

public interface KtCancerGuideDao {
    int deleteByPrimaryKey(String cancerGuideKey);

    int insert(KtCancerGuide record);

    int insertSelective(KtCancerGuide record);

    KtCancerGuide selectByPrimaryKey(String cancerGuideKey);

    int updateByPrimaryKeySelective(KtCancerGuide record);

    int updateByPrimaryKey(KtCancerGuide record);

    KtCancerGuide selectByCancerKey(String cancerKey);
}