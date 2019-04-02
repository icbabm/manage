package com.ncomer.manage.service;

import java.util.List;

import com.ncomer.manage.model.Menu;
import com.ncomer.manage.model.MenuTree;

public interface MenuService {
	
	List<MenuTree> getMenuList(Integer pid);

}
