package com.huasheng.pojo.newpojo;

public class KtChemicalCategorySynonym {
    private String categorySynonymKey;

    private String chemicalCategoryKey;

    private String chemontId;

    private String categorySynonym;

    public String getCategorySynonymKey() {
        return categorySynonymKey;
    }

    public void setCategorySynonymKey(String categorySynonymKey) {
        this.categorySynonymKey = categorySynonymKey == null ? null : categorySynonymKey.trim();
    }

    public String getChemicalCategoryKey() {
        return chemicalCategoryKey;
    }

    public void setChemicalCategoryKey(String chemicalCategoryKey) {
        this.chemicalCategoryKey = chemicalCategoryKey == null ? null : chemicalCategoryKey.trim();
    }

    public String getChemontId() {
        return chemontId;
    }

    public void setChemontId(String chemontId) {
        this.chemontId = chemontId == null ? null : chemontId.trim();
    }

    public String getCategorySynonym() {
        return categorySynonym;
    }

    public void setCategorySynonym(String categorySynonym) {
        this.categorySynonym = categorySynonym == null ? null : categorySynonym.trim();
    }
}