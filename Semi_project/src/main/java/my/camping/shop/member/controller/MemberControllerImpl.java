package my.camping.shop.member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import my.camping.shop.member.service.MemberService;
import my.camping.shop.member.util.MemberException;
import my.camping.shop.member.vo.MemberVO;

@Controller("membercontroller")
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
		JSONObject json=new JSONObject();
		try {
			memVO = new MemberVO(id, pw);
			String name= memService.login(memVO);
		
			if (name != null) {
				HttpSession session=req.getSession();
				session.setAttribute("userInfo", memVO);
				System.out.println("로그인 성공 아이디: "+id+"\t비밀번호: "+pw+"\t이름: "+name);
				json.put("memCart", "<a class='nav-link' href='#' id='cart'>"+name+"'s Cart</a>");
				json.put("logoutBtn", "반갑습니다. <kbd>"+name+"</kbd>님<br>오늘도 즐거운 하루 되세요!<br><button type='submit' class='btn btn-sm btn-danger' id='logout'>로그아웃</button>");
								
			} else {
				System.out.println("로그인 실패 아이디: "+id+"\t비밀번호: "+pw+"\t이름: "+name);
				json.put("msg", "다시 시도해주세요");
					
			}
		} catch (MemberException e) {
			json.put("msg", e.getMessage());
		}
		System.out.println("json.toJSONString() : "+json.toJSONString());
		return json.toJSONString();
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
	
	@Override
	@RequestMapping(value = "/logout.camp", method= RequestMethod.POST, produces = "application/text; charset=utf8")			
	@ResponseBody
	public String logout(HttpServletRequest req, HttpServletResponse res){
			HttpSession session=req.getSession(false);
			session.invalidate();
			return "";
	}

	
}