package com.ncomer.manage.model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.ncomer.manage.util.DateUtils;

public class User {
	
	//声明性别的常量
	public static final Integer GENDER_OF_MAN =  1;
	public static final Integer GENDER_OF_WOMAN =  0;
	
	public static final String GENDER_OF_MAN_VIEW =  "男";
	public static final String GENDER_OF_WOMAN_VIEW =  "女";
	
	public static final Map<Integer,String> genderMap = new HashMap<Integer, String>();
	
	static{
		genderMap.put(GENDER_OF_MAN, GENDER_OF_MAN_VIEW);
		genderMap.put(GENDER_OF_WOMAN, GENDER_OF_WOMAN_VIEW);
		
	}
	
    private Integer uId;

    private String uCode;

    private String uLoginname;

    private String uPassword;

    private String uName;

    private Integer uGender;

    private Date uCtime;

    private Integer uState;
    
    //View视图       只需要get()方法
	private String genderView;
	
	private String createtimeView;

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getuCode() {
        return uCode;
    }

    public void setuCode(String uCode) {
        this.uCode = uCode == null ? null : uCode.trim();
    }

    public String getuLoginname() {
        return uLoginname;
    }

    public void setuLoginname(String uLoginname) {
        this.uLoginname = uLoginname == null ? null : uLoginname.trim();
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword == null ? null : uPassword.trim();
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName == null ? null : uName.trim();
    }

    public Integer getuGender() {
        return uGender;
    }

    public void setuGender(Integer uGender) {
        this.uGender = uGender;
        this.genderView = genderMap.get(uGender);
    }

    public Date getuCtime() {
        return uCtime;
    }

    public void setuCtime(Date uCtime) {
        this.uCtime = uCtime;
        this.createtimeView = DateUtils.dateToString(uCtime, DateUtils.DATETIME_NORMAL_FORMAT);
    }

    public Integer getuState() {
        return uState;
    }

    public void setuState(Integer uState) {
        this.uState = uState;
    }
    
	public String getGenderView() {
		return genderView;
	}

	public String getCreatetimeView() {
		return createtimeView;
	}
	
}