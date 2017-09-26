package com.huasheng.pojo.oldpojo;

public class OldKtChemicalSynonym {
    private String id;

    private String chemontid;

    private String synonym;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getChemontid() {
        return chemontid;
    }

    public void setChemontid(String chemontid) {
        this.chemontid = chemontid == null ? null : chemontid.trim();
    }

    public String getSynonym() {
        return synonym;
    }

    public void setSynonym(String synonym) {
        this.synonym = synonym == null ? null : synonym.trim();
    }
}