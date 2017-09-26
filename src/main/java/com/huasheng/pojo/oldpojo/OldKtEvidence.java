package com.huasheng.pojo.oldpojo;

public class OldKtEvidence {
    private String id;

    private Integer evidenceId;

    private Integer variantId;

    private String evidenceType;

    private Integer evidenceLevel;

    private String evidenceDirection;

    private String summary;

    private Integer doid;

    private String doidName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getEvidenceId() {
        return evidenceId;
    }

    public void setEvidenceId(Integer evidenceId) {
        this.evidenceId = evidenceId;
    }

    public Integer getVariantId() {
        return variantId;
    }

    public void setVariantId(Integer variantId) {
        this.variantId = variantId;
    }

    public String getEvidenceType() {
        return evidenceType;
    }

    public void setEvidenceType(String evidenceType) {
        this.evidenceType = evidenceType == null ? null : evidenceType.trim();
    }

    public Integer getEvidenceLevel() {
        return evidenceLevel;
    }

    public void setEvidenceLevel(Integer evidenceLevel) {
        this.evidenceLevel = evidenceLevel;
    }

    public String getEvidenceDirection() {
        return evidenceDirection;
    }

    public void setEvidenceDirection(String evidenceDirection) {
        this.evidenceDirection = evidenceDirection == null ? null : evidenceDirection.trim();
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }

    public Integer getDoid() {
        return doid;
    }

    public void setDoid(Integer doid) {
        this.doid = doid;
    }

    public String getDoidName() {
        return doidName;
    }

    public void setDoidName(String doidName) {
        this.doidName = doidName == null ? null : doidName.trim();
    }
}