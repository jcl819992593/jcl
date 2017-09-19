package com.huasheng.pojo.newpojo;

public class KtDrugActionTarget {
    private String actionTargetKey;

    private String drugKey;

    private Integer drugId;

    private String actionTarget;

    public String getActionTargetKey() {
        return actionTargetKey;
    }

    public void setActionTargetKey(String actionTargetKey) {
        this.actionTargetKey = actionTargetKey == null ? null : actionTargetKey.trim();
    }

    public String getDrugKey() {
        return drugKey;
    }

    public void setDrugKey(String drugKey) {
        this.drugKey = drugKey == null ? null : drugKey.trim();
    }

    public Integer getDrugId() {
        return drugId;
    }

    public void setDrugId(Integer drugId) {
        this.drugId = drugId;
    }

    public String getActionTarget() {
        return actionTarget;
    }

    public void setActionTarget(String actionTarget) {
        this.actionTarget = actionTarget == null ? null : actionTarget.trim();
    }
}