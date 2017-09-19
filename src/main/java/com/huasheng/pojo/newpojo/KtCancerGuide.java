package com.huasheng.pojo.newpojo;

public class KtCancerGuide {
    private String cancerGuideKey;

    private String cancerKey;

    private Integer doid;

    private String domesticGuideline;

    private String foreignGuideline;

    public String getCancerGuideKey() {
        return cancerGuideKey;
    }

    public void setCancerGuideKey(String cancerGuideKey) {
        this.cancerGuideKey = cancerGuideKey == null ? null : cancerGuideKey.trim();
    }

    public String getCancerKey() {
        return cancerKey;
    }

    public void setCancerKey(String cancerKey) {
        this.cancerKey = cancerKey == null ? null : cancerKey.trim();
    }

    public Integer getDoid() {
        return doid;
    }

    public void setDoid(Integer doid) {
        this.doid = doid;
    }

    public String getDomesticGuideline() {
        return domesticGuideline;
    }

    public void setDomesticGuideline(String domesticGuideline) {
        this.domesticGuideline = domesticGuideline == null ? null : domesticGuideline.trim();
    }

    public String getForeignGuideline() {
        return foreignGuideline;
    }

    public void setForeignGuideline(String foreignGuideline) {
        this.foreignGuideline = foreignGuideline == null ? null : foreignGuideline.trim();
    }
}