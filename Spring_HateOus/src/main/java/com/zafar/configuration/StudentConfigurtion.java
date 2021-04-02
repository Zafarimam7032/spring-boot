package com.zafar.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zafar.student.pojo.StudentVo;

@Configuration
public class StudentConfigurtion {
	@Bean
	public StudentVo getObject()
	{
		return new StudentVo();
	}

}
