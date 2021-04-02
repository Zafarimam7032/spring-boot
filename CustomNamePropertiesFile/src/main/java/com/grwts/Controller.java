package com.grwts;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@GetMapping("/help")
	public String display()
	{
		return "Hello World";
	}

}
