package com.huasheng.pojo.newpojo;

public class KtEvidenceReference {
    private String evidenceReferenceKey;

    private String evidenceKey;

    private Integer evidenceId;

    private String refType;

    private Integer referenceId;

    private Integer externalId;

    public String getEvidenceReferenceKey() {
        return evidenceReferenceKey;
    }

    public void setEvidenceReferenceKey(String evidenceReferenceKey) {
        this.evidenceReferenceKey = evidenceReferenceKey == null ? null : evidenceReferenceKey.trim();
    }

    public String getEvidenceKey() {
        return evidenceKey;
    }

    public void setEvidenceKey(String evidenceKey) {
        this.evidenceKey = evidenceKey == null ? null : evidenceKey.trim();
    }

    public Integer getEvidenceId() {
        return evidenceId;
    }

    public void setEvidenceId(Integer evidenceId) {
        this.evidenceId = evidenceId;
    }

    public String getRefType() {
        return refType;
    }

    public void setRefType(String refType) {
        this.refType = refType == null ? null : refType.trim();
    }

    public Integer getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(Integer referenceId) {
        this.referenceId = referenceId;
    }

    public Integer getExternalId() {
        return externalId;
    }

    public void setExternalId(Integer externalId) {
        this.externalId = externalId;
    }
}