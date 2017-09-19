package com.huasheng.pojo.newpojo;

public class KtScientificResearchCancer {
    private String researchKey;

    private String cancerKey;
    private String scientificResearchId;

    private Integer doid;

    public String getScientificResearchId() {
        return scientificResearchId;
    }

    public void setScientificResearchId(String scientificResearchId) {
        this.scientificResearchId = scientificResearchId == null ? null : scientificResearchId.trim();
    }

    public Integer getDoid() {
        return doid;
    }

    public void setDoid(Integer doid) {
        this.doid = doid;
    }
    public String getResearchKey() {
        return researchKey;
    }

    public void setResearchKey(String researchKey) {
        this.researchKey = researchKey == null ? null : researchKey.trim();
    }

    public String getCancerKey() {
        return cancerKey;
    }

    public void setCancerKey(String cancerKey) {
        this.cancerKey = cancerKey == null ? null : cancerKey.trim();
    }
}