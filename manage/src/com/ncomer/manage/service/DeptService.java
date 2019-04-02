package com.ncomer.manage.service;

import java.util.List;

import com.ncomer.manage.model.Department;

public interface DeptService {
	
	List<Department> getList(Integer deptId);

}
