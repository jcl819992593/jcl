package com.huasheng.pojo.newpojo;

public class KtPlanCancerAndDetails {
    private String medicationPlanKey;

    private String indicationKey;
    private Integer medicationPlanId;

    private String indicationId;

    private String indicationDetail;

    public Integer getMedicationPlanId() {
        return medicationPlanId;
    }

    public void setMedicationPlanId(Integer medicationPlanId) {
        this.medicationPlanId = medicationPlanId;
    }

    public String getIndicationId() {
        return indicationId;
    }

    public void setIndicationId(String indicationId) {
        this.indicationId = indicationId == null ? null : indicationId.trim();
    }

    public String getIndicationDetail() {
        return indicationDetail;
    }

    public void setIndicationDetail(String indicationDetail) {
        this.indicationDetail = indicationDetail == null ? null : indicationDetail.trim();
    }
    public String getMedicationPlanKey() {
        return medicationPlanKey;
    }

    public void setMedicationPlanKey(String medicationPlanKey) {
        this.medicationPlanKey = medicationPlanKey == null ? null : medicationPlanKey.trim();
    }

    public String getIndicationKey() {
        return indicationKey;
    }

    public void setIndicationKey(String indicationKey) {
        this.indicationKey = indicationKey == null ? null : indicationKey.trim();
    }
}