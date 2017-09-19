package com.huasheng.dao.newdao;


import com.huasheng.pojo.newpojo.KtDrugDetails;

public interface KtDrugDetailsDao {
    int deleteByPrimaryKey(String detailKey);

    int insert(KtDrugDetails record);

    int insertSelective(KtDrugDetails record);

    KtDrugDetails selectByPrimaryKey(String detailKey);

    int updateByPrimaryKeySelective(KtDrugDetails record);

    int updateByPrimaryKey(KtDrugDetails record);

    KtDrugDetails selectByDrugKey(String drugKey);
}