package com.huasheng.pojo.newpojo;

public class KtKeggPathway {
    private String pathwayKey;

    private String keggId;

    private String pathwayName;

    private String keggLink;

    private String selleckLink;

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

    public String getPathwayKey() {
        return pathwayKey;
    }

    public void setPathwayKey(String pathwayKey) {
        this.pathwayKey = pathwayKey == null ? null : pathwayKey.trim();
    }

    public String getKeggId() {
        return keggId;
    }

    public void setKeggId(String keggId) {
        this.keggId = keggId == null ? null : keggId.trim();
    }

    public String getPathwayName() {
        return pathwayName;
    }

    public void setPathwayName(String pathwayName) {
        this.pathwayName = pathwayName == null ? null : pathwayName.trim();
    }

    public String getKeggLink() {
        return keggLink;
    }

    public void setKeggLink(String keggLink) {
        this.keggLink = keggLink == null ? null : keggLink.trim();
    }

    public String getSelleckLink() {
        return selleckLink;
    }

    public void setSelleckLink(String selleckLink) {
        this.selleckLink = selleckLink == null ? null : selleckLink.trim();
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