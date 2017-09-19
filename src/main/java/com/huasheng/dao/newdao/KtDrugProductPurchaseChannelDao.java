package com.huasheng.dao.newdao;

import com.huasheng.pojo.newpojo.KtDrugProductPurchaseChannel;

import java.util.List;

public interface KtDrugProductPurchaseChannelDao {
    int deleteByPrimaryKey(String channelKey);

    int insert(KtDrugProductPurchaseChannel record);

    int insertSelective(KtDrugProductPurchaseChannel record);

    KtDrugProductPurchaseChannel selectByPrimaryKey(String channelKey);

    int updateByPrimaryKeySelective(KtDrugProductPurchaseChannel record);

    int updateByPrimaryKey(KtDrugProductPurchaseChannel record);
    int addKtDrugProductPurchaseChannelMore(List<KtDrugProductPurchaseChannel> list);

    List<KtDrugProductPurchaseChannel> selectByProductKey(String productKey);

    int deleteKtDrugPurchaseChannelByProductKey(String productKey);
}