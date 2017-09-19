package com.huasheng.pojo.newpojo;

public class KtGeneDetectionWays {
    private String detectionWayKey;

    private String detectionKey;

    private Integer wayCycle;

    private Integer wayPrice;

    public String getDetectionWayKey() {
        return detectionWayKey;
    }

    public void setDetectionWayKey(String detectionWayKey) {
        this.detectionWayKey = detectionWayKey == null ? null : detectionWayKey.trim();
    }

    public String getDetectionKey() {
        return detectionKey;
    }

    public void setDetectionKey(String detectionKey) {
        this.detectionKey = detectionKey == null ? null : detectionKey.trim();
    }

    public Integer getWayCycle() {
        return wayCycle;
    }

    public void setWayCycle(Integer wayCycle) {
        this.wayCycle = wayCycle;
    }

    public Integer getWayPrice() {
        return wayPrice;
    }

    public void setWayPrice(Integer wayPrice) {
        this.wayPrice = wayPrice;
    }
}