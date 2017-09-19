package com.huasheng.pojo.newpojo;

public class KtClinicalTrialCancer {
    private String clinicalTrialKey;

    private String cancerKey;
    private Integer doid;

    private String clinicalTrialId;

    public Integer getDoid() {
        return doid;
    }

    public void setDoid(Integer doid) {
        this.doid = doid;
    }

    public String getclinicalTrialId() {
        return clinicalTrialId;
    }

    public void setclinicalTrialId(String clinicalTrialId) {
        this.clinicalTrialId = clinicalTrialId == null ? null : clinicalTrialId.trim();
    }

    public String getClinicalTrialKey() {
        return clinicalTrialKey;
    }

    public void setClinicalTrialKey(String clinicalTrialKey) {
        this.clinicalTrialKey = clinicalTrialKey == null ? null : clinicalTrialKey.trim();
    }

    public String getCancerKey() {
        return cancerKey;
    }

    public void setCancerKey(String cancerKey) {
        this.cancerKey = cancerKey == null ? null : cancerKey.trim();
    }
}