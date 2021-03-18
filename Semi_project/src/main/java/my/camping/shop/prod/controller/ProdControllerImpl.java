package my.camping.shop.prod.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller("prodcontroller")
@RequestMapping("/prod")
public class ProdControllerImpl implements ProdController{
	
	@Override
	@RequestMapping (value = "/cart.camp", method= {RequestMethod.GET, RequestMethod.POST})
	public String basket () {
		
		return "prod/prodCart";
	}

}
