package com.huasheng.dao.newdao;


import com.huasheng.pojo.newpojo.KtCancerLocationTesting;

public interface KtCancerLocationTestingDao {
    int deleteByPrimaryKey(KtCancerLocationTesting key);

    int insert(KtCancerLocationTesting record);

    int insertSelective(KtCancerLocationTesting record);

    KtCancerLocationTesting selectByPrimaryKey(KtCancerLocationTesting key);

    int updateByPrimaryKeySelective(KtCancerLocationTesting record);

    int updateByPrimaryKey(KtCancerLocationTesting record);

    KtCancerLocationTesting selectByCancerKey(String cancerKey);

    int updateByCancerKey(KtCancerLocationTesting record);
}