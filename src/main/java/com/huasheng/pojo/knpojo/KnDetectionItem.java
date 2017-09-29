package com.huasheng.pojo.knpojo;

import java.util.Date;
import java.util.List;

public class KnDetectionItem {
    private String id;

    private String detectionItemName;

    private String subitemId;

    private String cancerId;

    private String drugId;

    private String createBy;

    private Date createDate;

    private String updateBy;

    private Date updateDate;

    private String delFlag;

    private String remarks;
    private List<KnDetectionSubitem> knDetectionSubitemList;

    public List<KnDetectionSubitem> getKnDetectionSubitemList() {
        return knDetectionSubitemList;
    }
    public void setKnDetectionSubitemList(List<KnDetectionSubitem> knDetectionSubitemList) {
        this.knDetectionSubitemList = knDetectionSubitemList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getDetectionItemName() {
        return detectionItemName;
    }

    public void setDetectionItemName(String detectionItemName) {
        this.detectionItemName = detectionItemName == null ? null : detectionItemName.trim();
    }

    public String getSubitemId() {
        return subitemId;
    }

    public void setSubitemId(String subitemId) {
        this.subitemId = subitemId == null ? null : subitemId.trim();
    }

    public String getCancerId() {
        return cancerId;
    }

    public void setCancerId(String cancerId) {
        this.cancerId = cancerId == null ? null : cancerId.trim();
    }

    public String getDrugId() {
        return drugId;
    }

    public void setDrugId(String drugId) {
        this.drugId = drugId == null ? null : drugId.trim();
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