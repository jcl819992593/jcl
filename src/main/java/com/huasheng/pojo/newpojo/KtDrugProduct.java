package com.huasheng.pojo.newpojo;

import java.util.Date;

public class KtDrugProduct {
    private String productKey;

    private String drugKey;

    private Integer drugId;

    private String productName;

    private String tradeName;

    private String drugAttribute;

    private String dosageForm;

    private String productRoute;

    private String dosageStrength;

    private Boolean isMedicalInsurance;

    private String referencePrice;

    private String labeller;

    private Boolean generic;

    private String productSource;

    private String country;

    private Date marketingStart;

    private Date marketingEnd;

    private String packageImage;

    private Boolean approved;

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

    public String getProductKey() {
        return productKey;
    }

    public void setProductKey(String productKey) {
        this.productKey = productKey == null ? null : productKey.trim();
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

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getTradeName() {
        return tradeName;
    }

    public void setTradeName(String tradeName) {
        this.tradeName = tradeName == null ? null : tradeName.trim();
    }

    public String getDrugAttribute() {
        return drugAttribute;
    }

    public void setDrugAttribute(String drugAttribute) {
        this.drugAttribute = drugAttribute == null ? null : drugAttribute.trim();
    }

    public String getDosageForm() {
        return dosageForm;
    }

    public void setDosageForm(String dosageForm) {
        this.dosageForm = dosageForm == null ? null : dosageForm.trim();
    }

    public String getProductRoute() {
        return productRoute;
    }

    public void setProductRoute(String productRoute) {
        this.productRoute = productRoute == null ? null : productRoute.trim();
    }

    public String getDosageStrength() {
        return dosageStrength;
    }

    public void setDosageStrength(String dosageStrength) {
        this.dosageStrength = dosageStrength == null ? null : dosageStrength.trim();
    }

    public Boolean getIsMedicalInsurance() {
        return isMedicalInsurance;
    }

    public void setIsMedicalInsurance(Boolean isMedicalInsurance) {
        this.isMedicalInsurance = isMedicalInsurance;
    }

    public String getReferencePrice() {
        return referencePrice;
    }

    public void setReferencePrice(String referencePrice) {
        this.referencePrice = referencePrice == null ? null : referencePrice.trim();
    }

    public String getLabeller() {
        return labeller;
    }

    public void setLabeller(String labeller) {
        this.labeller = labeller == null ? null : labeller.trim();
    }

    public Boolean getGeneric() {
        return generic;
    }

    public void setGeneric(Boolean generic) {
        this.generic = generic;
    }

    public String getProductSource() {
        return productSource;
    }

    public void setProductSource(String productSource) {
        this.productSource = productSource == null ? null : productSource.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public Date getMarketingStart() {
        return marketingStart;
    }

    public void setMarketingStart(Date marketingStart) {
        this.marketingStart = marketingStart;
    }

    public Date getMarketingEnd() {
        return marketingEnd;
    }

    public void setMarketingEnd(Date marketingEnd) {
        this.marketingEnd = marketingEnd;
    }

    public String getPackageImage() {
        return packageImage;
    }

    public void setPackageImage(String packageImage) {
        this.packageImage = packageImage == null ? null : packageImage.trim();
    }

    public Boolean getApproved() {
        return approved;
    }

    public void setApproved(Boolean approved) {
        this.approved = approved;
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