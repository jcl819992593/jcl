package com.huasheng.pojo.knpojo;

public class KnDetectionitemDrug {
    private String detectionitemId;

    private String drugId;

    public String getDetectionitemId() {
        return detectionitemId;
    }

    public void setDetectionitemId(String detectionitemId) {
        this.detectionitemId = detectionitemId == null ? null : detectionitemId.trim();
    }

    public String getDrugId() {
        return drugId;
    }

    public void setDrugId(String drugId) {
        this.drugId = drugId == null ? null : drugId.trim();
    }
}