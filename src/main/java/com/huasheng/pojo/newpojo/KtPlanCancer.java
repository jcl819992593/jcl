package com.huasheng.pojo.newpojo;

public class KtPlanCancer {
    private String medicationPlanKey;

    private String cancerKey;

    private Integer medicinePlanId;

    private Integer doid;

    private String doidName;

    public String getMedicationPlanKey() {
        return medicationPlanKey;
    }

    public void setMedicationPlanKey(String medicationPlanKey) {
        this.medicationPlanKey = medicationPlanKey == null ? null : medicationPlanKey.trim();
    }

    public String getCancerKey() {
        return cancerKey;
    }

    public void setCancerKey(String cancerKey) {
        this.cancerKey = cancerKey == null ? null : cancerKey.trim();
    }

    public Integer getMedicinePlanId() {
        return medicinePlanId;
    }

    public void setMedicinePlanId(Integer medicinePlanId) {
        this.medicinePlanId = medicinePlanId;
    }

    public Integer getDoid() {
        return doid;
    }

    public void setDoid(Integer doid) {
        this.doid = doid;
    }

    public String getDoidName() {
        return doidName;
    }

    public void setDoidName(String doidName) {
        this.doidName = doidName == null ? null : doidName.trim();
    }
}