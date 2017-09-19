package com.huasheng.pojo.newpojo;

public class KtPlanStudy {
    private String planStudyKey;

    private String medicationPlanKey;

    private Integer medicationPlanId;

    private Integer pmid;

    private String theStudy;

    private String theEfficacy;

    private String theEvidence;

    private String theComparator;

    public String getPlanStudyKey() {
        return planStudyKey;
    }

    public void setPlanStudyKey(String planStudyKey) {
        this.planStudyKey = planStudyKey == null ? null : planStudyKey.trim();
    }

    public String getMedicationPlanKey() {
        return medicationPlanKey;
    }

    public void setMedicationPlanKey(String medicationPlanKey) {
        this.medicationPlanKey = medicationPlanKey == null ? null : medicationPlanKey.trim();
    }

    public Integer getMedicationPlanId() {
        return medicationPlanId;
    }

    public void setMedicationPlanId(Integer medicationPlanId) {
        this.medicationPlanId = medicationPlanId;
    }

    public Integer getPmid() {
        return pmid;
    }

    public void setPmid(Integer pmid) {
        this.pmid = pmid;
    }

    public String getTheStudy() {
        return theStudy;
    }

    public void setTheStudy(String theStudy) {
        this.theStudy = theStudy == null ? null : theStudy.trim();
    }

    public String getTheEfficacy() {
        return theEfficacy;
    }

    public void setTheEfficacy(String theEfficacy) {
        this.theEfficacy = theEfficacy == null ? null : theEfficacy.trim();
    }

    public String getTheEvidence() {
        return theEvidence;
    }

    public void setTheEvidence(String theEvidence) {
        this.theEvidence = theEvidence == null ? null : theEvidence.trim();
    }

    public String getTheComparator() {
        return theComparator;
    }

    public void setTheComparator(String theComparator) {
        this.theComparator = theComparator == null ? null : theComparator.trim();
    }
}