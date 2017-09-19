package com.huasheng.dao.newdao;

import com.huasheng.pojo.newpojo.KtDrugGene;

public interface KtDrugGeneDao {
    int deleteByPrimaryKey(KtDrugGene key);

    int insert(KtDrugGene record);

    int insertSelective(KtDrugGene record);

    KtDrugGene selectByPrimaryKey(KtDrugGene key);

    int updateByPrimaryKeySelective(KtDrugGene record);

    int updateByPrimaryKey(KtDrugGene record);

    int updateKtDrugGene(KtDrugGene ktDrugGene);
}