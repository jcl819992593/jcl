package com.huasheng.pojo.newpojo;

public class KtProteinSynonym {
    private String proteinSynonymKey;

    private String proteinKey;

    private String proteinId;

    private String synonym;

    public String getProteinSynonymKey() {
        return proteinSynonymKey;
    }

    public void setProteinSynonymKey(String proteinSynonymKey) {
        this.proteinSynonymKey = proteinSynonymKey == null ? null : proteinSynonymKey.trim();
    }

    public String getProteinKey() {
        return proteinKey;
    }

    public void setProteinKey(String proteinKey) {
        this.proteinKey = proteinKey == null ? null : proteinKey.trim();
    }

    public String getProteinId() {
        return proteinId;
    }

    public void setProteinId(String proteinId) {
        this.proteinId = proteinId == null ? null : proteinId.trim();
    }

    public String getSynonym() {
        return synonym;
    }

    public void setSynonym(String synonym) {
        this.synonym = synonym == null ? null : synonym.trim();
    }

}