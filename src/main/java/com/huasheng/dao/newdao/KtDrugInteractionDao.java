package com.huasheng.dao.newdao;

import com.huasheng.pojo.newpojo.KtDrugIdInteraction;
import com.huasheng.pojo.newpojo.KtDrugInteraction;

import java.util.List;
import java.util.Map;

public interface KtDrugInteractionDao {
    int deleteByPrimaryKey(String interactionKey);

    int insert(KtDrugInteraction record);

    int insertSelective(KtDrugInteraction record);

    KtDrugInteraction selectByPrimaryKey(String interactionKey);

    int updateByPrimaryKeySelective(KtDrugInteraction record);

    int updateByPrimaryKeyWithBLOBs(KtDrugInteraction record);

    int updateByPrimaryKey(KtDrugInteraction record);

    List<KtDrugInteraction> selectByDrugKey(String drugKey);

    int addKtDrugInteractionMore(List<KtDrugInteraction> list);

    int deleteByDrugKey(String drugKey);

    List<Map<String,Object>> getByDrugKey(Map<String, Object> map);

    List<KtDrugIdInteraction> getKtDrugIdInteractions(Map<String, Object> map);
}