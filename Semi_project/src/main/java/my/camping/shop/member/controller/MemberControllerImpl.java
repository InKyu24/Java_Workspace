package my.camping.shop.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailAuthenticationException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import my.camping.shop.MainController;
import my.camping.shop.member.service.MemberService;
import my.camping.shop.member.vo.MemberVO;

@Controller("memberController")
@RequestMapping(value = "/member")
public class MemberControllerImpl implements MemberController {
//	@Autowired
//	private MemberService memberService;
//	
//	@Autowired
//	private MemberVO memberVO;
	
}
