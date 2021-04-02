package com.zafar.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.zafar.student.pojo.StudentVo;

@Configuration
public class StudentConfiguration {
	@Bean
	@Scope(value = "prototype")
	public StudentVo getObjectS()
	{
		return new StudentVo();
	}

}
