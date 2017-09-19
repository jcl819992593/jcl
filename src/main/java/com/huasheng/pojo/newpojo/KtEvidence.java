package com.huasheng.pojo.newpojo;

public class KtEvidence {
    private String evidenceKey;

    private Integer evidenceId;

    private String cancerKey;

    private Integer doid;

    private String doidName;

    private String variantKey;

    private Integer variantId;

    private String evidenceType;

    private Integer evidenceLevel;

    private String evidenceDirection;

    private String summary;

    private Long createdAt;

    private Integer createdWay;

    private String createdByKey;

    private String createdByName;

    private Integer checkState;

    private String checkReport;

    private String checkedByKey;

    private String checkedByName;

    private String translateByKey;

    private String translateByName;

    public String getEvidenceKey() {
        return evidenceKey;
    }

    public void setEvidenceKey(String evidenceKey) {
        this.evidenceKey = evidenceKey == null ? null : evidenceKey.trim();
    }

    public Integer getEvidenceId() {
        return evidenceId;
    }

    public void setEvidenceId(Integer evidenceId) {
        this.evidenceId = evidenceId;
    }

    public String getCancerKey() {
        return cancerKey;
    }

    public void setCancerKey(String cancerKey) {
        this.cancerKey = cancerKey == null ? null : cancerKey.trim();
    }

    public Integer getDoid() {
        return doid;
    }

    public void setDoid(Integer doid) {
        this.doid = doid;
    }

    public String getDoidName() {
        return doidName;
    }

    public void setDoidName(String doidName) {
        this.doidName = doidName == null ? null : doidName.trim();
    }

    public String getVariantKey() {
        return variantKey;
    }

    public void setVariantKey(String variantKey) {
        this.variantKey = variantKey == null ? null : variantKey.trim();
    }

    public Integer getVariantId() {
        return variantId;
    }

    public void setVariantId(Integer variantId) {
        this.variantId = variantId;
    }

    public String getEvidenceType() {
        return evidenceType;
    }

    public void setEvidenceType(String evidenceType) {
        this.evidenceType = evidenceType == null ? null : evidenceType.trim();
    }

    public Integer getEvidenceLevel() {
        return evidenceLevel;
    }

    public void setEvidenceLevel(Integer evidenceLevel) {
        this.evidenceLevel = evidenceLevel;
    }

    public String getEvidenceDirection() {
        return evidenceDirection;
    }

    public void setEvidenceDirection(String evidenceDirection) {
        this.evidenceDirection = evidenceDirection == null ? null : evidenceDirection.trim();
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }

    public Long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getCreatedWay() {
        return createdWay;
    }

    public void setCreatedWay(Integer createdWay) {
        this.createdWay = createdWay;
    }

    public String getCreatedByKey() {
        return createdByKey;
    }

    public void setCreatedByKey(String createdByKey) {
        this.createdByKey = createdByKey == null ? null : createdByKey.trim();
    }

    public String getCreatedByName() {
        return createdByName;
    }

    public void setCreatedByName(String createdByName) {
        this.createdByName = createdByName == null ? null : createdByName.trim();
    }

    public Integer getCheckState() {
        return checkState;
    }

    public void setCheckState(Integer checkState) {
        this.checkState = checkState;
    }

    public String getCheckReport() {
        return checkReport;
    }

    public void setCheckReport(String checkReport) {
        this.checkReport = checkReport == null ? null : checkReport.trim();
    }

    public String getCheckedByKey() {
        return checkedByKey;
    }

    public void setCheckedByKey(String checkedByKey) {
        this.checkedByKey = checkedByKey == null ? null : checkedByKey.trim();
    }

    public String getCheckedByName() {
        return checkedByName;
    }

    public void setCheckedByName(String checkedByName) {
        this.checkedByName = checkedByName == null ? null : checkedByName.trim();
    }

    public String getTranslateByKey() {
        return translateByKey;
    }

    public void setTranslateByKey(String translateByKey) {
        this.translateByKey = translateByKey == null ? null : translateByKey.trim();
    }

    public String getTranslateByName() {
        return translateByName;
    }

    public void setTranslateByName(String translateByName) {
        this.translateByName = translateByName == null ? null : translateByName.trim();
    }
}