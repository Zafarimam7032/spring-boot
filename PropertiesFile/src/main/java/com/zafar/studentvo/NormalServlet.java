package com.zafar.studentvo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NormalServlet {
	@RequestMapping("zafar")
	public String show()
	{
		System.out.println("this is postfix and suffex exmple");
		
		return "index";
		
	}

}
