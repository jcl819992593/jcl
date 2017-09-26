package com.huasheng.pojo.oldpojo;

public class OldKtGeneAlias {
    private String id;

    private Integer geneId;

    private String geneAlias;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getGeneId() {
        return geneId;
    }

    public void setGeneId(Integer geneId) {
        this.geneId = geneId;
    }

    public String getGeneAlias() {
        return geneAlias;
    }

    public void setGeneAlias(String geneAlias) {
        this.geneAlias = geneAlias == null ? null : geneAlias.trim();
    }
}