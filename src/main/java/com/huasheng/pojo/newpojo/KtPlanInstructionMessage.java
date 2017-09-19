package com.huasheng.pojo.newpojo;

public class KtPlanInstructionMessage {
    private String planInstructionMessageKey;

    private String planInstructionKey;

    private Integer instructionId;

    private String theText;

    private String theRoute;

    private String theDuration;

    private String theFrequency;

    private String theDosage;

    private String drugIds;

    public String getPlanInstructionMessageKey() {
        return planInstructionMessageKey;
    }

    public void setPlanInstructionMessageKey(String planInstructionMessageKey) {
        this.planInstructionMessageKey = planInstructionMessageKey == null ? null : planInstructionMessageKey.trim();
    }

    public String getPlanInstructionKey() {
        return planInstructionKey;
    }

    public void setPlanInstructionKey(String planInstructionKey) {
        this.planInstructionKey = planInstructionKey == null ? null : planInstructionKey.trim();
    }

    public Integer getInstructionId() {
        return instructionId;
    }

    public void setInstructionId(Integer instructionId) {
        this.instructionId = instructionId;
    }

    public String getTheText() {
        return theText;
    }

    public void setTheText(String theText) {
        this.theText = theText == null ? null : theText.trim();
    }

    public String getTheRoute() {
        return theRoute;
    }

    public void setTheRoute(String theRoute) {
        this.theRoute = theRoute == null ? null : theRoute.trim();
    }

    public String getTheDuration() {
        return theDuration;
    }

    public void setTheDuration(String theDuration) {
        this.theDuration = theDuration == null ? null : theDuration.trim();
    }

    public String getTheFrequency() {
        return theFrequency;
    }

    public void setTheFrequency(String theFrequency) {
        this.theFrequency = theFrequency == null ? null : theFrequency.trim();
    }

    public String getTheDosage() {
        return theDosage;
    }

    public void setTheDosage(String theDosage) {
        this.theDosage = theDosage == null ? null : theDosage.trim();
    }

    public String getDrugIds() {
        return drugIds;
    }

    public void setDrugIds(String drugIds) {
        this.drugIds = drugIds == null ? null : drugIds.trim();
    }
}