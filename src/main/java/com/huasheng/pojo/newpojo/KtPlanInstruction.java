package com.huasheng.pojo.newpojo;

import java.util.List;

public class KtPlanInstruction {
    private String planInstructionKey;

    private String medicationPlanKey;

    private Integer instructionId;

    private Integer medicationPlanId;

    private String theName;

    private String theCourse;

    private Integer theOrder;

    private Boolean reviewRequired;

    private String drugIds;
    private List<KtPlanInstructionMessage> ktPlanInstructionMessageList;

    public List<KtPlanInstructionMessage> getKtPlanInstructionMessageList() {
        return ktPlanInstructionMessageList;
    }

    public void setKtPlanInstructionMessageList(List<KtPlanInstructionMessage> ktPlanInstructionMessageList) {
        this.ktPlanInstructionMessageList = ktPlanInstructionMessageList;
    }

    public String getPlanInstructionKey() {
        return planInstructionKey;
    }

    public void setPlanInstructionKey(String planInstructionKey) {
        this.planInstructionKey = planInstructionKey == null ? null : planInstructionKey.trim();
    }

    public String getMedicationPlanKey() {
        return medicationPlanKey;
    }

    public void setMedicationPlanKey(String medicationPlanKey) {
        this.medicationPlanKey = medicationPlanKey == null ? null : medicationPlanKey.trim();
    }

    public Integer getInstructionId() {
        return instructionId;
    }

    public void setInstructionId(Integer instructionId) {
        this.instructionId = instructionId;
    }

    public Integer getMedicationPlanId() {
        return medicationPlanId;
    }

    public void setMedicationPlanId(Integer medicationPlanId) {
        this.medicationPlanId = medicationPlanId;
    }

    public String getTheName() {
        return theName;
    }

    public void setTheName(String theName) {
        this.theName = theName == null ? null : theName.trim();
    }

    public String getTheCourse() {
        return theCourse;
    }

    public void setTheCourse(String theCourse) {
        this.theCourse = theCourse == null ? null : theCourse.trim();
    }

    public Integer getTheOrder() {
        return theOrder;
    }

    public void setTheOrder(Integer theOrder) {
        this.theOrder = theOrder;
    }

    public Boolean getReviewRequired() {
        return reviewRequired;
    }

    public void setReviewRequired(Boolean reviewRequired) {
        this.reviewRequired = reviewRequired;
    }

    public String getDrugIds() {
        return drugIds;
    }

    public void setDrugIds(String drugIds) {
        this.drugIds = drugIds == null ? null : drugIds.trim();
    }
}