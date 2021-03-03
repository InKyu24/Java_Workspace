package web.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web.model.MemberDAO;
import web.util.MemberVO;
import web.util.MyException;

@WebServlet("/main")
public class MainServlet extends HttpServlet {
	
	MemberDAO mDao;
	
	@Override
	public void init() throws ServletException {
		super.init();
		
		 try {
			mDao=new MemberDAO();
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}
	
	protected void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String sign = request.getParameter("sign");
		if (sign == null) {
			return;
		} else if (sign.equals("login")) {
			String id = request.getParameter("id");
			String pw = request.getParameter("pw");
			response.setContentType("text/html;charset=utf-8");
			PrintWriter out = response.getWriter();
			try {
				String name = mDao.login(id, pw);
				if (name != null) {
					out.write(name+"님 환영합니다");
				} else {
					out.write("로그인이 안되었습니다 <br> <a href='login.html'>다시 로그인하기</a> <br> <a href='login.html'>회원가입 하기</a>");
				}
			} catch (MyException e) {
				out.write(e.getMessage());
			}
			
			
		} else if (sign.equals("memberInsert")) {
			response.setContentType("text/html;charset=utf-8");
			PrintWriter out=response.getWriter();
			
			String id=request.getParameter("id");
			String pw=request.getParameter("pw");
			String name=request.getParameter("name");
			String [] all_subject=request.getParameterValues("subject");
			for(String s : all_subject) {
				
			}
			
			MemberVO m=new MemberVO(id, pw, name, all_subject);
			try {
				mDao.memberInsert(m);
				out.write("회원가입 되셨습니다 <br> <a href='login.html'>지금 로그인 하기</a> <br> <a href='index.html'>홈으로 가기</a>");
			} catch (MyException e) {
				out.write(e.getMessage());
			}			
		} else if (sign.equals("listMembers")) {			
			try {
				List<MemberVO> list = mDao.listMember();
				response.setContentType("text/html;charset=utf-8");
				PrintWriter out = response.getWriter();
				for (MemberVO m:list) {
					out.append(m.getId() + ":" + m.getPw() + ":" + m.getName() + "<br>");
				}
					out.append("<a href='index.html'>홈으로 가기</a>");
			} catch (MyException e) {
				e.printStackTrace();
				
			}
			
		}
	}
}
