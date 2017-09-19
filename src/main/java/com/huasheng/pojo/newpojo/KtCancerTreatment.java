package com.huasheng.pojo.newpojo;

public class KtCancerTreatment {
    private String cancerTreatmentKey;

    private String cancerKey;

    private Integer doid;

    private String treatment;

    public String getCancerTreatmentKey() {
        return cancerTreatmentKey;
    }

    public void setCancerTreatmentKey(String cancerTreatmentKey) {
        this.cancerTreatmentKey = cancerTreatmentKey == null ? null : cancerTreatmentKey.trim();
    }

    public String getCancerKey() {
        return cancerKey;
    }

    public void setCancerKey(String cancerKey) {
        this.cancerKey = cancerKey == null ? null : cancerKey.trim();
    }

    public Integer getDoid() {
        return doid;
    }

    public void setDoid(Integer doid) {
        this.doid = doid;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment == null ? null : treatment.trim();
    }
}