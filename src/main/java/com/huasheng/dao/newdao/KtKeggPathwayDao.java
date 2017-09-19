package com.huasheng.dao.newdao;

import com.huasheng.pojo.newpojo.KtDrugKeggPathway;
import com.huasheng.pojo.newpojo.KtKeggPathway;

import java.util.List;
import java.util.Map;

public interface KtKeggPathwayDao {
    int deleteByPrimaryKey(String pathwayKey);

    int insert(KtKeggPathway record);

    int insertSelective(KtKeggPathway record);

    KtKeggPathway selectByPrimaryKey(String pathwayKey);

    int updateByPrimaryKeySelective(KtKeggPathway record);

    int updateByPrimaryKey(KtKeggPathway record);
    List<KtKeggPathway> getPathwayList(String pathwayName);

    /**
     * 通路列表
     * @param map
     * @return
     */
    List<KtKeggPathway> getPathwayPage(Map<String, Object> map);

    int updateKeggPathwayCheckState(KtKeggPathway keggPathway);

    int updateTranslator(KtKeggPathway keggPathway);

    int getKeggPathwayPending(Map<String, Object> map);

    List<KtDrugKeggPathway> getByArray(List list);

    int getKeggPathwayTranslateMonth(Map<String, Object> map);

    int deleteAllPathway();
}