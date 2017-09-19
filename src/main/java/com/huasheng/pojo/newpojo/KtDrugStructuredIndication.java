package com.huasheng.pojo.newpojo;

public class KtDrugStructuredIndication {
    private String drugKey;

    private String indicationKey;

    private Integer drugId;

    public Integer getDrugId() {
        return drugId;
    }

    public void setDrugId(Integer drugId) {
        this.drugId = drugId;
    }

    public String getDrugKey() {
        return drugKey;
    }

    public void setDrugKey(String drugKey) {
        this.drugKey = drugKey == null ? null : drugKey.trim();
    }

    public String getIndicationKey() {
        return indicationKey;
    }

    public void setIndicationKey(String indicationKey) {
        this.indicationKey = indicationKey == null ? null : indicationKey.trim();
    }
}