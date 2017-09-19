package com.huasheng.dao.newdao;


import com.huasheng.pojo.newpojo.KtDocumentCategory;

import java.util.Map;

public interface KtDocumentCategoryDao {
    int deleteByPrimaryKey(KtDocumentCategory key);

    int insert(KtDocumentCategory record);

    int insertSelective(KtDocumentCategory record);

    int deleteByDocumentKey(String documentKey);

    Map<String,Object>selectByDocumentKey(String documentKey);
}