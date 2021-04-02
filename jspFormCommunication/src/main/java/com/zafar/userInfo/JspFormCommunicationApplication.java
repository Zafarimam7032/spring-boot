package com.zafar.userInfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.zafar.normal,com.zafar.userInfo"})
public class JspFormCommunicationApplication {

	public static void main(String[] args) {
		SpringApplication.run(JspFormCommunicationApplication.class, args);
	}

}
