package web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class SimpleUrlController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// 서비스 할 내용[login, logout, insert, delete...]
		System.out.println("action-servlet.xml으로부터 handle request 호출됨");
		return new ModelAndView("index.jsp");
	}
	
}
