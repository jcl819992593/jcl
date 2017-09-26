package com.huasheng.dao.newdao;

import com.huasheng.pojo.newpojo.KtDocument;

import java.util.List;
import java.util.Map;

public interface KtDocumentDao {
    int deleteByPrimaryKey(String documentKey);

    int insert(KtDocument record);

    int insertSelective(KtDocument record);

    KtDocument selectByPrimaryKey(String documentKey);

    int updateByPrimaryKeySelective(KtDocument record);

    int updateByPrimaryKey(KtDocument record);

    List<Map<String, Object>> getDocumentList(Map<String, Object> map);

    int updateCheckState(KtDocument document);

    int getDocumentCount(Map<String, Object> map);

    int getDocumentCountMonth(Map<String, Object> map);

    int deleteAllDocument();

    int insertList(List<KtDocument> list);
}