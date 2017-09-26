package com.huasheng.pojo.oldpojo;

public class OldKtGeneGenomicContext {
    private String id;

    private Integer geneId;

    private String chrloc;

    private Integer chrstop;

    private Integer chrstart;

    private String chraccver;

    private Integer exoncount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
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