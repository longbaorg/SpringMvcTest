package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class FirstController implements Controller {

	public ModelAndView handleRequest(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		ModelAndView maAndView = new ModelAndView();
		
		//�������
		maAndView.addObject("msg", "�����ҵĵ�һ�����ݣ����ַ����ķ�ʽ���");
		
		//���ת�����ͼ  �ɹ�����ʧ��
		maAndView.setViewName("/index.jsp");
		return maAndView;
	}

}
