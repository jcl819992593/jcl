package com.huasheng.pojo.newpojo;

public class KtSyndromeCancer {
    private String syndromeKey;

    private String cancerKey;
    private Integer cancerId;

    public Integer getCancerId() {
        return cancerId;
    }

    public void setCancerId(Integer cancerId) {
        this.cancerId = cancerId;
    }

    public String getSyndromeKey() {
        return syndromeKey;
    }

    public void setSyndromeKey(String syndromeKey) {
        this.syndromeKey = syndromeKey == null ? null : syndromeKey.trim();
    }

    public String getCancerKey() {
        return cancerKey;
    }

    public void setCancerKey(String cancerKey) {
        this.cancerKey = cancerKey == null ? null : cancerKey.trim();
    }
}