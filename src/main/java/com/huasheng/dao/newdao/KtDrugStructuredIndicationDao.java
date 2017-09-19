package com.huasheng.dao.newdao;


import com.huasheng.pojo.newpojo.KtDrugIndication;
import com.huasheng.pojo.newpojo.KtDrugStructuredIndication;

import java.util.List;

public interface KtDrugStructuredIndicationDao {
    int deleteByPrimaryKey(KtDrugStructuredIndication key);

    int insert(KtDrugStructuredIndication record);

    int insertSelective(KtDrugStructuredIndication record);

    KtDrugStructuredIndication selectByPrimaryKey(KtDrugStructuredIndication key);

    int updateByPrimaryKeySelective(KtDrugStructuredIndication record);

    int updateByPrimaryKey(KtDrugStructuredIndication record);

    int addKtDrugStructuredIndicationMore(List<KtDrugStructuredIndication> list);

    List<KtDrugIndication> selectByDrugKey(String drugKey);

    List<KtDrugStructuredIndication> getListByDrugKey(String drugKey);

    int deleteByDrugKey(String drugKey);
}