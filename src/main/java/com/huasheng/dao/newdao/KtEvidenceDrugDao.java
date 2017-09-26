package com.huasheng.dao.newdao;

import com.huasheng.pojo.newpojo.KtEvidenceDrug;

import java.util.List;

public interface KtEvidenceDrugDao {
    int deleteByPrimaryKey(KtEvidenceDrug key);

    int insert(KtEvidenceDrug record);

    int insertSelective(KtEvidenceDrug record);

    KtEvidenceDrug selectByPrimaryKey(KtEvidenceDrug key);

    int updateByPrimaryKeySelective(KtEvidenceDrug record);

    int updateByPrimaryKey(KtEvidenceDrug record);

    List<KtEvidenceDrug> selectByEvidenceKey(String evidenceKey);

    boolean insertMore(List<KtEvidenceDrug> evidenceDrugList);

    void deleteByEvidenceKey(String evidenceKey);

    int insertList(List<KtEvidenceDrug> list);
}