package com.huasheng.dao.kndao;

import com.huasheng.pojo.knpojo.KnScientficResearch;

import java.util.List;

public interface KnScientficResearchDao {
    int deleteByPrimaryKey(String id);

    int insert(KnScientficResearch record);

    int insertSelective(KnScientficResearch record);

    KnScientficResearch selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(KnScientficResearch record);

    int updateByPrimaryKey(KnScientficResearch record);

    List<KnScientficResearch> getKnScientficResearchList();
}