package com.huasheng.pojo.knpojo;

public class KnDetectionitemDetectionitemorganization {
    private String detectionitemId;

    private String detectionitemorganizationId;

    public String getDetectionitemId() {
        return detectionitemId;
    }

    public void setDetectionitemId(String detectionitemId) {
        this.detectionitemId = detectionitemId == null ? null : detectionitemId.trim();
    }

    public String getDetectionitemorganizationId() {
        return detectionitemorganizationId;
    }

    public void setDetectionitemorganizationId(String detectionitemorganizationId) {
        this.detectionitemorganizationId = detectionitemorganizationId == null ? null : detectionitemorganizationId.trim();
    }
}