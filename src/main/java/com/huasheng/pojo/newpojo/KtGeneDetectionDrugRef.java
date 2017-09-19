package com.huasheng.pojo.newpojo;

public class KtGeneDetectionDrugRef {
    private String detectionKey;

    private String drugKey;

    public String getDetectionKey() {
        return detectionKey;
    }

    public void setDetectionKey(String detectionKey) {
        this.detectionKey = detectionKey == null ? null : detectionKey.trim();
    }

    public String getDrugKey() {
        return drugKey;
    }

    public void setDrugKey(String drugKey) {
        this.drugKey = drugKey == null ? null : drugKey.trim();
    }
}