package com.huasheng.dao.newdao;

import com.huasheng.pojo.newpojo.KtDrugInternationalBrand;

import java.util.List;

public interface KtDrugInternationalBrandDao {
    int deleteByPrimaryKey(String internationalBrandKey);

    int insert(KtDrugInternationalBrand record);

    int insertSelective(KtDrugInternationalBrand record);

    KtDrugInternationalBrand selectByPrimaryKey(String internationalBrandKey);

    int updateByPrimaryKeySelective(KtDrugInternationalBrand record);

    int updateByPrimaryKey(KtDrugInternationalBrand record);

    int addKtDrugInternationalBrandMore(List<KtDrugInternationalBrand> list);

    List<KtDrugInternationalBrand> selectByDrugKey(String drugKey);

    int deleteByDrugKey(String drugKey);
}