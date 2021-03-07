package web.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import web.model.MemberDAO;
import web.util.MemberVO;
import web.util.Myexception;


@WebServlet("/main")
public class MainServlet extends HttpServlet {
	MemberDAO mDao;
	
	@Override
	public void init() throws ServletException {
		super.init();
		 try {
			mDao=new MemberDAO();
		} catch (Myexception e) {
			System.out.println(e.getMessage());
		}
	}
	
	protected void process (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
		// request로 들어오는 텍스트 인코딩 세팅
		request.setCharacterEncoding("utf-8");
		// signal을 name 값으로 받는 내용을 문자열 변수 sign으로
		String sign = request.getParameter("signal");
		
			if (sign == null) {
				throw new Myexception("요청을 구별할 수 없음");
			} else if (sign.equals("login")) {
				String id = request.getParameter("id");
				String pw = request.getParameter("pw");
				String name = mDao.login(id, pw);
				if (name != null) {
					HttpSession session=request.getSession();
					session.setAttribute("id", id);
					session.setAttribute("name", name);
					System.out.println(id+"의 세션ID: \t"+session.getId());
					
					RequestDispatcher disp = request.getRequestDispatcher("login_ok.jsp");
					// 아래 코드인 disp.forward(request, response);의 의미 파악하기!
					disp.forward(request, response);			
				} else {
					RequestDispatcher disp = request.getRequestDispatcher("login_fail.jsp");
					disp.forward(request, response);
				}
			} else if (sign.equals("memberInsert")) {
				String id = request.getParameter("id");
				String pw = request.getParameter("password");
				String name = request.getParameter("name");

				MemberVO mVo = new MemberVO(id, pw, name);
				mDao.memberInsert(mVo);
				RequestDispatcher disp = request.getRequestDispatcher("memberInsert_ok.jsp");
				disp.forward(request, response);
					
			} else if (sign.equals("memberList")) {
				List<MemberVO> list = mDao.memberList();
				request.setAttribute("list", list);
				
				RequestDispatcher disp = request.getRequestDispatcher("memberList.jsp");
				disp.forward(request, response);
				
			} else if (sign.equals("memberDelete")) {
				String id = request.getParameter("id");
				int delete = mDao.memberDelete(id);
				if (delete == 1) {
					RequestDispatcher disp = request.getRequestDispatcher("memberDelete_ok.jsp");
					disp.forward(request, response);
				} else {
					RequestDispatcher disp = request.getRequestDispatcher("memberDelete_fail.jsp");
					disp.forward(request, response);
				}
				
			} else if (sign.equals("logout")) {
				HttpSession session = request.getSession(false);
				if (session != null) {
				session.invalidate();
				RequestDispatcher disp=request.getRequestDispatcher("index.html");
				disp.forward(request, response);
				}
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