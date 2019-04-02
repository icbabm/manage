package com.ncomer.manage.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ncomer.manage.model.Button;
import com.ncomer.manage.model.User;
import com.ncomer.manage.service.UserService;

@Controller
public class LoginController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/signin")
	@ResponseBody
	public Boolean getUserByLoginName(String manager, String password,HttpServletRequest request,Model model) {
		Boolean flag = false;
		User user = userService.findUserByLoginName(manager);
		if (user == null) {
			return flag;
		}
		if (user.getuState() == 0) {
			return flag;
		}
		if (!DigestUtils.sha1Hex(password).equals(user.getuPassword())) {
			return flag;
		}
		HttpSession session = request.getSession(true);
		session.setAttribute("SESSION_USER", user);
		return true;
	}
	
	@RequestMapping("/menu")
	public String tomain(HttpServletRequest request,Model model) {
		HttpSession session = request.getSession(true);
		User user = (User) session.getAttribute("SESSION_USER");
		model.addAttribute("user",user);
		return "/menu";
	}
	
	
	@RequestMapping(value="/view/{path}",method=RequestMethod.GET)
	public String toView(@PathVariable("path")String toPath,Integer mId,Model model) {
		//todo 根据菜单和角色判断是否授权。。。
		model.addAttribute("type","dept");
		List list = new ArrayList<>();
		Button button = new Button(1,"新建","add","icon-add",true);
		list.add(button);
		Button button2 = new Button(1,"编辑","edit","icon-edit",true);
		list.add(button2);
		model.addAttribute("button","list");
		return toPath;
	}
	
	@RequestMapping("/signout")
	public String SignOut(HttpServletRequest request,Model model) {
		HttpSession session = request.getSession(true);
		session.removeAttribute("SESSION_USER");
		return "/";
	}

}
