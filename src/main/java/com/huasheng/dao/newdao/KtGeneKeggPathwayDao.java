package com.huasheng.dao.newdao;

import com.huasheng.pojo.newpojo.KtGeneKeggPathway;

import java.util.List;
import java.util.Map;

public interface KtGeneKeggPathwayDao {
    int deleteByPrimaryKey(KtGeneKeggPathway key);

    int insert(KtGeneKeggPathway record);

    int insertSelective(KtGeneKeggPathway record);

    KtGeneKeggPathway selectByPrimaryKey(KtGeneKeggPathway key);

    int updateByPrimaryKeySelective(KtGeneKeggPathway record);

    int updateByPrimaryKey(KtGeneKeggPathway record);

    Map<String,Object> selectByGeneKey(String geneKey);

    int deleteByGeneKey(String geneKey);

    int insertList(List<KtGeneKeggPathway> list);
}