package com.huasheng.pojo.oldpojo;

public class OldKtChemicalClassification {
    private String id;

    private String chemontId;

    private String name;

    private String definition;

    private Integer parentId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getChemontId() {
        return chemontId;
    }

    public void setChemontId(String chemontId) {
        this.chemontId = chemontId == null ? null : chemontId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition == null ? null : definition.trim();
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }
}