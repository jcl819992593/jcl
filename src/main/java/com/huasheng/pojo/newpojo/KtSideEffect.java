package com.huasheng.pojo.newpojo;

public class KtSideEffect {
    private String sideEffectKey;

    private String umlsConceptId;

    private String meddraId;

    private String kindOfTerm;

    private String sideEffectName;

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

    public String getSideEffectKey() {
        return sideEffectKey;
    }

    public void setSideEffectKey(String sideEffectKey) {
        this.sideEffectKey = sideEffectKey == null ? null : sideEffectKey.trim();
    }

    public String getUmlsConceptId() {
        return umlsConceptId;
    }

    public void setUmlsConceptId(String umlsConceptId) {
        this.umlsConceptId = umlsConceptId == null ? null : umlsConceptId.trim();
    }

    public String getMeddraId() {
        return meddraId;
    }

    public void setMeddraId(String meddraId) {
        this.meddraId = meddraId == null ? null : meddraId.trim();
    }

    public String getKindOfTerm() {
        return kindOfTerm;
    }

    public void setKindOfTerm(String kindOfTerm) {
        this.kindOfTerm = kindOfTerm == null ? null : kindOfTerm.trim();
    }

    public String getSideEffectName() {
        return sideEffectName;
    }

    public void setSideEffectName(String sideEffectName) {
        this.sideEffectName = sideEffectName == null ? null : sideEffectName.trim();
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