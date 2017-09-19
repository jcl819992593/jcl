package com.huasheng.dao.newdao;

import com.huasheng.pojo.newpojo.KtDrugProductApprovalNumber;

import java.util.List;

public interface KtDrugProductApprovalNumberDao {
    int deleteByPrimaryKey(KtDrugProductApprovalNumber key);

    int insert(KtDrugProductApprovalNumber record);

    int insertSelective(KtDrugProductApprovalNumber record);

    KtDrugProductApprovalNumber selectByPrimaryKey(KtDrugProductApprovalNumber key);

    int updateByPrimaryKeySelective(KtDrugProductApprovalNumber record);

    int updateByPrimaryKey(KtDrugProductApprovalNumber record);

    int addKtDrugProductApprovalNumber(List<KtDrugProductApprovalNumber> list);

    int deleteByProductKey(String productKey);
}