package com.huasheng.dao.newdao;

import com.huasheng.pojo.newpojo.KtDrugProductEtnId;

import java.util.List;

public interface KtDrugProductEtnIdDao {
    int deleteByPrimaryKey(String etnIdKey);

    int insert(KtDrugProductEtnId record);

    int insertSelective(KtDrugProductEtnId record);

    KtDrugProductEtnId selectByPrimaryKey(String etnIdKey);

    int updateByPrimaryKeySelective(KtDrugProductEtnId record);

    int updateByPrimaryKey(KtDrugProductEtnId record);

    int addKtDrugProductEtnId(List<KtDrugProductEtnId> list);

    List<KtDrugProductEtnId> selectByProductKey(String productKey);

    int deleteKtDrugProductEtnIdByProductKey(String productKey);
}