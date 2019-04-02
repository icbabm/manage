package com.ncomer.manage.service;

import java.util.List;

import com.ncomer.manage.model.DatagridResult;
import com.ncomer.manage.model.Role;

public interface RoleService {
	
	DatagridResult<Role> getRowRoleList();
	
	List<Role> getRoleList(Integer rState);
	
	Boolean findRepeat(String rName,Integer rId);
}
