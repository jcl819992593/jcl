package com.huasheng.pojo.oldpojo;

public class OldKtDrugProductEtnId {
    private String id;

    private String dpdId;

    private String ndcId;

    private String ndcProductCode;

    private String cfdaId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getDpdId() {
        return dpdId;
    }

    public void setDpdId(String dpdId) {
        this.dpdId = dpdId == null ? null : dpdId.trim();
    }

    public String getNdcId() {
        return ndcId;
    }

    public void setNdcId(String ndcId) {
        this.ndcId = ndcId == null ? null : ndcId.trim();
    }

    public String getNdcProductCode() {
        return ndcProductCode;
    }

    public void setNdcProductCode(String ndcProductCode) {
        this.ndcProductCode = ndcProductCode == null ? null : ndcProductCode.trim();
    }

    public String getCfdaId() {
        return cfdaId;
    }

    public void setCfdaId(String cfdaId) {
        this.cfdaId = cfdaId == null ? null : cfdaId.trim();
    }
}