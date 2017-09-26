package com.huasheng.pojo.newpojo;

public class KtGeneCancer {
    private String geneKey;

    private String cancerKey;

    private Integer geneId;

    private Integer doid;

    private String mutationFrequency;

    private String proteinApplication;

    private String geneDetectionDescription;

    private String geneDetectionDescriptionShort;

    public Integer getGeneId() {
        return geneId;
    }

    public void setGeneId(Integer geneId) {
        this.geneId = geneId;
    }

    public Integer getDoid() {
        return doid;
    }

    public void setDoid(Integer doid) {
        this.doid = doid;
    }

    public String getMutationFrequency() {
        return mutationFrequency;
    }

    public void setMutationFrequency(String mutationFrequency) {
        this.mutationFrequency = mutationFrequency == null ? null : mutationFrequency.trim();
    }

    public String getProteinApplication() {
        return proteinApplication;
    }

    public void setProteinApplication(String proteinApplication) {
        this.proteinApplication = proteinApplication == null ? null : proteinApplication.trim();
    }

    public String getGeneDetectionDescription() {
        return geneDetectionDescription;
    }

    public void setGeneDetectionDescription(String geneDetectionDescription) {
        this.geneDetectionDescription = geneDetectionDescription == null ? null : geneDetectionDescription.trim();
    }

    public String getGeneDetectionDescriptionShort() {
        return geneDetectionDescriptionShort;
    }

    public void setGeneDetectionDescriptionShort(String geneDetectionDescriptionShort) {
        this.geneDetectionDescriptionShort = geneDetectionDescriptionShort == null ? null : geneDetectionDescriptionShort.trim();
    }

    public String getGeneKey() {
        return geneKey;
    }

    public void setGeneKey(String geneKey) {
        this.geneKey = geneKey == null ? null : geneKey.trim();
    }

    public String getCancerKey() {
        return cancerKey;
    }

    public void setCancerKey(String cancerKey) {
        this.cancerKey = cancerKey == null ? null : cancerKey.trim();
    }
}