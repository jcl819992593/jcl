package com.huasheng.pojo.oldpojo;

public class OldKtProtein {
    private String id;

    private String proteinId;

    private Integer geneId;

    private String entryName;

    private String proteinName;

    private Integer mass;

    private Integer length;

    private String functionDescription;

    private String tissueSpecificity;

    private Integer tissueSpecificityEvidenceId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getProteinId() {
        return proteinId;
    }

    public void setProteinId(String proteinId) {
        this.proteinId = proteinId == null ? null : proteinId.trim();
    }

    public Integer getGeneId() {
        return geneId;
    }

    public void setGeneId(Integer geneId) {
        this.geneId = geneId;
    }

    public String getEntryName() {
        return entryName;
    }

    public void setEntryName(String entryName) {
        this.entryName = entryName == null ? null : entryName.trim();
    }

    public String getProteinName() {
        return proteinName;
    }

    public void setProteinName(String proteinName) {
        this.proteinName = proteinName == null ? null : proteinName.trim();
    }

    public Integer getMass() {
        return mass;
    }

    public void setMass(Integer mass) {
        this.mass = mass;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public String getFunctionDescription() {
        return functionDescription;
    }

    public void setFunctionDescription(String functionDescription) {
        this.functionDescription = functionDescription == null ? null : functionDescription.trim();
    }

    public String getTissueSpecificity() {
        return tissueSpecificity;
    }

    public void setTissueSpecificity(String tissueSpecificity) {
        this.tissueSpecificity = tissueSpecificity == null ? null : tissueSpecificity.trim();
    }

    public Integer getTissueSpecificityEvidenceId() {
        return tissueSpecificityEvidenceId;
    }

    public void setTissueSpecificityEvidenceId(Integer tissueSpecificityEvidenceId) {
        this.tissueSpecificityEvidenceId = tissueSpecificityEvidenceId;
    }
}