package com.zafar.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.zafar.cotroller,com.zafar.configuration,com.zafar.normal.controller"})
public class ConfigurationAnnotationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigurationAnnotationApplication.class, args);
	}

}
