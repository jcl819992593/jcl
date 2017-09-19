package com.huasheng.pojo.newpojo;

public class KtIndication {
    private String indicationKey;

    private String stitchCompoundId;

    private String umlsConceptId;

    private String methodOfDetection;

    private String conceptName;

    private String meddraConceptType;

    private String umlsConceptIdOfMeddra;

    private String meddraConceptName;

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

    public String getIndicationKey() {
        return indicationKey;
    }

    public void setIndicationKey(String indicationKey) {
        this.indicationKey = indicationKey == null ? null : indicationKey.trim();
    }

    public String getStitchCompoundId() {
        return stitchCompoundId;
    }

    public void setStitchCompoundId(String stitchCompoundId) {
        this.stitchCompoundId = stitchCompoundId == null ? null : stitchCompoundId.trim();
    }

    public String getUmlsConceptId() {
        return umlsConceptId;
    }

    public void setUmlsConceptId(String umlsConceptId) {
        this.umlsConceptId = umlsConceptId == null ? null : umlsConceptId.trim();
    }

    public String getMethodOfDetection() {
        return methodOfDetection;
    }

    public void setMethodOfDetection(String methodOfDetection) {
        this.methodOfDetection = methodOfDetection == null ? null : methodOfDetection.trim();
    }

    public String getConceptName() {
        return conceptName;
    }

    public void setConceptName(String conceptName) {
        this.conceptName = conceptName == null ? null : conceptName.trim();
    }

    public String getMeddraConceptType() {
        return meddraConceptType;
    }

    public void setMeddraConceptType(String meddraConceptType) {
        this.meddraConceptType = meddraConceptType == null ? null : meddraConceptType.trim();
    }

    public String getUmlsConceptIdOfMeddra() {
        return umlsConceptIdOfMeddra;
    }

    public void setUmlsConceptIdOfMeddra(String umlsConceptIdOfMeddra) {
        this.umlsConceptIdOfMeddra = umlsConceptIdOfMeddra == null ? null : umlsConceptIdOfMeddra.trim();
    }

    public String getMeddraConceptName() {
        return meddraConceptName;
    }

    public void setMeddraConceptName(String meddraConceptName) {
        this.meddraConceptName = meddraConceptName == null ? null : meddraConceptName.trim();
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