package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/secondController")
public class SecondController {
	
	@RequestMapping(value="method1")
	public ModelAndView method1(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		ModelAndView maAndView = new ModelAndView();
		
		//添加数据
		maAndView.addObject("msg", "这是我的第一个数据，用字符串的方式添加");
		
		//添加转向的视图  成功或者失败
		maAndView.setViewName("index");
		return maAndView;
	}
	
	@RequestMapping(value="method2")
	public ModelAndView method2(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		ModelAndView maAndView = new ModelAndView();
		
		//添加数据
		maAndView.addObject("msg", "secondController的method2方法这是我的第一个数据，用字符串的方式添加");
		
		//添加转向的视图  成功或者失败
		maAndView.setViewName("index");
		return maAndView;
	}
}
