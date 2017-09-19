package com.huasheng.pojo.newpojo;

public class KtPlanDrugMessage {
    private String planDrugMessageKey;

    private String medicationPlanKey;

    private Integer medicationPlanId;

    private String drugName;

    private String theMethod;

    private Integer theFrequency;

    private Integer theCycle;

    private String theDay;

    private Integer totalCycle;

    private String doseMax;

    private String doseMin;

    private String doseUnit;

    private Integer infusionTimeMax;

    private Integer infusionTimeMin;

    private Integer cycleMax;

    private Integer cycleMin;

    public String getPlanDrugMessageKey() {
        return planDrugMessageKey;
    }

    public void setPlanDrugMessageKey(String planDrugMessageKey) {
        this.planDrugMessageKey = planDrugMessageKey == null ? null : planDrugMessageKey.trim();
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

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName == null ? null : drugName.trim();
    }

    public String getTheMethod() {
        return theMethod;
    }

    public void setTheMethod(String theMethod) {
        this.theMethod = theMethod == null ? null : theMethod.trim();
    }

    public Integer getTheFrequency() {
        return theFrequency;
    }

    public void setTheFrequency(Integer theFrequency) {
        this.theFrequency = theFrequency;
    }

    public Integer getTheCycle() {
        return theCycle;
    }

    public void setTheCycle(Integer theCycle) {
        this.theCycle = theCycle;
    }

    public String getTheDay() {
        return theDay;
    }

    public void setTheDay(String theDay) {
        this.theDay = theDay == null ? null : theDay.trim();
    }

    public Integer getTotalCycle() {
        return totalCycle;
    }

    public void setTotalCycle(Integer totalCycle) {
        this.totalCycle = totalCycle;
    }

    public String getDoseMax() {
        return doseMax;
    }

    public void setDoseMax(String doseMax) {
        this.doseMax = doseMax == null ? null : doseMax.trim();
    }

    public String getDoseMin() {
        return doseMin;
    }

    public void setDoseMin(String doseMin) {
        this.doseMin = doseMin == null ? null : doseMin.trim();
    }

    public String getDoseUnit() {
        return doseUnit;
    }

    public void setDoseUnit(String doseUnit) {
        this.doseUnit = doseUnit == null ? null : doseUnit.trim();
    }

    public Integer getInfusionTimeMax() {
        return infusionTimeMax;
    }

    public void setInfusionTimeMax(Integer infusionTimeMax) {
        this.infusionTimeMax = infusionTimeMax;
    }

    public Integer getInfusionTimeMin() {
        return infusionTimeMin;
    }

    public void setInfusionTimeMin(Integer infusionTimeMin) {
        this.infusionTimeMin = infusionTimeMin;
    }

    public Integer getCycleMax() {
        return cycleMax;
    }

    public void setCycleMax(Integer cycleMax) {
        this.cycleMax = cycleMax;
    }

    public Integer getCycleMin() {
        return cycleMin;
    }

    public void setCycleMin(Integer cycleMin) {
        this.cycleMin = cycleMin;
    }
}