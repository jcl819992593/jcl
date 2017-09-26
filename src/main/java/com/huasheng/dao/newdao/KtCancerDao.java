package com.huasheng.dao.newdao;


import com.huasheng.pojo.newpojo.KtCancer;
import com.huasheng.pojo.newpojo.KtVariant;

import java.util.List;
import java.util.Map;

public interface KtCancerDao {
    int deleteByPrimaryKey(String cancerKey);

    int insert(KtCancer record);

    int insertSelective(KtCancer record);

    KtCancer selectByPrimaryKey(String cancerKey);

    int updateByPrimaryKeySelective(KtCancer record);

    int updateByPrimaryKey(KtCancer record);

    /**
     * 肿瘤列表
     * @param map
     * @return
     */
    List<KtVariant> getCancerList(Map<String, Object> map);

    /**
     * 更新疾病状态
     * @param ktCancer
     * @return
     */
    int updateCheckState(KtCancer ktCancer);

    /**
     * 查询上级疾病
     * @param pKey
     * @return
     */
    KtCancer selectByPKey(String pKey);

    int updateTranslator(KtCancer ktCancer);

    KtCancer selectByDoid(String doid);

    int getCancerCount(Map<String, Object> map);

    int getCancerCountMonth(Map<String, Object> map);

    int deleteAllCancer();

    int insertCancerList(List<KtCancer> list);

    List<KtCancer> getCancerLists();

    List<String> getCancerKeys(List<String> doids);
}