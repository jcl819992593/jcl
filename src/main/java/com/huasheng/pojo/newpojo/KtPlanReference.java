package com.huasheng.pojo.newpojo;

public class KtPlanReference {
    private String planReferenceKey;

    private String medicationPlanKey;

    private Integer medicinePlanId;

    private Integer referenceId;

    private String refType;

    private String externalId;

    public String getPlanReferenceKey() {
        return planReferenceKey;
    }

    public void setPlanReferenceKey(String planReferenceKey) {
        this.planReferenceKey = planReferenceKey == null ? null : planReferenceKey.trim();
    }

    public String getMedicationPlanKey() {
        return medicationPlanKey;
    }

    public void setMedicationPlanKey(String medicationPlanKey) {
        this.medicationPlanKey = medicationPlanKey == null ? null : medicationPlanKey.trim();
    }

    public Integer getMedicinePlanId() {
        return medicinePlanId;
    }

    public void setMedicinePlanId(Integer medicinePlanId) {
        this.medicinePlanId = medicinePlanId;
    }

    public Integer getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(Integer referenceId) {
        this.referenceId = referenceId;
    }

    public String getRefType() {
        return refType;
    }

    public void setRefType(String refType) {
        this.refType = refType == null ? null : refType.trim();
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId == null ? null : externalId.trim();
    }
}