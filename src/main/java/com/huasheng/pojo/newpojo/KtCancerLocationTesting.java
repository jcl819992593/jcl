package com.huasheng.pojo.newpojo;

public class KtCancerLocationTesting {
    private String cancerKey;
    private String variantKey;
    private Integer doid;
    private Integer variantId;
    private Integer geneTestingId;

    public Integer getDoid() {
        return doid;
    }

    public void setDoid(Integer doid) {
        this.doid = doid;
    }

    public Integer getVariantId() {
        return variantId;
    }

    public void setVariantId(Integer variantId) {
        this.variantId = variantId;
    }

    public Integer getGeneTestingId() {
        return geneTestingId;
    }

    public void setGeneTestingId(Integer geneTestingId) {
        this.geneTestingId = geneTestingId;
    }

    public String getCancerKey() {
        return cancerKey;
    }

    public void setCancerKey(String cancerKey) {
        this.cancerKey = cancerKey == null ? null : cancerKey.trim();
    }

    public String getVariantKey() {
        return variantKey;
    }

    public void setVariantKey(String variantKey) {
        this.variantKey = variantKey == null ? null : variantKey.trim();
    }

}