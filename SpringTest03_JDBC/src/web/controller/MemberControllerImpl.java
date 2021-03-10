package web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import web.service.MemberService;
import web.vo.MemberVO;

public class MemberControllerImpl extends MultiActionController implements MemberController{
	private MemberService memberService;
	// 반드시 setter를 구현해야 한다.
	public void setMemberService(MemberService memberService) {
		this.memberService = memberService;
	}
	
	public ModelAndView listMembers (HttpServletRequest request, HttpServletResponse response) throws Exception {
		List<MemberVO> membersList = memberService.listMembers();
		ModelAndView mav = new ModelAndView("listMembers"); // WEB-INF/views/listMembers.do로 요청 시 호출된다.
		// addObject() 메서드를 이용해 조회한 회원 정보를 바인딩
		mav.addObject("membersList",membersList);
		return mav;
	}
}
