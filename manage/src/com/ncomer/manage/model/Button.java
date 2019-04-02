package com.ncomer.manage.model;

public class Button {
    private Integer bId;

    private String bName;

    private String bType;

    private String bIcon;

    private Boolean bState;
    
    public Button() {
		super();
	}

	public Button(Integer bId, String bName, String bType, String bIcon, Boolean bState) {
		super();
		this.bId = bId;
		this.bName = bName;
		this.bType = bType;
		this.bIcon = bIcon;
		this.bState = bState;
	}

	public Integer getbId() {
        return bId;
    }

    public void setbId(Integer bId) {
        this.bId = bId;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName == null ? null : bName.trim();
    }

    public String getbType() {
        return bType;
    }

    public void setbType(String bType) {
        this.bType = bType == null ? null : bType.trim();
    }

    public String getbIcon() {
        return bIcon;
    }

    public void setbIcon(String bIcon) {
        this.bIcon = bIcon == null ? null : bIcon.trim();
    }

    public Boolean getbState() {
        return bState;
    }

    public void setbState(Boolean bState) {
        this.bState = bState;
    }
}