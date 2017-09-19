package com.huasheng.pojo.newpojo;

public class KtGene {
    private String geneKey;

    private Integer geneId;

    private String geneType;

    private String geneSymbol;

    private String geneFullName;

    private String entrezGeneSummary;

    private String cytogeneticBand;

    private Boolean hasCosmicMutations;

    private String cancerGene;

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

    public String getGeneKey() {
        return geneKey;
    }

    public void setGeneKey(String geneKey) {
        this.geneKey = geneKey == null ? null : geneKey.trim();
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

    @Override
    public String toString() {
        return "KtGene{" +
                "geneKey='" + geneKey + '\'' +
                ", geneId=" + geneId +
                ", geneType='" + geneType + '\'' +
                ", geneSymbol='" + geneSymbol + '\'' +
                ", geneFullName='" + geneFullName + '\'' +
                ", entrezGeneSummary='" + entrezGeneSummary + '\'' +
                ", cytogeneticBand='" + cytogeneticBand + '\'' +
                ", hasCosmicMutations=" + hasCosmicMutations +
                ", cancerGene='" + cancerGene + '\'' +
                ", createdAt=" + createdAt +
                ", createdWay=" + createdWay +
                ", createdByKey='" + createdByKey + '\'' +
                ", createdByName='" + createdByName + '\'' +
                ", checkState=" + checkState +
                ", checkReport='" + checkReport + '\'' +
                ", checkedByKey='" + checkedByKey + '\'' +
                ", checkedByName='" + checkedByName + '\'' +
                ", translateByKey='" + translateByKey + '\'' +
                ", translateByName='" + translateByName + '\'' +
                '}';
    }
}