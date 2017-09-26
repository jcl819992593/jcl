package com.huasheng.pojo.oldpojo;

public class OldKtDrugSynonym {
    private String id;

    private Integer drugId;

    private String drugSynonym;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getDrugId() {
        return drugId;
    }

    public void setDrugId(Integer drugId) {
        this.drugId = drugId;
    }

    public String getDrugSynonym() {
        return drugSynonym;
    }

    public void setDrugSynonym(String drugSynonym) {
        this.drugSynonym = drugSynonym == null ? null : drugSynonym.trim();
    }
}