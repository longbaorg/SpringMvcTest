package com.controller;

import javax.jws.soap.SOAPBinding.Use;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.core.po.User;

@Controller
public class userController {

	/*
	 * �����û���ע����Ϣ
	 */
	@RequestMapping("registerUser")
	public String registerUser(User user) throws Exception {
		String username = user.getUsername();
		String password = user.getPassword();
		System.out.println(username+password);
		return "index";
	}
	
	/*
	 * ���û�ע�������ת
	 */
	@RequestMapping(value="/toRegister")
	public String toregister(){
		return "register";
	}

}
