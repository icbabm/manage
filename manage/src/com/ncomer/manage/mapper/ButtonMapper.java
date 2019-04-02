package com.ncomer.manage.mapper;

import com.ncomer.manage.model.Button;

public interface ButtonMapper {
    int deleteByPrimaryKey(Integer bId);

    int insert(Button record);

    int insertSelective(Button record);

    Button selectByPrimaryKey(Integer bId);

    int updateByPrimaryKeySelective(Button record);

    int updateByPrimaryKey(Button record);
}