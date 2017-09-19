package com.huasheng.pojo.newpojo;

/**
 * Created by Administrator on 2017/8/27.
 * 药物间相互作用，查询结果实体
 */
public class KtDrugIdInteraction{
    private String genericName;
    private String interactionDesc;
    private int interactionId;

    public String getGenericName() {
        return genericName;
    }

    public void setGenericName(String genericName) {
        this.genericName = genericName;
    }

    public String getInteractionDesc() {
        return interactionDesc;
    }

    public void setInteractionDesc(String interactionDesc) {
        this.interactionDesc = interactionDesc;
    }

    public int getInteractionId() {
        return interactionId;
    }

    public void setInteractionId(int interactionId) {
        this.interactionId = interactionId;
    }

}
