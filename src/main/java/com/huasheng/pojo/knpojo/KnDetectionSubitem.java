package com.huasheng.pojo.knpojo;

import java.util.Date;

public class KnDetectionSubitem {
    private String id;

    private String detectionSubitemName;

    private String geneId;

    private String detectContent;

    private String detectionSignificance;

    private String createBy;

    private Date createDate;

    private String updateBy;

    private Date updateDate;

    private String delFlag;

    private String remarks;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getDetectionSubitemName() {
        return detectionSubitemName;
    }

    public void setDetectionSubitemName(String detectionSubitemName) {
        this.detectionSubitemName = detectionSubitemName == null ? null : detectionSubitemName.trim();
    }

    public String getGeneId() {
        return geneId;
    }

    public void setGeneId(String geneId) {
        this.geneId = geneId == null ? null : geneId.trim();
    }

    public String getDetectContent() {
        return detectContent;
    }

    public void setDetectContent(String detectContent) {
        this.detectContent = detectContent == null ? null : detectContent.trim();
    }

    public String getDetectionSignificance() {
        return detectionSignificance;
    }

    public void setDetectionSignificance(String detectionSignificance) {
        this.detectionSignificance = detectionSignificance == null ? null : detectionSignificance.trim();
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
}