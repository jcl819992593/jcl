package com.huasheng.dao.olddao;

import com.huasheng.pojo.oldpojo.OldKtEvidenceReference;

import java.util.List;

public interface OldKtEvidenceReferenceDao {
    int deleteByPrimaryKey(String id);

    int insert(OldKtEvidenceReference record);

    int insertSelective(OldKtEvidenceReference record);

    OldKtEvidenceReference selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(OldKtEvidenceReference record);

    int updateByPrimaryKey(OldKtEvidenceReference record);

    List<OldKtEvidenceReference> getOldEvidenceReferenceList();
}