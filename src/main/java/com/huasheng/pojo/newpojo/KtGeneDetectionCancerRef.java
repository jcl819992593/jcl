package com.huasheng.pojo.newpojo;

public class KtGeneDetectionCancerRef {
    private String detectionKey;

    private String cancerKey;

    public String getDetectionKey() {
        return detectionKey;
    }

    public void setDetectionKey(String detectionKey) {
        this.detectionKey = detectionKey == null ? null : detectionKey.trim();
    }

    public String getCancerKey() {
        return cancerKey;
    }

    public void setCancerKey(String cancerKey) {
        this.cancerKey = cancerKey == null ? null : cancerKey.trim();
    }
}