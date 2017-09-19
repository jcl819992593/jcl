package com.huasheng.dao.newdao;

import com.huasheng.pojo.newpojo.KtDrugFephGene;

import java.util.List;
import java.util.Map;

public interface KtDrugFephGeneDao {
    int deleteByPrimaryKey(KtDrugFephGene key);

    int insert(KtDrugFephGene record);

    int insertSelective(KtDrugFephGene record);

    KtDrugFephGene selectByPrimaryKey(KtDrugFephGene key);

    int updateByPrimaryKeySelective(KtDrugFephGene record);

    int updateByPrimaryKey(KtDrugFephGene record);

    int addKtDrugFephGene(List<KtDrugFephGene> list);

    List<Map<String,Object>> getKtDrugFephGene(String drugKey);
}