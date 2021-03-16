package my.camping.shop.member.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import my.camping.shop.member.service.MemberService;
import my.camping.shop.member.util.MemberException;
import my.camping.shop.member.vo.MemberVO;

@Controller
@RequestMapping("/member")
public class MemberControllerImpl implements MemberController {
	
	private MemberVO memVO;
	
	@Autowired
	private MemberService memService;
	
	@Override
	@RequestMapping (value = "/memInsertForm.camp", method= {RequestMethod.GET, RequestMethod.POST})
	public String memJoin () {
		
		return "member/memInsertForm";
	}
	
	@Override
	@RequestMapping(value = "/memInsert.camp", produces = "application/text; charset=utf8", method= {RequestMethod.GET, RequestMethod.POST})		
	@ResponseBody
	public String memInsert (HttpServletRequest req, HttpServletResponse res) throws MemberException{
		String name=req.getParameter("name");
		String id=req.getParameter("id");
		String pw=req.getParameter("pw");
		String phone= req.getParameter("phone");
		String birth= req.getParameter("birth");
		System.out.println("회원가입 아이디: "+id+"\t비밀번호: "+pw+"\t이름: "+name+"\t전화번호: "+phone+"\t생년월일: "+birth);
		
		try {
			memVO = new MemberVO(name, id, pw, phone, birth);
			memService.memInsert(memVO);
			return name+"님 회원가입을 축하드립니다.\n메인페이지에서 로그인 해주세요";
		} catch (MemberException e) {
			return e.getMessage();
		}
	}		
	
	@Override
	@RequestMapping(value = "/login.camp", produces = "application/text; charset=utf8", method= RequestMethod.POST)		
	@ResponseBody
	public String login (HttpServletRequest req, HttpServletResponse res) throws MemberException{
		String id=req.getParameter("id");
		String pw=req.getParameter("pw");
		
		try {
			memVO = new MemberVO(id, pw);
			String name= memService.login(memVO);
		
			if (name != null) {
				HttpSession session=req.getSession();
				session.setAttribute("userInfo", memVO);
				System.out.println("로그인 성공 아이디: "+id+"\t비밀번호: "+pw+"\t이름: "+name);
				return name+"님과 함께 캠핑가고 싶은 날이에요 <br> <form><input class='btn btn-dark btn btn-primary btn-sm' id='logout' type='submit' value='LOGOUT'></form>";
			} else {
				System.out.println("로그인 실패 아이디: "+id+"\t비밀번호: "+pw+"\t이름: "+name);
				return "<small>로그인에 성공하지 못했습니다</small>"
						+ "<form id='loginForm' method='post'>"
						+ "<table>"
						+ "<tr>"
						+ "<td><input type='text' id='id' class='form-control input-sm placeholder='아이디 입력'> </td>"
						+ "<td rowspan='2' align='center'><button type='submit' class='btn btn-lg btn-dark' id='memLogin'>로그인</button> </td>"
						+ "</tr>"
						+ "<tr>"
						+ "<td><input type='password' id='pw' class='form-control input-sm' placeholder='비밀번호 입력'></td>"
						+ "</table>"
						+ "<button class='btn btn-light btn-primary btn-sm' onclick='window.open('member/memFindForm.camp', '_blank', 'toolbar=yes,scrollbars=yes,resizable=yes,top=50,left=500,width=500,height=750');'>ID/PW 찾기</button>"
						+ "<button class='btn btn-light btn-primary btn-sm' onclick='window.open('member/memInsertForm.camp', '_blank', 'toolbar=yes,scrollbars=yes,resizable=yes,top=50,left=500,width=500,height=500');'>회원가입</button>"
						+ "</form>";
			}
		} catch (MemberException e) {
			return e.getMessage();
		}
	}		
	
	@Override
	@RequestMapping (value = "/memFindForm.camp", method= {RequestMethod.GET, RequestMethod.POST})
	public String memFind () {
		
		return "member/memFindForm";
	}
	
	@Override
	@RequestMapping(value = "/memFindId.camp", produces = "application/text; charset=utf8", method= RequestMethod.POST)		
	@ResponseBody
	public String memFindId (HttpServletRequest req, HttpServletResponse res) throws MemberException{
		String name=req.getParameter("name");
		String phone= req.getParameter("phone");
		String birth= req.getParameter("birth");
		
		try {
			memVO = new MemberVO (name, phone, birth);
			String id = memService.memFindId(memVO);
			System.out.println(memVO);
			if (id == null) {
				System.out.println("id = null!!!!");
				return "아이디를 찾지 못했습니다";
			} else {
				return id+"로 가입하셨던 것 같네요.\n메인페이지에서 로그인 해주세요";
			}
		} catch (MemberException e) {
			return e.getMessage();
		}
	}	
	
	@Override
	@RequestMapping(value = "/memFindPw.camp", produces = "application/text; charset=utf8", method= RequestMethod.POST)		
	@ResponseBody
	public String memFindPw (HttpServletRequest req, HttpServletResponse res) throws MemberException{
		String name=req.getParameter("name");
		String id=req.getParameter("id");
		String phone= req.getParameter("phone");
		String birth= req.getParameter("birth");

		try {
			memVO = new MemberVO(name, id, phone, birth);
			String pw = memService.memFindPw(memVO);
			System.out.println(memVO);
			if (pw==null) {
				System.out.println("pw = null!!!!");
				return "비밀번호를 찾지 못했습니다";
			} else {
				return "혼자만 보세요!\n(속닥속닥)\n"+name+"님의 비밀번호는 "+pw+"입니다.\n메인페이지에서 로그인 해주세요";
			}
		} catch (MemberException e) {
			return e.getMessage();
		}
		
	}		
	
}