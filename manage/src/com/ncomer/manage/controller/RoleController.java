package com.ncomer.manage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ncomer.manage.model.DatagridResult;
import com.ncomer.manage.model.Role;
import com.ncomer.manage.service.RoleService;

@Controller
@RequestMapping("/role")
public class RoleController {
	
	@Autowired
	RoleService roleService;
	
	@RequestMapping("/rowlist")
	@ResponseBody
	public DatagridResult<Role> getRowRoleList(){
		return roleService.getRowRoleList();
	}
	
	@RequestMapping("/list")
	@ResponseBody
	public List<Role> getRoleList(Integer rState){
		return roleService.getRoleList(rState);
	}
	
	@RequestMapping("/validate")
	@ResponseBody
	public Boolean findRepeat(String rName,Integer rId) {
		return roleService.findRepeat(rName,rId);
	}

}
