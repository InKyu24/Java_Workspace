package web.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import web.service.MemberService;
import web.vo.MemberVO;

public class MemberControllerImpl extends MultiActionController implements MemberController {
	MemberService memberService;
	
	// memberService 빈을 주입하기 위해 setter를 구현
	public void setMemberService(MemberService memberService) {
		this.memberService = memberService;
	}
	
	@Override
	public ModelAndView listMembers (HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView("listMembers"); // WEB-INF/views/listMembers.jsp
		
		List<MemberVO> memlist = memberService.listMembers();
		mav.addObject("memberList", memlist); // 조회한 회원 정보를 ModelAndView의 addObject() 메서드를 이용해 바인딩
		return mav;
		
	}

	@Override
	public ModelAndView addMember (HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		Date date = new Date();
		
		MemberVO memberVO = new MemberVO(id, pw, name, date);
		// bind(request, memberVO); // 회원 가입창에서 전송된 회원 정보를 bind() 메서드를 이용해 memberVO 해당 속성에 자동으로 설정
		memberService.addMember(memberVO);
		ModelAndView mav = new ModelAndView("redirect:/member/listMembers.do");
		return mav;
	}

	@Override
	public ModelAndView removeMember (HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		memberService.removeMember(id);
		ModelAndView mav = new ModelAndView("removeMember");
		return mav;
	}
	
	public ModelAndView form (HttpServletRequest request, HttpServletResponse response) throws Exception {
		String viewName = getViewName(request);
		ModelAndView mav = new ModelAndView();
		mav.setViewName(viewName);
		return mav;
	}

	private String getViewName(HttpServletRequest request) {
		String contextPath = request.getContextPath();
		String uri = (String) request.getAttribute("javax.servlet.include.request_uri");
		if (uri == null || uri.trim().equals("")) {
			uri = request.getRequestURI();
		}

		int begin = 0;
		if (!((contextPath == null) || ("".equals(contextPath)))) {
			begin = contextPath.length();
		}

		int end;
		if (uri.indexOf(";") != -1) {
			end = uri.indexOf(";");
		} else if (uri.indexOf("?") != -1) {
			end = uri.indexOf("?");
		} else {
			end = uri.length();
		}

		String fileName = uri.substring(begin, end);
		if (fileName.indexOf(".") != -1) {
			fileName = fileName.substring(0, fileName.lastIndexOf("."));
		}
		if (fileName.lastIndexOf("/") != -1) {
			fileName = fileName.substring(fileName.lastIndexOf("/"), fileName.length());
		}
		return fileName;
	}
}
