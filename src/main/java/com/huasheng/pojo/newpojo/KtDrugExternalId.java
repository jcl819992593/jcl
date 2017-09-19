package com.huasheng.pojo.newpojo;

public class KtDrugExternalId {
    private String externalIdKey;

    private String drugKey;

    private Integer drugId;

    private String externalIdSource;

    private String externalId;

    public String getExternalIdKey() {
        return externalIdKey;
    }

    public void setExternalIdKey(String externalIdKey) {
        this.externalIdKey = externalIdKey == null ? null : externalIdKey.trim();
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

    public String getExternalIdSource() {
        return externalIdSource;
    }

    public void setExternalIdSource(String externalIdSource) {
        this.externalIdSource = externalIdSource == null ? null : externalIdSource.trim();
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId == null ? null : externalId.trim();
    }

}