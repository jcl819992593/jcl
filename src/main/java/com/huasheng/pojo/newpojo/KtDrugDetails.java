package com.huasheng.pojo.newpojo;

public class KtDrugDetails {
    private String detailKey;

    private String drugKey;

    private Integer drugId;

    private String phenotype;

    private String twoFoldExample;

    private String phenotypeInfluence;

    private String recommendedDose;

    private String recommendedCategory;

    public String getDetailKey() {
        return detailKey;
    }

    public void setDetailKey(String detailKey) {
        this.detailKey = detailKey == null ? null : detailKey.trim();
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

    public String getPhenotype() {
        return phenotype;
    }

    public void setPhenotype(String phenotype) {
        this.phenotype = phenotype == null ? null : phenotype.trim();
    }

    public String getTwoFoldExample() {
        return twoFoldExample;
    }

    public void setTwoFoldExample(String twoFoldExample) {
        this.twoFoldExample = twoFoldExample == null ? null : twoFoldExample.trim();
    }

    public String getPhenotypeInfluence() {
        return phenotypeInfluence;
    }

    public void setPhenotypeInfluence(String phenotypeInfluence) {
        this.phenotypeInfluence = phenotypeInfluence == null ? null : phenotypeInfluence.trim();
    }

    public String getRecommendedDose() {
        return recommendedDose;
    }

    public void setRecommendedDose(String recommendedDose) {
        this.recommendedDose = recommendedDose == null ? null : recommendedDose.trim();
    }

    public String getRecommendedCategory() {
        return recommendedCategory;
    }

    public void setRecommendedCategory(String recommendedCategory) {
        this.recommendedCategory = recommendedCategory == null ? null : recommendedCategory.trim();
    }
}