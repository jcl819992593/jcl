package com.huasheng.pojo.newpojo;

public class KtPlanAlias {
    private String planAliasKey;

    private String medicationPlanKey;

    private Integer medicationPlanId;

    private String aliasName;

    public String getPlanAliasKey() {
        return planAliasKey;
    }

    public void setPlanAliasKey(String planAliasKey) {
        this.planAliasKey = planAliasKey == null ? null : planAliasKey.trim();
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

    public String getAliasName() {
        return aliasName;
    }

    public void setAliasName(String aliasName) {
        this.aliasName = aliasName == null ? null : aliasName.trim();
    }
}