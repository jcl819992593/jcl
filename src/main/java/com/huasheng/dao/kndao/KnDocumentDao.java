package com.huasheng.dao.kndao;

import com.huasheng.pojo.knpojo.KnDocument;

import java.util.List;

public interface KnDocumentDao {
    int deleteByPrimaryKey(String id);

    int insert(KnDocument record);

    int insertSelective(KnDocument record);

    KnDocument selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(KnDocument record);

    int updateByPrimaryKey(KnDocument record);

    List<KnDocument> getKnDocumentList();
}