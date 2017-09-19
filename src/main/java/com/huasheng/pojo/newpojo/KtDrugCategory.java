package com.huasheng.pojo.newpojo;

public class KtDrugCategory {
    private Integer drugId;

    private String meshId;

    private String categoryName;

    private String drugKey;

    private String meshCategoryKey;

    public Integer getDrugId() {
        return drugId;
    }

    public void setDrugId(Integer drugId) {
        this.drugId = drugId;
    }

    public String getMeshId() {
        return meshId;
    }

    public void setMeshId(String meshId) {
        this.meshId = meshId == null ? null : meshId.trim();
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    public String getDrugKey() {
        return drugKey;
    }

    public void setDrugKey(String drugKey) {
        this.drugKey = drugKey == null ? null : drugKey.trim();
    }

    public String getMeshCategoryKey() {
        return meshCategoryKey;
    }

    public void setMeshCategoryKey(String meshCategoryKey) {
        this.meshCategoryKey = meshCategoryKey == null ? null : meshCategoryKey.trim();
    }

    @Override
    public String toString() {
        return "KtDrugCategory{" +
                "categoryKey='" + meshCategoryKey + '\'' +
                ", drugKey='" + drugKey + '\'' +
                ", drugId=" + drugId +
                ", meshId='" + meshId + '\'' +
                ", categoryName='" + categoryName + '\'' +
                '}';
    }
}