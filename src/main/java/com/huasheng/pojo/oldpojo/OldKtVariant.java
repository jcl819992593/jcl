package com.huasheng.pojo.oldpojo;

public class OldKtVariant {
    private String id;

    private Integer variantId;

    private Integer geneId;

    private Integer grch;

    private String genomicPosition;

    private String aaMutation;

    private String cdsMutation;

    private String variantType;

    private String cosmicId;

    private String dbsnpId;

    private String mutationEffect;

    private String oncogenicity;

    private String remark;

    private String mutationDetection;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getVariantId() {
        return variantId;
    }

    public void setVariantId(Integer variantId) {
        this.variantId = variantId;
    }

    public Integer getGeneId() {
        return geneId;
    }

    public void setGeneId(Integer geneId) {
        this.geneId = geneId;
    }

    public Integer getGrch() {
        return grch;
    }

    public void setGrch(Integer grch) {
        this.grch = grch;
    }

    public String getGenomicPosition() {
        return genomicPosition;
    }

    public void setGenomicPosition(String genomicPosition) {
        this.genomicPosition = genomicPosition == null ? null : genomicPosition.trim();
    }

    public String getAaMutation() {
        return aaMutation;
    }

    public void setAaMutation(String aaMutation) {
        this.aaMutation = aaMutation == null ? null : aaMutation.trim();
    }

    public String getCdsMutation() {
        return cdsMutation;
    }

    public void setCdsMutation(String cdsMutation) {
        this.cdsMutation = cdsMutation == null ? null : cdsMutation.trim();
    }

    public String getVariantType() {
        return variantType;
    }

    public void setVariantType(String variantType) {
        this.variantType = variantType == null ? null : variantType.trim();
    }

    public String getCosmicId() {
        return cosmicId;
    }

    public void setCosmicId(String cosmicId) {
        this.cosmicId = cosmicId == null ? null : cosmicId.trim();
    }

    public String getDbsnpId() {
        return dbsnpId;
    }

    public void setDbsnpId(String dbsnpId) {
        this.dbsnpId = dbsnpId == null ? null : dbsnpId.trim();
    }

    public String getMutationEffect() {
        return mutationEffect;
    }

    public void setMutationEffect(String mutationEffect) {
        this.mutationEffect = mutationEffect == null ? null : mutationEffect.trim();
    }

    public String getOncogenicity() {
        return oncogenicity;
    }

    public void setOncogenicity(String oncogenicity) {
        this.oncogenicity = oncogenicity == null ? null : oncogenicity.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getMutationDetection() {
        return mutationDetection;
    }

    public void setMutationDetection(String mutationDetection) {
        this.mutationDetection = mutationDetection == null ? null : mutationDetection.trim();
    }
}