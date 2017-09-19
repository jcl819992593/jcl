package com.huasheng.pojo.newpojo;

public class KtVariantMutationStatistic{
    private String cancerKey;

    private String variantKey;
    private Integer doid;

    private String mutationId;

    private Integer numOfSamples;

    public Integer getDoid() {
        return doid;
    }

    public void setDoid(Integer doid) {
        this.doid = doid;
    }

    public String getMutationId() {
        return mutationId;
    }

    public void setMutationId(String mutationId) {
        this.mutationId = mutationId == null ? null : mutationId.trim();
    }

    public Integer getNumOfSamples() {
        return numOfSamples;
    }

    public void setNumOfSamples(Integer numOfSamples) {
        this.numOfSamples = numOfSamples;
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