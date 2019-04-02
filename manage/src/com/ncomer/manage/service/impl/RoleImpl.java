package com.ncomer.manage.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ncomer.manage.mapper.RoleMapper;
import com.ncomer.manage.model.DatagridResult;
import com.ncomer.manage.model.Role;
import com.ncomer.manage.service.RoleService;

@Service
public class RoleImpl implements RoleService{
	
	@Autowired
	RoleMapper roleMapper;

	public DatagridResult<Role> getRowRoleList() {
		List<Role> roleList = roleMapper.selectList(null);
		DatagridResult<Role> datagridResult = new DatagridResult<>();
		datagridResult.setRows(roleList);
		datagridResult.setTotal(roleList.size());
		return datagridResult;
	}
	
	public List<Role> getRoleList(Integer rState){
		return roleMapper.selectList(rState);
	}

	public Boolean findRepeat(String rName,Integer rId) {
		int num = roleMapper.selectCount(rName,rId);
		return num==0?true:false;
	}

}
