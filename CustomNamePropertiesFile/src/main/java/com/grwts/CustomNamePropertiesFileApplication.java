package com.grwts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
//@PropertySource("classpath:Configurtion.properties")
public class CustomNamePropertiesFileApplication {

	public static void main(String[] args) {
		//SpringApplication.run(CustomNamePropertiesFileApplication.class, args);
		new SpringApplicationBuilder(CustomNamePropertiesFileApplication.class)
		.properties("spring.config.name:Configurtion")
		.build()
		.run(args);
		
	}

}
