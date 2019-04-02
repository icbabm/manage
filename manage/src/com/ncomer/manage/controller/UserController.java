package com.ncomer.manage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ncomer.manage.model.DatagridResult;
import com.ncomer.manage.model.User;
import com.ncomer.manage.service.UserService;
import com.github.pagehelper.PageInfo;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;
		
	public String ulogin(String uLoginname,String uPassword) {
		return null;
	}
	
	@RequestMapping("/user/rowlist")
	@ResponseBody
	public DatagridResult<User> getUserList(String uName,Integer uState,String startDate,String endDate,@RequestParam(defaultValue = "1")Integer page,@RequestParam(defaultValue = "10")Integer rows){
		return userService.getUserList(uName, uState, startDate, endDate, page,rows);
	}
	
	@RequestMapping("/user/add")
	@ResponseBody
	public int addUser(User user,String roles) {
		return userService.addUser(user);
	}

}
