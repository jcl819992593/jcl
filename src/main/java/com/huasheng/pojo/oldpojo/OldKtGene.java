package com.huasheng.pojo.oldpojo;

public class OldKtGene {
    private String id;

    private Integer geneId;

    private String geneType;

    private String geneSymbol;

    private String geneFullName;

    private String entrezGeneSummary;

    private String cytogeneticBand;

    private Boolean hasCosmicMutations;

    private String cancerGene;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getGeneId() {
        return geneId;
    }

    public void setGeneId(Integer geneId) {
        this.geneId = geneId;
    }

    public String getGeneType() {
        return geneType;
    }

    public void setGeneType(String geneType) {
        this.geneType = geneType == null ? null : geneType.trim();
    }

    public String getGeneSymbol() {
        return geneSymbol;
    }

    public void setGeneSymbol(String geneSymbol) {
        this.geneSymbol = geneSymbol == null ? null : geneSymbol.trim();
    }

    public String getGeneFullName() {
        return geneFullName;
    }

    public void setGeneFullName(String geneFullName) {
        this.geneFullName = geneFullName == null ? null : geneFullName.trim();
    }

    public String getEntrezGeneSummary() {
        return entrezGeneSummary;
    }

    public void setEntrezGeneSummary(String entrezGeneSummary) {
        this.entrezGeneSummary = entrezGeneSummary == null ? null : entrezGeneSummary.trim();
    }

    public String getCytogeneticBand() {
        return cytogeneticBand;
    }

    public void setCytogeneticBand(String cytogeneticBand) {
        this.cytogeneticBand = cytogeneticBand == null ? null : cytogeneticBand.trim();
    }

    public Boolean getHasCosmicMutations() {
        return hasCosmicMutations;
    }

    public void setHasCosmicMutations(Boolean hasCosmicMutations) {
        this.hasCosmicMutations = hasCosmicMutations;
    }

    public String getCancerGene() {
        return cancerGene;
    }

    public void setCancerGene(String cancerGene) {
        this.cancerGene = cancerGene == null ? null : cancerGene.trim();
    }
}