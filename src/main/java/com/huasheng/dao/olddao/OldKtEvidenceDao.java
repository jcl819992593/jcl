package com.huasheng.dao.olddao;

import com.huasheng.pojo.oldpojo.OldKtEvidence;

import java.util.List;

public interface OldKtEvidenceDao {
    int deleteByPrimaryKey(String id);

    int insert(OldKtEvidence record);

    int insertSelective(OldKtEvidence record);

    OldKtEvidence selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(OldKtEvidence record);

    int updateByPrimaryKey(OldKtEvidence record);

    List<OldKtEvidence> getOldKtEvidenceList();
}