package com.huasheng.dao.olddao;

import com.huasheng.pojo.oldpojo.OldKtIndication;

import java.util.List;

public interface OldKtIndicationDao {
    int deleteByPrimaryKey(String id);

    int insert(OldKtIndication record);

    int insertSelective(OldKtIndication record);

    OldKtIndication selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(OldKtIndication record);

    int updateByPrimaryKey(OldKtIndication record);

    List<OldKtIndication> getOldKtIndicationList();
}