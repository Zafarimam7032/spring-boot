package com.zafar.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.zafar.student.pojo,com.zafar.controller,com.zafar.configuration"})
public class HateOusApplication {

	public static void main(String[] args) {
		SpringApplication.run(HateOusApplication.class, args);
	}

}
