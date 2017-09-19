package com.huasheng.dao.newdao;


import com.huasheng.pojo.newpojo.KtDataDictionaryItems;

import java.util.List;
import java.util.Map;

public interface KtDataDictionaryItemsDao {
    int deleteByPrimaryKey(String itemKey);

    int insert(KtDataDictionaryItems record);

    int insertSelective(KtDataDictionaryItems record);

    KtDataDictionaryItems selectByPrimaryKey(String itemKey);

    int updateByPrimaryKeySelective(KtDataDictionaryItems record);

    int updateByPrimaryKey(KtDataDictionaryItems record);

    List<Map<String,Object>> getDataDictionaryItemsList(Map<String, Object> map);

    List<KtDataDictionaryItems> getKtDrugProductApprovalOrgList(String dictionaryKey);

    List<KtDataDictionaryItems> selectItemByDictionaryKey(String dictionaryKey);

    int deleteAllItems();
}