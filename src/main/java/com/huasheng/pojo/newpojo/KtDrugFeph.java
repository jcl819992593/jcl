package com.huasheng.pojo.newpojo;

public class KtDrugFeph {
    private String drugFephKey;

    private String drugKey;

    private Integer drugId;

    private String fephType;

    private Byte requireGeneTest;

    private String detail;

    private String detectionSubitem;

    private String detectionItem;

    public String getDrugFephKey() {
        return drugFephKey;
    }

    public void setDrugFephKey(String drugFephKey) {
        this.drugFephKey = drugFephKey == null ? null : drugFephKey.trim();
    }

    public String getDrugKey() {
        return drugKey;
    }

    public void setDrugKey(String drugKey) {
        this.drugKey = drugKey == null ? null : drugKey.trim();
    }

    public Integer getDrugId() {
        return drugId;
    }

    public void setDrugId(Integer drugId) {
        this.drugId = drugId;
    }

    public String getFephType() {
        return fephType;
    }

    public void setFephType(String fephType) {
        this.fephType = fephType == null ? null : fephType.trim();
    }

    public Byte getRequireGeneTest() {
        return requireGeneTest;
    }

    public void setRequireGeneTest(Byte requireGeneTest) {
        this.requireGeneTest = requireGeneTest;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    public String getDetectionSubitem() {
        return detectionSubitem;
    }

    public void setDetectionSubitem(String detectionSubitem) {
        this.detectionSubitem = detectionSubitem == null ? null : detectionSubitem.trim();
    }

    public String getDetectionItem() {
        return detectionItem;
    }

    public void setDetectionItem(String detectionItem) {
        this.detectionItem = detectionItem == null ? null : detectionItem.trim();
    }
}