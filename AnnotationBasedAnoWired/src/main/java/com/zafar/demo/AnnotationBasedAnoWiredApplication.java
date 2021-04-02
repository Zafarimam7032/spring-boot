package com.zafar.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.zafar.autowired.College;

@SpringBootApplication
@ComponentScan({"com.zafar.studentvo,com.zafar.autowired"})
public class AnnotationBasedAnoWiredApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(AnnotationBasedAnoWiredApplication.class, args);
		College college=context.getBean(College.class);
		System.out.println(college);
	}

}
