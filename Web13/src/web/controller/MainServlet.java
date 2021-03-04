package web.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sun.rmi.server.Dispatcher;
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
		try {
		
		request.setCharacterEncoding("utf-8");
		String sign = request.getParameter("sign");
		
		if (sign == null) {
			return;
		} else if (sign.equals("login")) {
			String id = request.getParameter("id");
			String pw = request.getParameter("pw");
			String name = mDao.login(id, pw);
			if (name != null) {
				RequestDispatcher disp = request.getRequestDispatcher("login_ok.jsp");
				request.setAttribute("name", name);
				disp.forward(request, response);
				
			} else {
				RequestDispatcher disp = request.getRequestDispatcher("login_fail.jsp");
				disp.forward(request, response);
			}
						
		} else if (sign.equals("memberInsert")) {
			String id=request.getParameter("id");
			String pw=request.getParameter("pw");
			String name=request.getParameter("name");
			String [] all_subject=request.getParameterValues("subject");
			for(String s : all_subject) {				
			}		
			MemberVO m=new MemberVO(id, pw, name, all_subject);

			mDao.memberInsert(m);
			RequestDispatcher disp = request.getRequestDispatcher("memberInsert_ok.jsp");
			disp.forward(request, response);		
			
		} else if (sign.equals("listMembers")) {			
			List<MemberVO> list = mDao.listMember();
				
			request.setAttribute("list", list);
			RequestDispatcher disp = request.getRequestDispatcher("listMembers_ok.jsp");
			disp.forward(request, response);

		} else if (sign.equals("memberDelete")) {
			String id = request.getParameter("id");		
			mDao.memberDelete(id);
			RequestDispatcher disp = request.getRequestDispatcher("memberDelete_ok.jsp");
			request.setAttribute("id", id);
			disp.forward(request, response);
		}
	
		} catch (MyException e) {
			RequestDispatcher disp = request.getRequestDispatcher("error.jsp");
			disp.forward(request, response);
		
		}
	
	}
}