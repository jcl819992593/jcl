package com.huasheng.dao.newdao;

import com.huasheng.pojo.newpojo.KtCancerPhaseTnm;

import java.util.List;

public interface KtCancerPhaseTnmDao {
    int deleteByPrimaryKey(String cancerPhaseTnmKey);

    int insert(KtCancerPhaseTnm record);

    int insertSelective(KtCancerPhaseTnm record);

    KtCancerPhaseTnm selectByPrimaryKey(String cancerPhaseTnmKey);

    int updateByPrimaryKeySelective(KtCancerPhaseTnm record);

    int updateByPrimaryKey(KtCancerPhaseTnm record);

    List<KtCancerPhaseTnm> selectByCancerKey(String cancerKey);

    int insertList(List<KtCancerPhaseTnm> cancerPhaseTnmList);

    int deleteByCancerKey(String cancerKey);
}