package com.huasheng.pojo.newpojo;

public class KtDrugProductInstruction {
    private String instructionKey;

    private String productKey;

    private String instructionFile;

    public String getInstructionKey() {
        return instructionKey;
    }

    public void setInstructionKey(String instructionKey) {
        this.instructionKey = instructionKey == null ? null : instructionKey.trim();
    }

    public String getProductKey() {
        return productKey;
    }

    public void setProductKey(String productKey) {
        this.productKey = productKey == null ? null : productKey.trim();
    }

    public String getInstructionFile() {
        return instructionFile;
    }

    public void setInstructionFile(String instructionFile) {
        this.instructionFile = instructionFile == null ? null : instructionFile.trim();
    }
}