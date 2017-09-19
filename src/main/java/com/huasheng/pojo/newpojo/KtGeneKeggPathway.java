package com.huasheng.pojo.newpojo;

public class KtGeneKeggPathway {
    private String geneKey;

    private String pathwayKey;
    private String geneId;

    private String keggId;

    public String getGeneId() {
        return geneId;
    }

    public void setGeneId(String geneId) {
        this.geneId = geneId == null ? null : geneId.trim();
    }

    public String getKeggId() {
        return keggId;
    }

    public void setKeggId(String keggId) {
        this.keggId = keggId == null ? null : keggId.trim();
    }

    public String getGeneKey() {
        return geneKey;
    }

    public void setGeneKey(String geneKey) {
        this.geneKey = geneKey == null ? null : geneKey.trim();
    }

    public String getPathwayKey() {
        return pathwayKey;
    }

    public void setPathwayKey(String pathwayKey) {
        this.pathwayKey = pathwayKey == null ? null : pathwayKey.trim();
    }
}