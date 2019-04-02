package com.ncomer.manage.service;

import com.ncomer.manage.model.DatagridResult;
import com.ncomer.manage.model.User;


public interface UserService {
	
    int addUser(User user);
    
    int editUser(User user);
    
    User findUserByLoginName(String uLoginName);
    
    int getCountByLoginName(Integer uId,String uLoginName);
    
    DatagridResult<User> getUserList(String uName,Integer uState,String startDate,String endDate,Integer page,Integer rows);

}
