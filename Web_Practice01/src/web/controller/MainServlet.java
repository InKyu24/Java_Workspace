package web.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web.model.MemberDAO;
import web.util.Myexception;


@WebServlet("/main")
public class MainServlet extends HttpServlet {
	MemberDAO mDao;
	
	protected void process (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
		// request로 들어오는 텍스트 인코딩 세팅
		request.setCharacterEncoding("utf-8");
		// signal을 name 값으로 받는 내용을 문자열 변수 sign으로
		String sign = request.getParameter("signal");
		
			if (sign == null) {
				System.out.println("sign == null");
			} else if (sign.equals("login")) {
				String id = request.getParameter("ID");
				String pw = request.getParameter("PW");
				String name = mDao.login(id, pw);
				
				RequestDispatcher disp = request.getRequestDispatcher("login_ok.jsp");
				// 아래 코드인 disp.forward(request, response);의 의미 파악하기!
				disp.forward(request, response);
			} else {
				RequestDispatcher disp = request.getRequestDispatcher("login_fail.jsp");
				disp.forward(request, response);
			}
			
		} catch (Myexception e) {
				
		}
		
	}//END process()
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process (request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process (request, response);
	}

}