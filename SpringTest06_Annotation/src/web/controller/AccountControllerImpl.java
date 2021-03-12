package web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import web.service.AccountService;

//첫번째 URL 요청이 /account이면 accountController 빈을 요청
@Controller("accountController")
@RequestMapping("/account")
public class AccountControllerImpl extends MultiActionController implements AccountController {
	
	@Autowired
	AccountService accountService;
	
	
	@Override
	// sendMoney.do에 접근하게 되면 Get 방식으로 해당 메서드가 호출된다.
	@RequestMapping(value="/sendMoney.do", method = RequestMethod.GET)
	public ModelAndView sendMoney(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView("account/result"); // WEB-INF/views/account/result.jsp
		accountService.sendMoney();
		return mav;
		
	}
}
