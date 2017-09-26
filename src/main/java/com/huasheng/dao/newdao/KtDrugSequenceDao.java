package com.huasheng.dao.newdao;


import com.huasheng.pojo.newpojo.KtDrugSequence;

import java.util.List;

public interface KtDrugSequenceDao {
    int deleteByPrimaryKey(String sequenceKey);

    int insert(KtDrugSequence record);

    int insertSelective(KtDrugSequence record);

    KtDrugSequence selectByPrimaryKey(String sequenceKey);

    int updateByPrimaryKeySelective(KtDrugSequence record);

    int updateByPrimaryKey(KtDrugSequence record);

    KtDrugSequence selectByDrugKey(String drugKey);

    int insertDrugSequenceList(List<KtDrugSequence> list);

}