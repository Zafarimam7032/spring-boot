package com.zafar.coontroller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.zafar.dboperation"})
public class H2DataBaseOperationApplication {

	public static void main(String[] args) {
		SpringApplication.run(H2DataBaseOperationApplication.class, args);
	}

}
