package com.ncomer.manage.model;

import java.util.Date;

import com.ncomer.manage.util.DateUtils;

public class Department {
    private Integer deptId;

    private String deptCode;

    private String deptName;

    private String deptDesc;

    private Integer deptSort;

    private Integer deptPid;

    private Date deptCtime;

    private String state;
    
    private String deptCtimeView;

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode == null ? null : deptCode.trim();
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    public String getDeptDesc() {
        return deptDesc;
    }

    public void setDeptDesc(String deptDesc) {
        this.deptDesc = deptDesc == null ? null : deptDesc.trim();
    }

    public Integer getDeptSort() {
        return deptSort;
    }

    public void setDeptSort(Integer deptSort) {
        this.deptSort = deptSort;
    }

    public Integer getDeptPid() {
        return deptPid;
    }

    public void setDeptPid(Integer deptPid) {
        this.deptPid = deptPid;
    }

    public Date getDeptCtime() {
        return deptCtime;
    }

    public void setDeptCtime(Date deptCtime) {
        this.deptCtime = deptCtime;
        this.deptCtimeView = DateUtils.dateToString(deptCtime, DateUtils.DATETIME_NORMAL_FORMAT);
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

	public String getDeptCtimeView() {
		return deptCtimeView;
	}
      
}