package com.huasheng.dao.newdao;

import com.huasheng.pojo.newpojo.KtDrugOtherName;

import java.util.List;

public interface KtDrugOtherNameDao {
    int deleteByPrimaryKey(String otherNameKey);

    int insert(KtDrugOtherName record);

    int insertSelective(KtDrugOtherName record);

    KtDrugOtherName selectByPrimaryKey(String otherNameKey);

    int updateByPrimaryKeySelective(KtDrugOtherName record);

    int updateByPrimaryKey(KtDrugOtherName record);

    int addKtDrugOtherNameMore(List<KtDrugOtherName> list);

    List<KtDrugOtherName> selectByDrugKey(String drugKey);

    int deleteByDrugKey(String drugKey);
}