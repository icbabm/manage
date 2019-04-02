package com.ncomer.manage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ncomer.manage.model.Department;
import com.ncomer.manage.service.DeptService;

@Controller
@RequestMapping("/dept")
public class DeptController {
	
	@Autowired
	DeptService deptService;
	
	@RequestMapping("/list")
	@ResponseBody
	public List<Department> getList(@RequestParam(defaultValue = "0") Integer deptId){
		return deptService.getList(deptId);	
	}

}
