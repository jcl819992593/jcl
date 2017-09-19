package com.huasheng.dao.newdao;

import com.huasheng.pojo.newpojo.KtPlanAlias;

import java.util.List;

public interface KtPlanAliasDao {
    int deleteByPrimaryKey(String planAliasKey);

    int insert(KtPlanAlias record);

    int insertSelective(KtPlanAlias record);

    KtPlanAlias selectByPrimaryKey(String planAliasKey);

    int updateByPrimaryKeySelective(KtPlanAlias record);

    int updateByPrimaryKey(KtPlanAlias record);

    List<KtPlanAlias> getPlanAliasByKey(String medicationPlanKey);

    int insertPlanAliasList(List<KtPlanAlias> aliases);

    int deleteByMedicationPlanKey(String medicationPlanKey);
}