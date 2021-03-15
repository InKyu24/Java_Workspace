package my.camping.shop;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class MainController {

	@RequestMapping(value = "/main.camp", method = RequestMethod.GET)
	public String home() {
		return "main";
	}
	
	@RequestMapping (value = "member/memInsertForm.camp", method= {RequestMethod.GET, RequestMethod.POST})
	public String memJoin () {
		
		return "member/memInsertForm";
	}
	
	@RequestMapping(value = "memberInsert.camp", method= {RequestMethod.POST}, produces = "application/text; charset=utf8")		
	@ResponseBody
	public String memInsert(HttpServletRequest req, HttpServletResponse res)throws Exception{
		String id=req.getParameter("id");
		String pw=req.getParameter("pw");
		String name=req.getParameter("name");
		System.out.println("memberInsert:"+id+"\t"+pw+"\t"+name);
	
		return name;
		
	}		

}
