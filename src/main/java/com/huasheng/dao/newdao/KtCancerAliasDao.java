package com.huasheng.dao.newdao;

import com.huasheng.pojo.newpojo.KtCancerAlias;

import java.util.List;

public interface KtCancerAliasDao {
    int deleteByPrimaryKey(String cancerAliasKey);

    int insert(KtCancerAlias record);

    int insertSelective(KtCancerAlias record);

    KtCancerAlias selectByPrimaryKey(String cancerAliasKey);

    int updateByPrimaryKeySelective(KtCancerAlias record);

    int updateByPrimaryKey(KtCancerAlias record);

    List<KtCancerAlias> selectByCancerKey(String cancerKey);

    int insertList(List<KtCancerAlias> aliasList);

    int deleteByCancerKey(String cancerKey);
}