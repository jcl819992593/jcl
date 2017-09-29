package com.huasheng.pojo.knpojo;

import java.util.Date;

public class KnDetectionOrganization {
    private String id;

    private String detectionOrganizationName;

    private String detectionSample;

    private String detectionMethod;

    private Double detectionPrices;

    private String createBy;

    private Date createDate;

    private String updateBy;

    private Date updateDate;

    private String delFlag;

    private String remarks;

    private String detectionId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getDetectionOrganizationName() {
        return detectionOrganizationName;
    }

    public void setDetectionOrganizationName(String detectionOrganizationName) {
        this.detectionOrganizationName = detectionOrganizationName == null ? null : detectionOrganizationName.trim();
    }

    public String getDetectionSample() {
        return detectionSample;
    }

    public void setDetectionSample(String detectionSample) {
        this.detectionSample = detectionSample == null ? null : detectionSample.trim();
    }

    public String getDetectionMethod() {
        return detectionMethod;
    }

    public void setDetectionMethod(String detectionMethod) {
        this.detectionMethod = detectionMethod == null ? null : detectionMethod.trim();
    }

    public Double getDetectionPrices() {
        return detectionPrices;
    }

    public void setDetectionPrices(Double detectionPrices) {
        this.detectionPrices = detectionPrices;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public String getDetectionId() {
        return detectionId;
    }

    public void setDetectionId(String detectionId) {
        this.detectionId = detectionId == null ? null : detectionId.trim();
    }
}