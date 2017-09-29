package com.huasheng.pojo.knpojo;

public class KnDetectionitemDetectionsubitem {
    private String detectionitemId;

    private String detectionsubitemId;

    public String getDetectionitemId() {
        return detectionitemId;
    }

    public void setDetectionitemId(String detectionitemId) {
        this.detectionitemId = detectionitemId == null ? null : detectionitemId.trim();
    }

    public String getDetectionsubitemId() {
        return detectionsubitemId;
    }

    public void setDetectionsubitemId(String detectionsubitemId) {
        this.detectionsubitemId = detectionsubitemId == null ? null : detectionsubitemId.trim();
    }
}