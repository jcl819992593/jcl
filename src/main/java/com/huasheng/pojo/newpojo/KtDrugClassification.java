package com.huasheng.pojo.newpojo;

public class KtDrugClassification {
    private String drugKey;

    private String chemicalCategoryKey;

    private Integer drugId;

    private String description;

    public Integer getDrugId() {
        return drugId;
    }

    public void setDrugId(Integer drugId) {
        this.drugId = drugId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getDrugKey() {
        return drugKey;
    }

    public void setDrugKey(String drugKey) {
        this.drugKey = drugKey == null ? null : drugKey.trim();
    }

    public String getChemicalCategoryKey() {
        return chemicalCategoryKey;
    }

    public void setChemicalCategoryKey(String chemicalCategoryKey) {
        this.chemicalCategoryKey = chemicalCategoryKey == null ? null : chemicalCategoryKey.trim();
    }
}