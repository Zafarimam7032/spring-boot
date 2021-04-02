package com.zafar.devops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.zafar.pojo.StudentVo;

@SpringBootApplication
@ComponentScan({"com.zafar.pojo,com.zafar.devops"})
public class DevOpsToolsApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext run = SpringApplication.run(DevOpsToolsApplication.class, args);
	StudentVo studentVo=run.getBean(StudentVo.class);
	System.out.println(studentVo);
	studentVo.setId(1);
	studentVo.setName("Zafar imam");
	studentVo.setDepartment("java");
	
	}

}
