package com.grwts.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grwts.pojo.StudentVo;
@RestController
public class StudentController {
	@GetMapping(path = "/display")
	public StudentVo display()
	{
		return new StudentVo(1,"Zafar imam","new Delhi","Java Devloper");
	}

}
