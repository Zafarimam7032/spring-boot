package com.grwts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnviromentController {
	@Autowired
	private Environment environment;
	@GetMapping("/enviroment")
	public String enviroment()
	{
		String serverport = environment.getProperty("locale.server.port");
		String jdk = environment.getProperty("Java_home");
		String maven = environment.getProperty("Maven_home");
		String path = environment.getProperty("path");
		String classpath = environment.getProperty("classpath");
		return "Server.port:"+serverport+"  jdk  :"+ jdk+ "  Maven home:"+maven  + "  path :"+path +" clash path:"+classpath;
	}

}
