package com.huasheng.pojo.newpojo;

public class KtScientificResearchGene {
    private String researchKey;

    private String geneKey;
    private String scientificResearchId;

    private String geneId;

    public String getScientificResearchId() {
        return scientificResearchId;
    }

    public void setScientificResearchId(String scientificResearchId) {
        this.scientificResearchId = scientificResearchId == null ? null : scientificResearchId.trim();
    }

    public String getGeneId() {
        return geneId;
    }

    public void setGeneId(String geneId) {
        this.geneId = geneId == null ? null : geneId.trim();
    }
    public String getResearchKey() {
        return researchKey;
    }

    public void setResearchKey(String researchKey) {
        this.researchKey = researchKey == null ? null : researchKey.trim();
    }

    public String getGeneKey() {
        return geneKey;
    }

    public void setGeneKey(String geneKey) {
        this.geneKey = geneKey == null ? null : geneKey.trim();
    }
}