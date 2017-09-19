package com.huasheng.pojo.newpojo;

public class KtDrugClinicalTrial {
    private String drugKey;

    private String clinicalTrialKey;
    private Integer drugId;

    private String clinicalTrialId;

    public Integer getDrugId() {
        return drugId;
    }

    public void setDrugId(Integer drugId) {
        this.drugId = drugId;
    }

    public String getClinicalTrialId() {
        return clinicalTrialId;
    }

    public void setClinicalTrialId(String clinicalTrialId) {
        this.clinicalTrialId = clinicalTrialId == null ? null : clinicalTrialId.trim();
    }

    public String getDrugKey() {
        return drugKey;
    }

    public void setDrugKey(String drugKey) {
        this.drugKey = drugKey == null ? null : drugKey.trim();
    }

    public String getClinicalTrialKey() {
        return clinicalTrialKey;
    }

    public void setClinicalTrialKey(String clinicalTrialKey) {
        this.clinicalTrialKey = clinicalTrialKey == null ? null : clinicalTrialKey.trim();
    }
}