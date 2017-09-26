package com.huasheng.pojo.knpojo;

public class KnGeneGeneMetabolism {
    private String geneId;

    private String geneMetabolismId;

    public String getGeneId() {
        return geneId;
    }

    public void setGeneId(String geneId) {
        this.geneId = geneId == null ? null : geneId.trim();
    }

    public String getGeneMetabolismId() {
        return geneMetabolismId;
    }

    public void setGeneMetabolismId(String geneMetabolismId) {
        this.geneMetabolismId = geneMetabolismId == null ? null : geneMetabolismId.trim();
    }
}