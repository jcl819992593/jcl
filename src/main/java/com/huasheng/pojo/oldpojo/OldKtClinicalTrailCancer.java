package com.huasheng.pojo.oldpojo;

public class OldKtClinicalTrailCancer {
    private String id;

    private Integer doid;

    private String clinicalTrailId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getDoid() {
        return doid;
    }

    public void setDoid(Integer doid) {
        this.doid = doid;
    }

    public String getClinicalTrailId() {
        return clinicalTrailId;
    }

    public void setClinicalTrailId(String clinicalTrailId) {
        this.clinicalTrailId = clinicalTrailId == null ? null : clinicalTrailId.trim();
    }
}