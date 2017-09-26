package com.huasheng.dao.kndao;

import com.huasheng.pojo.knpojo.KnScientficResearchDrug;

import java.util.List;

public interface KnScientficResearchDrugDao {
    int deleteByPrimaryKey(String id);

    int insert(KnScientficResearchDrug record);

    int insertSelective(KnScientficResearchDrug record);

    KnScientficResearchDrug selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(KnScientficResearchDrug record);

    int updateByPrimaryKey(KnScientficResearchDrug record);

    List<KnScientficResearchDrug> getKnScientficResearchDrugList();
}