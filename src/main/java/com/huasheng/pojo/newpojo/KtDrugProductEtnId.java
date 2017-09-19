package com.huasheng.pojo.newpojo;

public class KtDrugProductEtnId {
    private String etnIdKey;

    private String productKey;

    private String dpdId;

    private String ndcId;

    private String ndcProductCode;

    private String cfdaId;

    public String getEtnIdKey() {
        return etnIdKey;
    }

    public void setEtnIdKey(String etnIdKey) {
        this.etnIdKey = etnIdKey == null ? null : etnIdKey.trim();
    }

    public String getProductKey() {
        return productKey;
    }

    public void setProductKey(String productKey) {
        this.productKey = productKey == null ? null : productKey.trim();
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