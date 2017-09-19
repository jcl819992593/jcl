package com.huasheng.pojo.newpojo;

public class KtSyndromeGeneCancer {
    private String syndromeKey;

    private String enName;

    private String cnName;

    private String shortName;

    private String theDescription;

    private String theSource;

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

    public String getSyndromeKey() {
        return syndromeKey;
    }

    public void setSyndromeKey(String syndromeKey) {
        this.syndromeKey = syndromeKey == null ? null : syndromeKey.trim();
    }

    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName == null ? null : enName.trim();
    }

    public String getCnName() {
        return cnName;
    }

    public void setCnName(String cnName) {
        this.cnName = cnName == null ? null : cnName.trim();
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName == null ? null : shortName.trim();
    }

    public String getTheDescription() {
        return theDescription;
    }

    public void setTheDescription(String theDescription) {
        this.theDescription = theDescription == null ? null : theDescription.trim();
    }

    public String getTheSource() {
        return theSource;
    }

    public void setTheSource(String theSource) {
        this.theSource = theSource == null ? null : theSource.trim();
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