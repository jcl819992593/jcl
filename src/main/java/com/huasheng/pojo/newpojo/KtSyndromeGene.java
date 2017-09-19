package com.huasheng.pojo.newpojo;

public class KtSyndromeGene {
    private String syndromeKey;

    private String geneKey;
    private Integer geneId;

    public Integer getGeneId() {
        return geneId;
    }

    public void setGeneId(Integer geneId) {
        this.geneId = geneId;
    }

    public String getSyndromeKey() {
        return syndromeKey;
    }

    public void setSyndromeKey(String syndromeKey) {
        this.syndromeKey = syndromeKey == null ? null : syndromeKey.trim();
    }

    public String getGeneKey() {
        return geneKey;
    }

    public void setGeneKey(String geneKey) {
        this.geneKey = geneKey == null ? null : geneKey.trim();
    }
}