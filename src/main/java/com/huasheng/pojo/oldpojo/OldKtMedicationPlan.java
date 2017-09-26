package com.huasheng.pojo.oldpojo;

public class OldKtMedicationPlan {
    private String id;

    private Integer medicinePlanId;

    private String regimenName;

    private String programNameC;

    private String diseaseName;

    private String chemotherapyType;

    private String chemotherapyName;

    private String regimenDescription;

    private String approvalAgency;

    private String approvalLink;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getMedicinePlanId() {
        return medicinePlanId;
    }

    public void setMedicinePlanId(Integer medicinePlanId) {
        this.medicinePlanId = medicinePlanId;
    }

    public String getRegimenName() {
        return regimenName;
    }

    public void setRegimenName(String regimenName) {
        this.regimenName = regimenName == null ? null : regimenName.trim();
    }

    public String getProgramNameC() {
        return programNameC;
    }

    public void setProgramNameC(String programNameC) {
        this.programNameC = programNameC == null ? null : programNameC.trim();
    }

    public String getDiseaseName() {
        return diseaseName;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName == null ? null : diseaseName.trim();
    }

    public String getChemotherapyType() {
        return chemotherapyType;
    }

    public void setChemotherapyType(String chemotherapyType) {
        this.chemotherapyType = chemotherapyType == null ? null : chemotherapyType.trim();
    }

    public String getChemotherapyName() {
        return chemotherapyName;
    }

    public void setChemotherapyName(String chemotherapyName) {
        this.chemotherapyName = chemotherapyName == null ? null : chemotherapyName.trim();
    }

    public String getRegimenDescription() {
        return regimenDescription;
    }

    public void setRegimenDescription(String regimenDescription) {
        this.regimenDescription = regimenDescription == null ? null : regimenDescription.trim();
    }

    public String getApprovalAgency() {
        return approvalAgency;
    }

    public void setApprovalAgency(String approvalAgency) {
        this.approvalAgency = approvalAgency == null ? null : approvalAgency.trim();
    }

    public String getApprovalLink() {
        return approvalLink;
    }

    public void setApprovalLink(String approvalLink) {
        this.approvalLink = approvalLink == null ? null : approvalLink.trim();
    }
}