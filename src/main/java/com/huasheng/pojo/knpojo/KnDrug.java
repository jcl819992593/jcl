package com.huasheng.pojo.knpojo;

import java.util.Date;

public class KnDrug {
    private String id;

    private String createBy;

    private Date createDate;

    private String updateBy;

    private Date updateDate;

    private String delFlag;

    private String remarks;

    private String name;

    private String pinyin;

    private String nameCn;

    private String price;

    private String type;

    private String adverseReactions;

    private String mechanism;

    private String contraindications;

    private String singleDosePeakTime;

    private String plasmaProteinBindingRate;

    private String mainMetabolism;

    private String plasmaHalfLife;

    private String mainWaysEliminate;

    private String adverseReactionsFrequency;

    private String notes;

    private String adverseReactionsId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin == null ? null : pinyin.trim();
    }

    public String getNameCn() {
        return nameCn;
    }

    public void setNameCn(String nameCn) {
        this.nameCn = nameCn == null ? null : nameCn.trim();
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getAdverseReactions() {
        return adverseReactions;
    }

    public void setAdverseReactions(String adverseReactions) {
        this.adverseReactions = adverseReactions == null ? null : adverseReactions.trim();
    }

    public String getMechanism() {
        return mechanism;
    }

    public void setMechanism(String mechanism) {
        this.mechanism = mechanism == null ? null : mechanism.trim();
    }

    public String getContraindications() {
        return contraindications;
    }

    public void setContraindications(String contraindications) {
        this.contraindications = contraindications == null ? null : contraindications.trim();
    }

    public String getSingleDosePeakTime() {
        return singleDosePeakTime;
    }

    public void setSingleDosePeakTime(String singleDosePeakTime) {
        this.singleDosePeakTime = singleDosePeakTime == null ? null : singleDosePeakTime.trim();
    }

    public String getPlasmaProteinBindingRate() {
        return plasmaProteinBindingRate;
    }

    public void setPlasmaProteinBindingRate(String plasmaProteinBindingRate) {
        this.plasmaProteinBindingRate = plasmaProteinBindingRate == null ? null : plasmaProteinBindingRate.trim();
    }

    public String getMainMetabolism() {
        return mainMetabolism;
    }

    public void setMainMetabolism(String mainMetabolism) {
        this.mainMetabolism = mainMetabolism == null ? null : mainMetabolism.trim();
    }

    public String getPlasmaHalfLife() {
        return plasmaHalfLife;
    }

    public void setPlasmaHalfLife(String plasmaHalfLife) {
        this.plasmaHalfLife = plasmaHalfLife == null ? null : plasmaHalfLife.trim();
    }

    public String getMainWaysEliminate() {
        return mainWaysEliminate;
    }

    public void setMainWaysEliminate(String mainWaysEliminate) {
        this.mainWaysEliminate = mainWaysEliminate == null ? null : mainWaysEliminate.trim();
    }

    public String getAdverseReactionsFrequency() {
        return adverseReactionsFrequency;
    }

    public void setAdverseReactionsFrequency(String adverseReactionsFrequency) {
        this.adverseReactionsFrequency = adverseReactionsFrequency == null ? null : adverseReactionsFrequency.trim();
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
    }

    public String getAdverseReactionsId() {
        return adverseReactionsId;
    }

    public void setAdverseReactionsId(String adverseReactionsId) {
        this.adverseReactionsId = adverseReactionsId == null ? null : adverseReactionsId.trim();
    }
}