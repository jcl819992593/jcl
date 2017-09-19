package com.huasheng.dao.newdao;

import com.huasheng.pojo.newpojo.KtDrugExternalId;

import java.util.List;

public interface KtDrugExternalIdDao {
    int deleteByPrimaryKey(String externalIdKey);

    int insert(KtDrugExternalId record);

    int insertSelective(KtDrugExternalId record);

    KtDrugExternalId selectByPrimaryKey(String externalIdKey);

    int updateByPrimaryKeySelective(KtDrugExternalId record);

    int updateByPrimaryKey(KtDrugExternalId record);

    int addKtDrugExternalIdMore(List<KtDrugExternalId> list);

    List<KtDrugExternalId> selectByDrugKey(String drugKey);

    int deleteByDrugKey(String drugKey);
}