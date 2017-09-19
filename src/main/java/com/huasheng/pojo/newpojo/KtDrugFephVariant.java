package com.huasheng.pojo.newpojo;

public class KtDrugFephVariant {
    private Integer fephId;

    private Integer variantId;

    private String drugFephKey;

    private String variantKey;

    public Integer getFephId() {
        return fephId;
    }

    public void setFephId(Integer fephId) {
        this.fephId = fephId;
    }

    public Integer getVariantId() {
        return variantId;
    }

    public void setVariantId(Integer variantId) {
        this.variantId = variantId;
    }

    public String getDrugFephKey() {
        return drugFephKey;
    }

    public void setDrugFephKey(String drugFephKey) {
        this.drugFephKey = drugFephKey == null ? null : drugFephKey.trim();
    }

    public String getVariantKey() {
        return variantKey;
    }

    public void setVariantKey(String variantKey) {
        this.variantKey = variantKey == null ? null : variantKey.trim();
    }
}