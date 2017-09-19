package com.huasheng.dao.newdao;

import com.huasheng.pojo.newpojo.KtDrugActionTarget;

public interface KtDrugActionTargetDao {
    int deleteByPrimaryKey(String actionTargetKey);

    int insert(KtDrugActionTarget record);

    int insertSelective(KtDrugActionTarget record);

    KtDrugActionTarget selectByPrimaryKey(String actionTargetKey);

    int updateByPrimaryKeySelective(KtDrugActionTarget record);

    int updateByPrimaryKey(KtDrugActionTarget record);

    KtDrugActionTarget selectByDrugKey(String drugKey);
}