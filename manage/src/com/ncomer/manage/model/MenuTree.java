package com.ncomer.manage.model;

public class MenuTree {
	
	private Integer id;
	
	private String text;
	
	private String iconCls;
	
	private String url;
	
	private String state;
	
	private Integer pid;
	
	private Boolean checked;
	
	private String attributes;
	
	private String target;

	public MenuTree() {
		super();
	}

	public MenuTree(Integer id, String text, String iconCls, String url, String state, Integer pid) {
		super();
		this.id = id;
		this.text = text;
		this.iconCls = iconCls;
		this.url = url;
		this.state = state;
		this.pid = pid;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getIconCls() {
		return iconCls;
	}

	public void setIconCls(String iconCls) {
		this.iconCls = iconCls;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public Boolean getChecked() {
		return checked;
	}

	public void setChecked(Boolean checked) {
		this.checked = checked;
	}

	public String getAttributes() {
		return attributes;
	}

	public void setAttributes(String attributes) {
		this.attributes = attributes;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}
	
	
}
