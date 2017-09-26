package com.huasheng.pojo.oldpojo;

import java.util.Date;

public class OldKtDrugProduct {
    private String id;

    private Integer drugId;

    private String name;

    private String tradeName;

    private String drugAttribute;

    private String dosageForm;

    private String route;

    private String dosageStrength;

    private Boolean isMedicalInsurance;

    private String referencePrice;

    private String labeller;

    private Boolean generic;

    private String source;

    private String country;

    private Date marketingStart;

    private Date marketingEnd;

    private String instruction;

    private String purchaseChannel;

    private String packageImage;

    private Boolean approved;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getDrugId() {
        return drugId;
    }

    public void setDrugId(Integer drugId) {
        this.drugId = drugId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route == null ? null : route.trim();
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

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
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

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction == null ? null : instruction.trim();
    }

    public String getPurchaseChannel() {
        return purchaseChannel;
    }

    public void setPurchaseChannel(String purchaseChannel) {
        this.purchaseChannel = purchaseChannel == null ? null : purchaseChannel.trim();
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
}