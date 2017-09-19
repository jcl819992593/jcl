package com.huasheng.pojo.newpojo;

public class KtPlanNccn {
    private String planNccnKey;

    private String medicationPlanKey;

    private Integer medicationPlanId;

    private Integer theCategory;

    private String citeMessage;

    private String theUrl;

    private String theClassification;

    public String getPlanNccnKey() {
        return planNccnKey;
    }

    public void setPlanNccnKey(String planNccnKey) {
        this.planNccnKey = planNccnKey == null ? null : planNccnKey.trim();
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

    public String getTheClassification() {
        return theClassification;
    }

    public void setTheClassification(String theClassification) {
        this.theClassification = theClassification == null ? null : theClassification.trim();
    }
}