package com.huasheng.pojo.newpojo;

public class KtCancerPhenotype {
    private String cancerPhenotypeKey;

    private String cancerKey;

    private Integer doid;

    private String nameEn;

    private String nameCn;

    private String mimId;

    private String remark;

    public String getCancerPhenotypeKey() {
        return cancerPhenotypeKey;
    }

    public void setCancerPhenotypeKey(String cancerPhenotypeKey) {
        this.cancerPhenotypeKey = cancerPhenotypeKey == null ? null : cancerPhenotypeKey.trim();
    }

    public String getCancerKey() {
        return cancerKey;
    }

    public void setCancerKey(String cancerKey) {
        this.cancerKey = cancerKey == null ? null : cancerKey.trim();
    }

    public Integer getDoid() {
        return doid;
    }

    public void setDoid(Integer doid) {
        this.doid = doid;
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn == null ? null : nameEn.trim();
    }

    public String getNameCn() {
        return nameCn;
    }

    public void setNameCn(String nameCn) {
        this.nameCn = nameCn == null ? null : nameCn.trim();
    }

    public String getMimId() {
        return mimId;
    }

    public void setMimId(String mimId) {
        this.mimId = mimId == null ? null : mimId.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}