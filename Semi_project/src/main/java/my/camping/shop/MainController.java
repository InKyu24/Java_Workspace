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
@Controller("main")
public class MainController {
	@RequestMapping(value = "/main.camp", method = {RequestMethod.GET, RequestMethod.POST})
	public String home() {
		return "main";
	}
	
	@RequestMapping(value = "/contact.camp", method = {RequestMethod.GET, RequestMethod.POST})
	public String Contact() {
		return "main/contact";
	}
}
