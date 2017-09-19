package com.huasheng.dao.newdao;

import com.huasheng.pojo.newpojo.KtDrugKeggPathway;

import java.util.List;

public interface KtDrugKeggPathwayDao {
    int deleteByPrimaryKey(KtDrugKeggPathway key);

    int insert(KtDrugKeggPathway record);

    int insertSelective(KtDrugKeggPathway record);

    KtDrugKeggPathway selectByPrimaryKey(KtDrugKeggPathway key);

    int updateByPrimaryKeySelective(KtDrugKeggPathway record);

    int updateByPrimaryKey(KtDrugKeggPathway record);

    /**
     * 批量插入通路id和名称
     * @param list
     * @return
     */
    int addKtDrugKeggPathwayMore(List<KtDrugKeggPathway> list);

    List<KtDrugKeggPathway> selectByDrugKey(String drugKey);

    int deleteByDrugKey(String drugKey);
}