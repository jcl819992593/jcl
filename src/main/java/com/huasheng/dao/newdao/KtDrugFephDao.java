package com.huasheng.dao.newdao;

import com.huasheng.pojo.newpojo.KtDrugFeph;

import java.util.List;

public interface KtDrugFephDao {
    int deleteByPrimaryKey(String drugFephKey);

    int insert(KtDrugFeph record);

    int insertSelective(KtDrugFeph record);

    KtDrugFeph selectByPrimaryKey(String drugFephKey);

    int updateByPrimaryKeySelective(KtDrugFeph record);

    int updateByPrimaryKey(KtDrugFeph record);

    int addKtDrugFephMore(List<KtDrugFeph> list);

    List<KtDrugFeph> selectByDrugKey(String drugKey);

    int deleteByDrugKey(String drugKey);
}