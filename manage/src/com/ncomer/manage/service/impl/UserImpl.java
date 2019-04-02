package com.ncomer.manage.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ncomer.manage.mapper.UserMapper;
import com.ncomer.manage.model.DatagridResult;
import com.ncomer.manage.model.User;
import com.ncomer.manage.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class UserImpl implements UserService {
	
	@Autowired
	UserMapper userMapper;

	public int addUser(User user) {
		user.setuCtime(new Date());
		user.setuState(1);
		return userMapper.insert(user);
	}

	public int editUser(User user) {
		return userMapper.updateByPrimaryKeySelective(user);
	}

	public User findUserByLoginName(String uLoginName) {
		return userMapper.selectUserByLoginName(uLoginName);
	}

	public int getCountByLoginName(Integer uId, String uLoginName) {
		return userMapper.selectCountByLoginName(uId, uLoginName);
	}

	public DatagridResult<User>  getUserList(String uName, Integer uState, String startDate, String endDate, Integer page,Integer rows) {
		PageHelper.startPage(page, rows);
		List<User> userList = userMapper.selectList(uName, uState, startDate, endDate);
		PageInfo<User> pageInfo = new PageInfo<>(userList);
		DatagridResult<User> datagridResult = new DatagridResult<User>();
		datagridResult.setRows(userList);
		datagridResult.setTotal(pageInfo.getTotal());
		return datagridResult;
	}
	
}
