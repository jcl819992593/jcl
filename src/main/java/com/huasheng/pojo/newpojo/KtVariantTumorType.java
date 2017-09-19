package com.huasheng.pojo.newpojo;

public class KtVariantTumorType {
    private String typeKey;

    private String variantKey;

    private Integer variantId;

    private String site1;

    private String site2;

    private String site3;

    private String site4;

    private String hist1;

    private String hist2;

    private String hist3;

    private String hist4;

    private KtVariantTumorTypeDoid ktVariantTumorTypeDoid;

    public String getTypeKey() {
        return typeKey;
    }

    public void setTypeKey(String typeKey) {
        this.typeKey = typeKey == null ? null : typeKey.trim();
    }

    public String getVariantKey() {
        return variantKey;
    }

    public void setVariantKey(String variantKey) {
        this.variantKey = variantKey == null ? null : variantKey.trim();
    }

    public Integer getVariantId() {
        return variantId;
    }

    public void setVariantId(Integer variantId) {
        this.variantId = variantId;
    }

    public String getSite1() {
        return site1;
    }

    public void setSite1(String site1) {
        this.site1 = site1 == null ? null : site1.trim();
    }

    public String getSite2() {
        return site2;
    }

    public void setSite2(String site2) {
        this.site2 = site2 == null ? null : site2.trim();
    }

    public String getSite3() {
        return site3;
    }

    public void setSite3(String site3) {
        this.site3 = site3 == null ? null : site3.trim();
    }

    public String getSite4() {
        return site4;
    }

    public void setSite4(String site4) {
        this.site4 = site4 == null ? null : site4.trim();
    }

    public String getHist1() {
        return hist1;
    }

    public void setHist1(String hist1) {
        this.hist1 = hist1 == null ? null : hist1.trim();
    }

    public String getHist2() {
        return hist2;
    }

    public void setHist2(String hist2) {
        this.hist2 = hist2 == null ? null : hist2.trim();
    }

    public String getHist3() {
        return hist3;
    }

    public void setHist3(String hist3) {
        this.hist3 = hist3 == null ? null : hist3.trim();
    }

    public String getHist4() {
        return hist4;
    }

    public void setHist4(String hist4) {
        this.hist4 = hist4 == null ? null : hist4.trim();
    }

    public KtVariantTumorTypeDoid getKtVariantTumorTypeDoid() {
        return ktVariantTumorTypeDoid;
    }

    public void setKtVariantTumorTypeDoid(KtVariantTumorTypeDoid ktVariantTumorTypeDoid) {
        this.ktVariantTumorTypeDoid = ktVariantTumorTypeDoid;
    }
}