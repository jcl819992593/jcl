package com.huasheng.dao.kndao;

import com.huasheng.pojo.knpojo.KnDetectionitemDrug;

import java.util.List;

public interface KnDetectionitemDrugDao {
    int insert(KnDetectionitemDrug record);

    int insertSelective(KnDetectionitemDrug record);

    List<KnDetectionitemDrug> getKnDetectionitemDrugList();
}