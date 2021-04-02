package com.zafar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.zafar.student.info.operation,com.zafar.student.info.helper"})
public class JsonAllOperationThrowDataBaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(JsonAllOperationThrowDataBaseApplication.class, args);
	}

}
