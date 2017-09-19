package com.huasheng.dao.newdao;

import com.huasheng.pojo.newpojo.KtEvidence;

import java.util.List;
import java.util.Map;

public interface KtEvidenceDao {
    int deleteByPrimaryKey(String evidenceKey);

    int insert(KtEvidence record);

    int insertSelective(KtEvidence record);

    KtEvidence selectByPrimaryKey(String evidenceKey);

    int updateByPrimaryKeySelective(KtEvidence record);

    int updateByPrimaryKey(KtEvidence record);

    List<Map<String,Object>> getEvidenceList(Map<String, Object> map);

    int updateCheckState(KtEvidence evidence);

    KtEvidence selectById(Integer evidenceId);

    int getEvidenceCount(Map<String, Object> map);

    int getEvidenceCountMonth(Map<String, Object> map);

    int deleteAllSyndrome();
}