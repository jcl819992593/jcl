package com.huasheng.pojo.newpojo;

public class KtGeneOtherName {
    private String geneOtherNameKey;

    private String geneKey;

    private Integer geneId;

    private String otherName;

    public String getGeneOtherNameKey() {
        return geneOtherNameKey;
    }

    public void setGeneOtherNameKey(String geneOtherNameKey) {
        this.geneOtherNameKey = geneOtherNameKey == null ? null : geneOtherNameKey.trim();
    }

    public String getGeneKey() {
        return geneKey;
    }

    public void setGeneKey(String geneKey) {
        this.geneKey = geneKey == null ? null : geneKey.trim();
    }

    public Integer getGeneId() {
        return geneId;
    }

    public void setGeneId(Integer geneId) {
        this.geneId = geneId;
    }

    public String getOtherName() {
        return otherName;
    }

    public void setOtherName(String otherName) {
        this.otherName = otherName == null ? null : otherName.trim();
    }

}