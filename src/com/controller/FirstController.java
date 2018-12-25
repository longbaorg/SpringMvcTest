package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class FirstController implements Controller {

	public ModelAndView handleRequest(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		ModelAndView maAndView = new ModelAndView();
		
		//添加数据
		maAndView.addObject("msg", "这是我的第一个数据，用字符串的方式添加");
		
		//添加转向的视图  成功或者失败
		maAndView.setViewName("/index.jsp");
		return maAndView;
	}

}
