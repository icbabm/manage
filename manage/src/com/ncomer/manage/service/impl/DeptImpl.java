package com.ncomer.manage.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ncomer.manage.mapper.DepartmentMapper;
import com.ncomer.manage.model.Department;
import com.ncomer.manage.service.DeptService;

@Service
public class DeptImpl implements DeptService{
	
	@Autowired
	DepartmentMapper departmentMapper;

	public List<Department> getList(Integer deptId) {
		return departmentMapper.selectList(deptId);
	}

}
