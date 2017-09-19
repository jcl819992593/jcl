package com.huasheng.pojo.newpojo;

public class KtDrugSynonym {
    private String synonymKey;

    private String drugKey;

    private Integer drugId;

    private String drugSynonym;

    public String getSynonymKey() {
        return synonymKey;
    }

    public void setSynonymKey(String synonymKey) {
        this.synonymKey = synonymKey == null ? null : synonymKey.trim();
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

    public String getDrugSynonym() {
        return drugSynonym;
    }

    public void setDrugSynonym(String drugSynonym) {
        this.drugSynonym = drugSynonym == null ? null : drugSynonym.trim();
    }

}