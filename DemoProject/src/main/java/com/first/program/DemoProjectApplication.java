package com.first.program;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.first.StudentVo.StudentVo;

@SpringBootApplication
@ComponentScan({"com.first.StudentVo"})
public class DemoProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DemoProjectApplication.class, args);
		System.out.println("this is first spring boot project and this is demo program");
		StudentVo studentVo=context.getBean(StudentVo.class);
		System.out.println(studentVo);
	}

}
