package com.huasheng.pojo.newpojo;

public class KtClinicalTrialGene {
    private String clinicalTrialKey;

    private String geneKey;

    private String clinicalTrialId;

    private Integer geneId;

    public String getclinicalTrialId() {
        return clinicalTrialId;
    }

    public void setclinicalTrialId(String clinicalTrialId) {
        this.clinicalTrialId = clinicalTrialId;
    }

    public Integer getGeneId() {
        return geneId;
    }

    public void setGeneId(Integer geneId) {
        this.geneId = geneId;
    }
    public String getClinicalTrialKey() {
        return clinicalTrialKey;
    }

    public void setClinicalTrialKey(String clinicalTrialKey) {
        this.clinicalTrialKey = clinicalTrialKey == null ? null : clinicalTrialKey.trim();
    }

    public String getGeneKey() {
        return geneKey;
    }

    public void setGeneKey(String geneKey) {
        this.geneKey = geneKey == null ? null : geneKey.trim();
    }
}