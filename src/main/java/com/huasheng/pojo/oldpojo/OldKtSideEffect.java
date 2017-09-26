package com.huasheng.pojo.oldpojo;

public class OldKtSideEffect {
    private String id;

    private String umlsConceptId;

    private String meddraId;

    private String kindOfTerm;

    private String sideEffectName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUmlsConceptId() {
        return umlsConceptId;
    }

    public void setUmlsConceptId(String umlsConceptId) {
        this.umlsConceptId = umlsConceptId == null ? null : umlsConceptId.trim();
    }

    public String getMeddraId() {
        return meddraId;
    }

    public void setMeddraId(String meddraId) {
        this.meddraId = meddraId == null ? null : meddraId.trim();
    }

    public String getKindOfTerm() {
        return kindOfTerm;
    }

    public void setKindOfTerm(String kindOfTerm) {
        this.kindOfTerm = kindOfTerm == null ? null : kindOfTerm.trim();
    }

    public String getSideEffectName() {
        return sideEffectName;
    }

    public void setSideEffectName(String sideEffectName) {
        this.sideEffectName = sideEffectName == null ? null : sideEffectName.trim();
    }
}