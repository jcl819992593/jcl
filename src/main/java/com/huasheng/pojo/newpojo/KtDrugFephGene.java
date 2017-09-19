package com.huasheng.pojo.newpojo;

public class KtDrugFephGene {
    private Integer fephId;

    private Integer geneId;

    private String drugFephKey;

    private String geneKey;

    public String getDrugFephKey() {
        return drugFephKey;
    }

    public void setDrugFephKey(String drugFephKey) {
        this.drugFephKey = drugFephKey == null ? null : drugFephKey.trim();
    }

    public String getGeneKey() {
        return geneKey;
    }

    public void setGeneKey(String geneKey) {
        this.geneKey = geneKey == null ? null : geneKey.trim();
    }

    public Integer getFephId() {
        return fephId;
    }

    public void setFephId(Integer fephId) {
        this.fephId = fephId;
    }

    public Integer getGeneId() {
        return geneId;
    }

    public void setGeneId(Integer geneId) {
        this.geneId = geneId;
    }
}