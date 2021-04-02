package com.zafar.normal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zafar.student.pojo.StudentVo;

@org.springframework.stereotype.Controller
public class Controller {
	@Autowired
	private StudentVo studentVo;
	@GetMapping("/stud")
	@ResponseBody
	public StudentVo diplaydata()
	{
		studentVo.setId(1);
		studentVo.setName("Zafar imam");
		studentVo.setCity("new Delhi");
		studentVo.setMobileNumber("3242324");
		return studentVo;
		
	}
	

}
