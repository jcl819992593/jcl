package com.huasheng.pojo.newpojo;

public class KtDrugProductPurchaseChannel {
    private String channelKey;

    private String productKey;

    private String channelName;

    private String channelUrl;

    private String channelPhone;

    private String channelPrice;

    public String getChannelKey() {
        return channelKey;
    }

    public void setChannelKey(String channelKey) {
        this.channelKey = channelKey == null ? null : channelKey.trim();
    }

    public String getProductKey() {
        return productKey;
    }

    public void setProductKey(String productKey) {
        this.productKey = productKey == null ? null : productKey.trim();
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName == null ? null : channelName.trim();
    }

    public String getChannelUrl() {
        return channelUrl;
    }

    public void setChannelUrl(String channelUrl) {
        this.channelUrl = channelUrl == null ? null : channelUrl.trim();
    }

    public String getChannelPhone() {
        return channelPhone;
    }

    public void setChannelPhone(String channelPhone) {
        this.channelPhone = channelPhone == null ? null : channelPhone.trim();
    }

    public String getChannelPrice() {
        return channelPrice;
    }

    public void setChannelPrice(String channelPrice) {
        this.channelPrice = channelPrice == null ? null : channelPrice.trim();
    }

}