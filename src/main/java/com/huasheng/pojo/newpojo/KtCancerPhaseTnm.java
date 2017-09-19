package com.huasheng.pojo.newpojo;

public class KtCancerPhaseTnm {
    private String cancerPhaseTnmKey;

    private String cancerKey;

    private Integer doid;

    private String phaseName;

    private String phaseText;

    public String getCancerPhaseTnmKey() {
        return cancerPhaseTnmKey;
    }

    public void setCancerPhaseTnmKey(String cancerPhaseTnmKey) {
        this.cancerPhaseTnmKey = cancerPhaseTnmKey == null ? null : cancerPhaseTnmKey.trim();
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