package web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import web.service.AccountService;

public class AccountControllerImpl extends MultiActionController implements AccountController {
	AccountService accountService;
	
	// 속성 accountService에 빈을 주입하기 위해 setter 구현
	public void setAccountservice(AccountService accountservice) {
		this.accountService = accountservice;
	}
	
	@Override
	public ModelAndView sendMoney(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView("result"); // WEB-INF/views/account/result.jsp
		accountService.sendMoney();
		return mav;
		
	}
}
