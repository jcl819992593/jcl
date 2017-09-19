package com.huasheng.pojo.newpojo;

public class KtPlanConsensus {
    private String planConsensusKey;

    private String medicationPlanKey;

    private Integer medicationPlanId;

    private Integer theCategory;

    private String citeMessage;

    private String theUrl;

    private String classification;

    public String getPlanConsensusKey() {
        return planConsensusKey;
    }

    public void setPlanConsensusKey(String planConsensusKey) {
        this.planConsensusKey = planConsensusKey == null ? null : planConsensusKey.trim();
    }

    public String getMedicationPlanKey() {
        return medicationPlanKey;
    }

    public void setMedicationPlanKey(String medicationPlanKey) {
        this.medicationPlanKey = medicationPlanKey == null ? null : medicationPlanKey.trim();
    }

    public Integer getMedicationPlanId() {
        return medicationPlanId;
    }

    public void setMedicationPlanId(Integer medicationPlanId) {
        this.medicationPlanId = medicationPlanId;
    }

    public Integer getTheCategory() {
        return theCategory;
    }

    public void setTheCategory(Integer theCategory) {
        this.theCategory = theCategory;
    }

    public String getCiteMessage() {
        return citeMessage;
    }

    public void setCiteMessage(String citeMessage) {
        this.citeMessage = citeMessage == null ? null : citeMessage.trim();
    }

    public String getTheUrl() {
        return theUrl;
    }

    public void setTheUrl(String theUrl) {
        this.theUrl = theUrl == null ? null : theUrl.trim();
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification == null ? null : classification.trim();
    }
}