package com.zafar.userInfo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClassZafar {
	@RequestMapping(method = RequestMethod.GET,path = "/h")
	public String  show()
	{
		System.out.println("this is norormal method display");
		return "this is normal String method";
	}

}
