package com.huasheng.dao.newdao;

import com.huasheng.pojo.newpojo.KtDataDictionary;

import java.util.List;

public interface KtDataDictionaryDao {
    int deleteByPrimaryKey(String dictionaryKey);

    int insert(KtDataDictionary record);

    int insertSelective(KtDataDictionary record);

    KtDataDictionary selectByPrimaryKey(String dictionaryKey);

    int updateByPrimaryKeySelective(KtDataDictionary record);

    int updateByPrimaryKey(KtDataDictionary record);

    List<KtDataDictionary> getDataDictionaryAll();
}