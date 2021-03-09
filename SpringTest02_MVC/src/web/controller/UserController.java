package web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class UserController extends MultiActionController {
	public ModelAndView login (HttpServletRequest request, HttpServletResponse response) throws Exception {
		String userID = null;
		String passwd = null;
		ModelAndView mav = new ModelAndView();
		request.setCharacterEncoding("utf-8");
		userID = request.getParameter("userID");
		passwd = request.getParameter("passwd");
		
		mav.addObject("userID",userID);
		mav.addObject("passwd", passwd);
		
		mav.setViewName("result");
		return mav;
		
	}
	
	public ModelAndView memberInfo (HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		
		mav.addObject("id", id);
		mav.addObject("pw", pw);
		mav.addObject("name", name);
		mav.addObject("email", email);
		
		
		mav.setViewName("memberInfo");
		return mav;
		
	}
}

