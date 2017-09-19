package com.huasheng.pojo.newpojo;

public class KtDocumentCategory {
    private String itemKey;

    private String documentKey;

    public String getItemKey() {
        return itemKey;
    }

    public void setItemKey(String itemKey) {
        this.itemKey = itemKey == null ? null : itemKey.trim();
    }

    public String getDocumentKey() {
        return documentKey;
    }

    public void setDocumentKey(String documentKey) {
        this.documentKey = documentKey == null ? null : documentKey.trim();
    }
}