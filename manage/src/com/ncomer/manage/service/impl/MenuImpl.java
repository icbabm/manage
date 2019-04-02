package com.ncomer.manage.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.swing.event.MenuListener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ncomer.manage.mapper.MenuMapper;
import com.ncomer.manage.model.Menu;
import com.ncomer.manage.model.MenuTree;
import com.ncomer.manage.service.MenuService;

@Service
public class MenuImpl implements MenuService{
	
	@Autowired
	MenuMapper menuMapper;

	public List<MenuTree> getMenuList(Integer pid) {
		List<Menu> menuList =  menuMapper.selectList(pid);
		return ToMenuTree(menuList);
	}
	
	public List<MenuTree> ToMenuTree(List<Menu> list){
		List<MenuTree> treeList = new ArrayList<MenuTree>();
		for (Menu menu : list) {
			MenuTree MenuTree = new MenuTree(menu.getmId(), 
								menu.getmName(), 
								menu.getmIcon(), 
								menu.getmUrl(), 
								menu.getState(),
								menu.getmPid());
			treeList.add(MenuTree);
		}
		return treeList;
		
	}

}
