package com.huasheng.pojo.newpojo;


public class KtDrugInteraction {
    private String interactionKey;

    private String drugKey;

    private Integer drugId;

    private Integer drugIdInteraction;

    private String drugInteractionKey;

    private String description;

    public String getInteractionKey() {
        return interactionKey;
    }

    public void setInteractionKey(String interactionKey) {
        this.interactionKey = interactionKey == null ? null : interactionKey.trim();
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

    public Integer getDrugIdInteraction() {
        return drugIdInteraction;
    }

    public void setDrugIdInteraction(Integer drugIdInteraction) {
        this.drugIdInteraction = drugIdInteraction;
    }

    public String getDrugInteractionKey() {
        return drugInteractionKey;
    }

    public void setDrugInteractionKey(String drugInteractionKey) {
        this.drugInteractionKey = drugInteractionKey == null ? null : drugInteractionKey.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}