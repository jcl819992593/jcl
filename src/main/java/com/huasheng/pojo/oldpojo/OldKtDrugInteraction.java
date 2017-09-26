package com.huasheng.pojo.oldpojo;

public class OldKtDrugInteraction {
    private String id;

    private Integer drugId;

    private Integer drugIdInteraction;

    private String description;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}