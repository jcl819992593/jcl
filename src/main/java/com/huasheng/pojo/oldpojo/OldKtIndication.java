package com.huasheng.pojo.oldpojo;

public class OldKtIndication {
    private String id;

    private String stitchCompoundId;

    private String umlsConceptId;

    private String methodOfDetection;

    private String conceptName;

    private String meddraConceptType;

    private String umlsConceptIdOfMeddra;

    private String meddraConceptName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getStitchCompoundId() {
        return stitchCompoundId;
    }

    public void setStitchCompoundId(String stitchCompoundId) {
        this.stitchCompoundId = stitchCompoundId == null ? null : stitchCompoundId.trim();
    }

    public String getUmlsConceptId() {
        return umlsConceptId;
    }

    public void setUmlsConceptId(String umlsConceptId) {
        this.umlsConceptId = umlsConceptId == null ? null : umlsConceptId.trim();
    }

    public String getMethodOfDetection() {
        return methodOfDetection;
    }

    public void setMethodOfDetection(String methodOfDetection) {
        this.methodOfDetection = methodOfDetection == null ? null : methodOfDetection.trim();
    }

    public String getConceptName() {
        return conceptName;
    }

    public void setConceptName(String conceptName) {
        this.conceptName = conceptName == null ? null : conceptName.trim();
    }

    public String getMeddraConceptType() {
        return meddraConceptType;
    }

    public void setMeddraConceptType(String meddraConceptType) {
        this.meddraConceptType = meddraConceptType == null ? null : meddraConceptType.trim();
    }

    public String getUmlsConceptIdOfMeddra() {
        return umlsConceptIdOfMeddra;
    }

    public void setUmlsConceptIdOfMeddra(String umlsConceptIdOfMeddra) {
        this.umlsConceptIdOfMeddra = umlsConceptIdOfMeddra == null ? null : umlsConceptIdOfMeddra.trim();
    }

    public String getMeddraConceptName() {
        return meddraConceptName;
    }

    public void setMeddraConceptName(String meddraConceptName) {
        this.meddraConceptName = meddraConceptName == null ? null : meddraConceptName.trim();
    }
}