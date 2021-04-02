package com.zafar.webapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller
public class Controller {
	@RequestMapping("ff")
	
	public String  show()
	{
		System.out.println("this first out web application");
		return "home.jsp";
	}

}
