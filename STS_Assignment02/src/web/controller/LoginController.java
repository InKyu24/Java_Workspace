package web.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/")
public class LoginController extends HttpServlet {
	public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String sign = request.getParameter("sign");
		
		if (sign == null) {
			return;
		} else if (sign.equals("login")) {
			BufferedReader br = request.getReader();
			JSONObject jsonObject = (JSONObject) JSONValue.parse(br);
			
			String sign = (String) jsonObject.get("sign");
			String id=(String) jsonObject.get("id");
			String pw=(String) jsonObject.get("pw");
			
			JSONObject returnObject = new JSONObject ();
			returnObject.put("id", id);
			returnObject.put("pw", pw);
			
			HttpSession session = request.getSession();
			session.setAttribute("id", id);
			
			String returnString=returnObject.toJSONString();
			
			PrintWriter out=response.getWriter();
			out.append(returnString);
			
		}		
			
	}

}
