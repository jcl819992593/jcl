package com.huasheng.pojo.newpojo;

public class KtGeneLocation {
    private String geneLocationKey;

    private String geneKey;

    private Integer geneId;

    private String refAssembly;

    private String chromosome;

    private String geneStart;

    private String geneStop;

    private Integer geneSize;

    private String orientatio;

    private Integer exoncount;

    public String getGeneLocationKey() {
        return geneLocationKey;
    }

    public void setGeneLocationKey(String geneLocationKey) {
        this.geneLocationKey = geneLocationKey == null ? null : geneLocationKey.trim();
    }

    public String getGeneKey() {
        return geneKey;
    }

    public void setGeneKey(String geneKey) {
        this.geneKey = geneKey == null ? null : geneKey.trim();
    }

    public Integer getGeneId() {
        return geneId;
    }

    public void setGeneId(Integer geneId) {
        this.geneId = geneId;
    }

    public String getRefAssembly() {
        return refAssembly;
    }

    public void setRefAssembly(String refAssembly) {
        this.refAssembly = refAssembly == null ? null : refAssembly.trim();
    }

    public String getChromosome() {
        return chromosome;
    }

    public void setChromosome(String chromosome) {
        this.chromosome = chromosome == null ? null : chromosome.trim();
    }

    public String getGeneStart() {
        return geneStart;
    }

    public void setGeneStart(String geneStart) {
        this.geneStart = geneStart == null ? null : geneStart.trim();
    }

    public String getGeneStop() {
        return geneStop;
    }

    public void setGeneStop(String geneStop) {
        this.geneStop = geneStop == null ? null : geneStop.trim();
    }

    public Integer getGeneSize() {
        return geneSize;
    }

    public void setGeneSize(Integer geneSize) {
        this.geneSize = geneSize;
    }

    public String getOrientatio() {
        return orientatio;
    }

    public void setOrientatio(String orientatio) {
        this.orientatio = orientatio == null ? null : orientatio.trim();
    }

    public Integer getExoncount() {
        return exoncount;
    }

    public void setExoncount(Integer exoncount) {
        this.exoncount = exoncount;
    }
}