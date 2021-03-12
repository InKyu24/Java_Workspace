package web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import web.service.AccountService;
import web.vo.AccountVO;


public class AccountControllerImpl extends MultiActionController implements AccountController {
	AccountService accountService;
	
	// 속성 accountService에 빈을 주입하기 위해 setter 구현
	public void setAccountService(AccountService accountService) {
		this.accountService = accountService;
	}
	
	@Override
	public ModelAndView sendMoney(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView("result"); // WEB-INF/views/account/result.jsp
		accountService.sendMoney();
		return mav;
	}
	
	@Override
	public ModelAndView accountsList (HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView("check");
		
		List<AccountVO> accountsList = accountService.accountsList();
		mav.addObject("accList", accountsList); // 조회한 회원 정보를 ModelAndView의 addObject() 메서드를 이용해 바인딩
		return mav;
		
	}
}
