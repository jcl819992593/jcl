package com.huasheng.pojo.newpojo;

public class KtGeneDetectionGeneRef {
    private String detectionKey;

    private String geneKey;

    public String getDetectionKey() {
        return detectionKey;
    }

    public void setDetectionKey(String detectionKey) {
        this.detectionKey = detectionKey == null ? null : detectionKey.trim();
    }

    public String getGeneKey() {
        return geneKey;
    }

    public void setGeneKey(String geneKey) {
        this.geneKey = geneKey == null ? null : geneKey.trim();
    }
}