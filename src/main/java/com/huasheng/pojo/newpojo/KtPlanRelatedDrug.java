package com.huasheng.pojo.newpojo;

public class KtPlanRelatedDrug {
    private String medicationPlanKey;

    private String drugKey;
    private Integer medicationPlanId;

    private Integer drugId;

    public Integer getMedicationPlanId() {
        return medicationPlanId;
    }

    public void setMedicationPlanId(Integer medicationPlanId) {
        this.medicationPlanId = medicationPlanId;
    }

    public Integer getDrugId() {
        return drugId;
    }

    public void setDrugId(Integer drugId) {
        this.drugId = drugId;
    }

    public String getMedicationPlanKey() {
        return medicationPlanKey;
    }

    public void setMedicationPlanKey(String medicationPlanKey) {
        this.medicationPlanKey = medicationPlanKey == null ? null : medicationPlanKey.trim();
    }

    public String getDrugKey() {
        return drugKey;
    }

    public void setDrugKey(String drugKey) {
        this.drugKey = drugKey == null ? null : drugKey.trim();
    }
}