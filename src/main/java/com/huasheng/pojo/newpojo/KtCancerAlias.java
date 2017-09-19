package com.huasheng.pojo.newpojo;

public class KtCancerAlias {
    private String cancerAliasKey;

    private String cancerKey;

    private Integer doid;

    private String pingyin;

    private String aliasName;

    public String getCancerAliasKey() {
        return cancerAliasKey;
    }

    public void setCancerAliasKey(String cancerAliasKey) {
        this.cancerAliasKey = cancerAliasKey == null ? null : cancerAliasKey.trim();
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

    public String getPingyin() {
        return pingyin;
    }

    public void setPingyin(String pingyin) {
        this.pingyin = pingyin == null ? null : pingyin.trim();
    }

    public String getAliasName() {
        return aliasName;
    }

    public void setAliasName(String aliasName) {
        this.aliasName = aliasName == null ? null : aliasName.trim();
    }
}