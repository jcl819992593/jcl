package com.huasheng.pojo.oldpojo;

public class OldKtCancer {
    private String id;

    private Integer doid;

    private String name;

    private String parentId;

    private String englishName;

    private String definition;

    private String pathogenesis;

    private String clinicalfeatures;

    private String diagnostics;

    private String histopathology;

    private String picture;

    private Boolean isCommon;

    private String source;

    private String link;

    private Integer subtypeBase;

    private String incidence;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getDoid() {
        return doid;
    }

    public void setDoid(Integer doid) {
        this.doid = doid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName == null ? null : englishName.trim();
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition == null ? null : definition.trim();
    }

    public String getPathogenesis() {
        return pathogenesis;
    }

    public void setPathogenesis(String pathogenesis) {
        this.pathogenesis = pathogenesis == null ? null : pathogenesis.trim();
    }

    public String getClinicalfeatures() {
        return clinicalfeatures;
    }

    public void setClinicalfeatures(String clinicalfeatures) {
        this.clinicalfeatures = clinicalfeatures == null ? null : clinicalfeatures.trim();
    }

    public String getDiagnostics() {
        return diagnostics;
    }

    public void setDiagnostics(String diagnostics) {
        this.diagnostics = diagnostics == null ? null : diagnostics.trim();
    }

    public String getHistopathology() {
        return histopathology;
    }

    public void setHistopathology(String histopathology) {
        this.histopathology = histopathology == null ? null : histopathology.trim();
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    public Boolean getIsCommon() {
        return isCommon;
    }

    public void setIsCommon(Boolean isCommon) {
        this.isCommon = isCommon;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link == null ? null : link.trim();
    }

    public Integer getSubtypeBase() {
        return subtypeBase;
    }

    public void setSubtypeBase(Integer subtypeBase) {
        this.subtypeBase = subtypeBase;
    }

    public String getIncidence() {
        return incidence;
    }

    public void setIncidence(String incidence) {
        this.incidence = incidence == null ? null : incidence.trim();
    }
}