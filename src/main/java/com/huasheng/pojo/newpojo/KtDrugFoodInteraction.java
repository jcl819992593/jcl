package com.huasheng.pojo.newpojo;

public class KtDrugFoodInteraction {
    private String foodInteractionKey;

    private String drugKey;

    private Integer drugId;

    private String foodInteraction;

    public String getFoodInteractionKey() {
        return foodInteractionKey;
    }

    public void setFoodInteractionKey(String foodInteractionKey) {
        this.foodInteractionKey = foodInteractionKey == null ? null : foodInteractionKey.trim();
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

    public String getFoodInteraction() {
        return foodInteraction;
    }

    public void setFoodInteraction(String foodInteraction) {
        this.foodInteraction = foodInteraction == null ? null : foodInteraction.trim();
    }
}