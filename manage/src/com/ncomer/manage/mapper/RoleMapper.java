package com.ncomer.manage.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ncomer.manage.model.Role;

public interface RoleMapper {
    int deleteByPrimaryKey(Integer rId);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Integer rId);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
    
    List<Role> selectList(@Param("rState")Integer rState);
    
    int selectCount(@Param("rName")String rName,@Param("rId")Integer rId);
}