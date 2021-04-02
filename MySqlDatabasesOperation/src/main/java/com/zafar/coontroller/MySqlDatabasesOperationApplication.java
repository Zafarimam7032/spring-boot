package com.zafar.coontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.zafar.operation.controller.UserController;

@SpringBootApplication
public class MySqlDatabasesOperationApplication {
	@Autowired
	 UserController controller;
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(MySqlDatabasesOperationApplication.class, args);
		UserController controller = context.getBean(UserController.class);
		MySqlDatabasesOperationApplication application=context.getBean(MySqlDatabasesOperationApplication.class);
	
		
//		
	}

}
