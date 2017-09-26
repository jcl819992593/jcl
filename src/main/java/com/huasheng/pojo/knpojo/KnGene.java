package com.huasheng.pojo.knpojo;

import java.util.Date;

public class KnGene {
    private String id;

    private String createBy;

    private Date createDate;

    private String updateBy;

    private Date updateDate;

    private String delFlag;

    private String remarks;

    private String name;

    private String position;

    private String geneType;

    private String mutationFrequency;

    private String codedProtein;

    private String proteinApplication;

    private String description;

    private String aliasName;

    private String picture;

    private String tumorPhenotype;

    private String tumorPhenotypeNotes;

    private String phenotype;

    private String phenotypeNotes;

    private String geneMinId;

    private String inheritanceMode;

    private String modeGrade;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public String getGeneType() {
        return geneType;
    }

    public void setGeneType(String geneType) {
        this.geneType = geneType == null ? null : geneType.trim();
    }

    public String getMutationFrequency() {
        return mutationFrequency;
    }

    public void setMutationFrequency(String mutationFrequency) {
        this.mutationFrequency = mutationFrequency == null ? null : mutationFrequency.trim();
    }

    public String getCodedProtein() {
        return codedProtein;
    }

    public void setCodedProtein(String codedProtein) {
        this.codedProtein = codedProtein == null ? null : codedProtein.trim();
    }

    public String getProteinApplication() {
        return proteinApplication;
    }

    public void setProteinApplication(String proteinApplication) {
        this.proteinApplication = proteinApplication == null ? null : proteinApplication.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getAliasName() {
        return aliasName;
    }

    public void setAliasName(String aliasName) {
        this.aliasName = aliasName == null ? null : aliasName.trim();
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    public String getTumorPhenotype() {
        return tumorPhenotype;
    }

    public void setTumorPhenotype(String tumorPhenotype) {
        this.tumorPhenotype = tumorPhenotype == null ? null : tumorPhenotype.trim();
    }

    public String getTumorPhenotypeNotes() {
        return tumorPhenotypeNotes;
    }

    public void setTumorPhenotypeNotes(String tumorPhenotypeNotes) {
        this.tumorPhenotypeNotes = tumorPhenotypeNotes == null ? null : tumorPhenotypeNotes.trim();
    }

    public String getPhenotype() {
        return phenotype;
    }

    public void setPhenotype(String phenotype) {
        this.phenotype = phenotype == null ? null : phenotype.trim();
    }

    public String getPhenotypeNotes() {
        return phenotypeNotes;
    }

    public void setPhenotypeNotes(String phenotypeNotes) {
        this.phenotypeNotes = phenotypeNotes == null ? null : phenotypeNotes.trim();
    }

    public String getGeneMinId() {
        return geneMinId;
    }

    public void setGeneMinId(String geneMinId) {
        this.geneMinId = geneMinId == null ? null : geneMinId.trim();
    }

    public String getInheritanceMode() {
        return inheritanceMode;
    }

    public void setInheritanceMode(String inheritanceMode) {
        this.inheritanceMode = inheritanceMode == null ? null : inheritanceMode.trim();
    }

    public String getModeGrade() {
        return modeGrade;
    }

    public void setModeGrade(String modeGrade) {
        this.modeGrade = modeGrade == null ? null : modeGrade.trim();
    }
}