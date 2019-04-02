package com.ncomer.manage.mapper;

import java.util.List;

import com.ncomer.manage.model.Menu;

public interface MenuMapper {
    int deleteByPrimaryKey(Integer mId);

    int insert(Menu record);

    int insertSelective(Menu record);

    Menu selectByPrimaryKey(Integer mId);

    int updateByPrimaryKeySelective(Menu record);

    int updateByPrimaryKey(Menu record);
    
    List<Menu> selectList(Integer mPid);
}