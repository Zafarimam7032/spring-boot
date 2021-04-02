package com.zafar.control;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.zafar.user.operation"})
public class JsonAllOperationApplication {
	protected ConfigurableApplicationContext context;

	public static void main(String[] args) {
		ConfigurableApplicationContext context1 = SpringApplication.run(JsonAllOperationApplication.class, args);
		JsonAllOperationApplication jsonAllOperationApplication = context1.getBean(JsonAllOperationApplication.class);
		jsonAllOperationApplication.ConfigureObjectPassed(context1);
	}

	private void ConfigureObjectPassed(ConfigurableApplicationContext configurableApplicationContext) {
		context = configurableApplicationContext;
	}
}
