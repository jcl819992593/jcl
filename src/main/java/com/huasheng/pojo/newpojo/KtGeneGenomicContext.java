package com.huasheng.pojo.newpojo;

public class KtGeneGenomicContext {
    private String geneGenomicContextKey;

    private String geneKey;

    private Integer geneId;

    private String chrloc;

    private Integer chrstop;

    private Integer chrstart;

    private String chraccver;

    private Integer exoncount;

    public String getGeneGenomicContextKey() {
        return geneGenomicContextKey;
    }

    public void setGeneGenomicContextKey(String geneGenomicContextKey) {
        this.geneGenomicContextKey = geneGenomicContextKey == null ? null : geneGenomicContextKey.trim();
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

    public String getChrloc() {
        return chrloc;
    }

    public void setChrloc(String chrloc) {
        this.chrloc = chrloc == null ? null : chrloc.trim();
    }

    public Integer getChrstop() {
        return chrstop;
    }

    public void setChrstop(Integer chrstop) {
        this.chrstop = chrstop;
    }

    public Integer getChrstart() {
        return chrstart;
    }

    public void setChrstart(Integer chrstart) {
        this.chrstart = chrstart;
    }

    public String getChraccver() {
        return chraccver;
    }

    public void setChraccver(String chraccver) {
        this.chraccver = chraccver == null ? null : chraccver.trim();
    }

    public Integer getExoncount() {
        return exoncount;
    }

    public void setExoncount(Integer exoncount) {
        this.exoncount = exoncount;
    }
}