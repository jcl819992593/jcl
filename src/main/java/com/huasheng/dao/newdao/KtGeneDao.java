package com.huasheng.dao.newdao;

import com.huasheng.pojo.newpojo.KtGene;

import java.util.List;
import java.util.Map;

public interface KtGeneDao {
    int deleteByPrimaryKey(String geneKey);

    int insert(KtGene record);

    int insertSelective(KtGene record);

    KtGene selectByPrimaryKey(String geneKey);

    int updateByPrimaryKeySelective(KtGene record);

    int updateByPrimaryKey(KtGene record);
    List<Map<String,Object>> getGeneList(Map<String, Object> map);

    KtGene selectByDrugKey(String drugKey);

    int updateGeneCheckState(KtGene ktGene);
    //更新基因翻译状态
    int updateTranslator(KtGene ktGene);

    int getGenePending(Map<String, Object> map);

    List<Map<String,Object>> getGeneProtein(Map<String, Object> map);

    int getGeneTranslateMonth(Map<String, Object> map);

    int deleteAllGene();
}