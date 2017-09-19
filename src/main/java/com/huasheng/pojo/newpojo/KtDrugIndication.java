package com.huasheng.pojo.newpojo;

/**
 * @desc:药物相关结构化适应症信息
 * @author: 江承良
 * @date: 2017/9/1 14:24
 */
public class KtDrugIndication   {
    private String indicationKey;
    private String meddraConceptName;

    public String getIndicationKey() {
        return indicationKey;
    }

    public void setIndicationKey(String indicationKey) {
        this.indicationKey = indicationKey;
    }

    public String getMeddraConceptName() {
        return meddraConceptName;
    }

    public void setMeddraConceptName(String meddraConceptName) {
        this.meddraConceptName = meddraConceptName;
    }

}
