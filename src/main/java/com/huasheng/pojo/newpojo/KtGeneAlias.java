package com.huasheng.pojo.newpojo;

public class KtGeneAlias {
    private String geneAliasKey;

    private String geneKey;

    private Integer geneId;

    private String geneAlias;

    public String getGeneAliasKey() {
        return geneAliasKey;
    }

    public void setGeneAliasKey(String geneAliasKey) {
        this.geneAliasKey = geneAliasKey == null ? null : geneAliasKey.trim();
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

    public String getGeneAlias() {
        return geneAlias;
    }

    public void setGeneAlias(String geneAlias) {
        this.geneAlias = geneAlias == null ? null : geneAlias.trim();
    }

}