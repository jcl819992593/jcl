package com.huasheng.dao.kndao;

import com.huasheng.pojo.knpojo.KnCancerAlias;

import java.util.List;

public interface KnCancerAliasDao {
    int deleteByPrimaryKey(String id);

    int insert(KnCancerAlias record);

    int insertSelective(KnCancerAlias record);

    KnCancerAlias selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(KnCancerAlias record);

    int updateByPrimaryKey(KnCancerAlias record);

    List<KnCancerAlias> getKnCancerAliasList();
}