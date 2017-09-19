package com.huasheng.pojo.newpojo;

public class KtGeneDetectionWayOrgs {
    private String detectionWayKey;

    private String itemKey;

    public String getDetectionWayKey() {
        return detectionWayKey;
    }

    public void setDetectionWayKey(String detectionWayKey) {
        this.detectionWayKey = detectionWayKey == null ? null : detectionWayKey.trim();
    }

    public String getItemKey() {
        return itemKey;
    }

    public void setItemKey(String itemKey) {
        this.itemKey = itemKey == null ? null : itemKey.trim();
    }
}