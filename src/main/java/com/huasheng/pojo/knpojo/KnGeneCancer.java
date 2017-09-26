package com.huasheng.pojo.knpojo;

import java.util.Date;

public class KnGeneCancer {
    private String id;

    private String createBy;

    private Date createDate;

    private String updateBy;

    private Date updateDate;

    private String delFlag;

    private String remarks;

    private String cancerId;

    private String geneId;

    private String mutationFrequency;

    private String proteinApplication;

    private String geneTest;

    private String geneTestShort;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
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

    public String getCancerId() {
        return cancerId;
    }

    public void setCancerId(String cancerId) {
        this.cancerId = cancerId == null ? null : cancerId.trim();
    }

    public String getGeneId() {
        return geneId;
    }

    public void setGeneId(String geneId) {
        this.geneId = geneId == null ? null : geneId.trim();
    }

    public String getMutationFrequency() {
        return mutationFrequency;
    }

    public void setMutationFrequency(String mutationFrequency) {
        this.mutationFrequency = mutationFrequency == null ? null : mutationFrequency.trim();
    }

    public String getProteinApplication() {
        return proteinApplication;
    }

    public void setProteinApplication(String proteinApplication) {
        this.proteinApplication = proteinApplication == null ? null : proteinApplication.trim();
    }

    public String getGeneTest() {
        return geneTest;
    }

    public void setGeneTest(String geneTest) {
        this.geneTest = geneTest == null ? null : geneTest.trim();
    }

    public String getGeneTestShort() {
        return geneTestShort;
    }

    public void setGeneTestShort(String geneTestShort) {
        this.geneTestShort = geneTestShort == null ? null : geneTestShort.trim();
    }
}