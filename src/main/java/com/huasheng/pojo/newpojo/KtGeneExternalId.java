package com.huasheng.pojo.newpojo;

public class KtGeneExternalId {
    private String geneExternalIdKey;

    private String geneKey;

    private Integer geneId;

    private String source;

    private String sourceId;

    public String getGeneExternalIdKey() {
        return geneExternalIdKey;
    }

    public void setGeneExternalIdKey(String geneExternalIdKey) {
        this.geneExternalIdKey = geneExternalIdKey == null ? null : geneExternalIdKey.trim();
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

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId == null ? null : sourceId.trim();
    }

}