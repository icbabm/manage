package com.ncomer.manage.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ncomer.manage.model.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer uId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer uId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    User selectUserByLoginName(String uLoginName);
    
    int selectCountByLoginName(@Param("uId")Integer uId, @Param("uLoginName")String uLoginName);
    
    List<User> selectList(@Param("uName")String uName, @Param("uState")Integer uState, @Param("startDate")String startDate, @Param("endDate")String endDate);
}