package com.huasheng.pojo.newpojo;


public class KtCancerPhase{
    private String cancerPhaseKey;

    private String cancerKey;

    private Integer doid;

    private String phaseName;

    private String phaseText;

    public String getCancerPhaseKey() {
        return cancerPhaseKey;
    }

    public void setCancerPhaseKey(String cancerPhaseKey) {
        this.cancerPhaseKey = cancerPhaseKey == null ? null : cancerPhaseKey.trim();
    }

    public String getCancerKey() {
        return cancerKey;
    }

    public void setCancerKey(String cancerKey) {
        this.cancerKey = cancerKey == null ? null : cancerKey.trim();
    }

    public Integer getDoid() {
        return doid;
    }

    public void setDoid(Integer doid) {
        this.doid = doid;
    }

    public String getPhaseName() {
        return phaseName;
    }

    public void setPhaseName(String phaseName) {
        this.phaseName = phaseName == null ? null : phaseName.trim();
    }

    public String getPhaseText() {
        return phaseText;
    }

    public void setPhaseText(String phaseText) {
        this.phaseText = phaseText == null ? null : phaseText.trim();
    }
}