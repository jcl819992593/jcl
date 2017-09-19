package com.huasheng.pojo.newpojo;

public class KtDrugInternationalBrand {
    private String internationalBrandKey;

    private String drugKey;

    private Integer drugId;

    private String internationalBrand;

    private String brandCompany;

    public String getInternationalBrandKey() {
        return internationalBrandKey;
    }

    public void setInternationalBrandKey(String internationalBrandKey) {
        this.internationalBrandKey = internationalBrandKey == null ? null : internationalBrandKey.trim();
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

    public String getInternationalBrand() {
        return internationalBrand;
    }

    public void setInternationalBrand(String internationalBrand) {
        this.internationalBrand = internationalBrand == null ? null : internationalBrand.trim();
    }

    public String getBrandCompany() {
        return brandCompany;
    }

    public void setBrandCompany(String brandCompany) {
        this.brandCompany = brandCompany == null ? null : brandCompany.trim();
    }
}