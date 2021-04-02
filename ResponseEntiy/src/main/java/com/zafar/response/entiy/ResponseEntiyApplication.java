package com.zafar.response.entiy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.zafar.pojo,com.zafar.operation.helper,com.zafar.operation"})
public class ResponseEntiyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResponseEntiyApplication.class, args);
	}

}
