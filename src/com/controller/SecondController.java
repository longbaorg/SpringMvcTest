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
		
		//�������
		maAndView.addObject("msg", "�����ҵĵ�һ�����ݣ����ַ����ķ�ʽ���");
		
		//���ת�����ͼ  �ɹ�����ʧ��
		maAndView.setViewName("index");
		return maAndView;
	}
	
	@RequestMapping(value="method2")
	public ModelAndView method2(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		ModelAndView maAndView = new ModelAndView();
		
		//�������
		maAndView.addObject("msg", "secondController��method2���������ҵĵ�һ�����ݣ����ַ����ķ�ʽ���");
		
		//���ת�����ͼ  �ɹ�����ʧ��
		maAndView.setViewName("index");
		return maAndView;
	}
}
