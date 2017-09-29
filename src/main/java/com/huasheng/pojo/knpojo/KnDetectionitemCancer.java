package com.huasheng.pojo.knpojo;

public class KnDetectionitemCancer {
    private String detectionitemId;

    private String cancerId;

    public String getDetectionitemId() {
        return detectionitemId;
    }

    public void setDetectionitemId(String detectionitemId) {
        this.detectionitemId = detectionitemId == null ? null : detectionitemId.trim();
    }

    public String getCancerId() {
        return cancerId;
    }

    public void setCancerId(String cancerId) {
        this.cancerId = cancerId == null ? null : cancerId.trim();
    }
}