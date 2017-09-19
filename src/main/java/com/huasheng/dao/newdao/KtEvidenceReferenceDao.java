package com.huasheng.dao.newdao;

import com.huasheng.pojo.newpojo.KtEvidenceReference;

public interface KtEvidenceReferenceDao {
    int deleteByPrimaryKey(String evidenceReferenceKey);

    int insert(KtEvidenceReference record);

    int insertSelective(KtEvidenceReference record);

    KtEvidenceReference selectByPrimaryKey(String evidenceReferenceKey);

    int updateByPrimaryKeySelective(KtEvidenceReference record);

    int updateByPrimaryKey(KtEvidenceReference record);

    KtEvidenceReference selectByEvidenceKey(String evidenceKey);
}