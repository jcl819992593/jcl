package com.huasheng.pojo.newpojo;

public class KtScientificResearchDrug {
    private String drugKey;

    private String researchKey;
    private String scientificResearchId;

    private String drugId;

    public String getScientificResearchId() {
        return scientificResearchId;
    }

    public void setScientificResearchId(String scientificResearchId) {
        this.scientificResearchId = scientificResearchId == null ? null : scientificResearchId.trim();
    }

    public String getDrugId() {
        return drugId;
    }

    public void setDrugId(String drugId) {
        this.drugId = drugId == null ? null : drugId.trim();
    }
    public String getDrugKey() {
        return drugKey;
    }

    public void setDrugKey(String drugKey) {
        this.drugKey = drugKey == null ? null : drugKey.trim();
    }

    public String getResearchKey() {
        return researchKey;
    }

    public void setResearchKey(String researchKey) {
        this.researchKey = researchKey == null ? null : researchKey.trim();
    }
}