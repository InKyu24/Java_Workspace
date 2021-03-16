package my.camping.shop.member.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
	
	@RequestMapping(value = "/memInsert.camp", produces = "application/text; charset=utf8", method= {RequestMethod.GET, RequestMethod.POST})		
	@ResponseBody
	public String memInsert (HttpServletRequest req, HttpServletResponse res) throws MemberException{
		String id=req.getParameter("id");
		String name=req.getParameter("name");
		String pw=req.getParameter("pw");
		String phone= req.getParameter("phone");
		String birth= req.getParameter("birth");
		System.out.println("회원가입 아이디: "+id+"\t비밀번호: "+pw+"\t이름: "+name+"\t전화번호: "+phone+"\t생년월일: "+birth);
		memVO = new MemberVO(name, id, pw, phone, birth);
		memService.memInsert(memVO);
		return name+"님 회원가입을 축하드립니다.\n메인페이지에서 로그인 해주세요";
	}		

}
