package com.ncomer.manage.model;

public class Role {
    private Integer rId;

    private String rName;

    private Boolean rState;

    private String rDesc;

    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }

    public String getrName() {
        return rName;
    }

    public void setrName(String rName) {
        this.rName = rName == null ? null : rName.trim();
    }

    public Boolean getrState() {
        return rState;
    }

    public void setrState(Boolean rState) {
        this.rState = rState;
    }

    public String getrDesc() {
        return rDesc;
    }

    public void setrDesc(String rDesc) {
        this.rDesc = rDesc == null ? null : rDesc.trim();
    }
}