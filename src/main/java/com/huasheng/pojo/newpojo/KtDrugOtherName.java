package com.huasheng.pojo.newpojo;

public class KtDrugOtherName {
    private String otherNameKey;

    private String drugKey;

    private Integer drugId;

    private String otherName;

    public String getOtherNameKey() {
        return otherNameKey;
    }

    public void setOtherNameKey(String otherNameKey) {
        this.otherNameKey = otherNameKey == null ? null : otherNameKey.trim();
    }

    public String getDrugKey() {
        return drugKey;
    }

    public void setDrugKey(String drugKey) {
        this.drugKey = drugKey == null ? null : drugKey.trim();
    }

    public Integer getDrugId() {
        return drugId;
    }

    public void setDrugId(Integer drugId) {
        this.drugId = drugId;
    }

    public String getOtherName() {
        return otherName;
    }

    public void setOtherName(String otherName) {
        this.otherName = otherName == null ? null : otherName.trim();
    }
}