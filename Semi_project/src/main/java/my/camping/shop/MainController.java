package my.camping.shop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller("/main")
public class MainController {

	@RequestMapping(value = "/main.camp", method = {RequestMethod.GET, RequestMethod.POST})
	public String home() {
		return "index";
	}
}
