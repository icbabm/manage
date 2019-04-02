package com.ncomer.manage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ncomer.manage.model.Menu;
import com.ncomer.manage.model.MenuTree;
import com.ncomer.manage.service.MenuService;

@Controller
@RequestMapping("/menu")
public class MenuController {
	
	@Autowired
	MenuService menuService;
	
	@RequestMapping("/list")
	@ResponseBody
	public List<MenuTree> getMenuList(@RequestParam(defaultValue = "0") Integer id) {
		return menuService.getMenuList(id);
	}
	

}
