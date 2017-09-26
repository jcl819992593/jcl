package com.huasheng.dao.kndao;

import com.huasheng.pojo.knpojo.KnScientficResearchCancer;

import java.util.List;

public interface KnScientficResearchCancerDao {
    int deleteByPrimaryKey(String id);

    int insert(KnScientficResearchCancer record);

    int insertSelective(KnScientficResearchCancer record);

    KnScientficResearchCancer selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(KnScientficResearchCancer record);

    int updateByPrimaryKey(KnScientficResearchCancer record);

    List<KnScientficResearchCancer> getKnScientficResearchCancerList();
}