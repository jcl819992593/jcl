package com.huasheng.pojo.oldpojo;

public class OldKtClinicalTrailOutcome {
    private String id;

    private String clinicalTrailId;

    private String category;

    private String classification;

    private String title;

    private String resultGroup;

    private String unit;

    private String paramType;

    private Double paramValue;

    private String dispType;

    private Double dispValue;

    private Double dispMin;

    private Double dispMax;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getClinicalTrailId() {
        return clinicalTrailId;
    }

    public void setClinicalTrailId(String clinicalTrailId) {
        this.clinicalTrailId = clinicalTrailId == null ? null : clinicalTrailId.trim();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification == null ? null : classification.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getResultGroup() {
        return resultGroup;
    }

    public void setResultGroup(String resultGroup) {
        this.resultGroup = resultGroup == null ? null : resultGroup.trim();
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public String getParamType() {
        return paramType;
    }

    public void setParamType(String paramType) {
        this.paramType = paramType == null ? null : paramType.trim();
    }

    public Double getParamValue() {
        return paramValue;
    }

    public void setParamValue(Double paramValue) {
        this.paramValue = paramValue;
    }

    public String getDispType() {
        return dispType;
    }

    public void setDispType(String dispType) {
        this.dispType = dispType == null ? null : dispType.trim();
    }

    public Double getDispValue() {
        return dispValue;
    }

    public void setDispValue(Double dispValue) {
        this.dispValue = dispValue;
    }

    public Double getDispMin() {
        return dispMin;
    }

    public void setDispMin(Double dispMin) {
        this.dispMin = dispMin;
    }

    public Double getDispMax() {
        return dispMax;
    }

    public void setDispMax(Double dispMax) {
        this.dispMax = dispMax;
    }
}