package com.huasheng.pojo.newpojo;

public class KtDrugAdverseReaction {
    private String drugKey;

    private String sideEffectKey;

    private Integer drugId;

    private String adressName;

    private String ferquency;

    private String placeboFrequency;

    public Integer getDrugId() {
        return drugId;
    }

    public void setDrugId(Integer drugId) {
        this.drugId = drugId;
    }

    public String getAdressName() {
        return adressName;
    }

    public void setAdressName(String adressName) {
        this.adressName = adressName == null ? null : adressName.trim();
    }

    public String getFerquency() {
        return ferquency;
    }

    public void setFerquency(String ferquency) {
        this.ferquency = ferquency == null ? null : ferquency.trim();
    }

    public String getPlaceboFrequency() {
        return placeboFrequency;
    }

    public void setPlaceboFrequency(String placeboFrequency) {
        this.placeboFrequency = placeboFrequency == null ? null : placeboFrequency.trim();
    }

    public String getDrugKey() {
        return drugKey;
    }

    public void setDrugKey(String drugKey) {
        this.drugKey = drugKey == null ? null : drugKey.trim();
    }

    public String getSideEffectKey() {
        return sideEffectKey;
    }

    public void setSideEffectKey(String sideEffectKey) {
        this.sideEffectKey = sideEffectKey == null ? null : sideEffectKey.trim();
    }
}