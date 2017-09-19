package com.huasheng.pojo.newpojo;

public class KtGeneDetection {
    private String detectionKey;

    private String detectionName;

    private String detectionContent;

    private String detectionSignificance;

    private Integer detectionPrice;

    private Integer detectionBrokerage;

    private String detectionDescription;

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

    public String getDetectionKey() {
        return detectionKey;
    }

    public void setDetectionKey(String detectionKey) {
        this.detectionKey = detectionKey == null ? null : detectionKey.trim();
    }

    public String getDetectionName() {
        return detectionName;
    }

    public void setDetectionName(String detectionName) {
        this.detectionName = detectionName == null ? null : detectionName.trim();
    }

    public String getDetectionContent() {
        return detectionContent;
    }

    public void setDetectionContent(String detectionContent) {
        this.detectionContent = detectionContent == null ? null : detectionContent.trim();
    }

    public String getDetectionSignificance() {
        return detectionSignificance;
    }

    public void setDetectionSignificance(String detectionSignificance) {
        this.detectionSignificance = detectionSignificance == null ? null : detectionSignificance.trim();
    }

    public Integer getDetectionPrice() {
        return detectionPrice;
    }

    public void setDetectionPrice(Integer detectionPrice) {
        this.detectionPrice = detectionPrice;
    }

    public Integer getDetectionBrokerage() {
        return detectionBrokerage;
    }

    public void setDetectionBrokerage(Integer detectionBrokerage) {
        this.detectionBrokerage = detectionBrokerage;
    }

    public String getDetectionDescription() {
        return detectionDescription;
    }

    public void setDetectionDescription(String detectionDescription) {
        this.detectionDescription = detectionDescription == null ? null : detectionDescription.trim();
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