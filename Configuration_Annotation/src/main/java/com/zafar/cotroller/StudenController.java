package com.zafar.cotroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zafar.student.pojo.StudentVo;

@RestController
public class StudenController {
	@Autowired
	private StudentVo studentVo;
	@Autowired
	private StudentVo studentVo4;
	@Autowired
	private StudentVo studentVo5;
	@GetMapping("/student")
	public StudentVo getdata() {
		studentVo.setId(1);
		studentVo.setName("Zafar imam");
		studentVo.setCity("New Delhi");
		studentVo.setMobileNumber("888383");
		return studentVo;
	}
	@GetMapping("/f")
	public int getObject6()
	{
		return studentVo.hashCode();
	}
	@GetMapping("/z")
	public int getObject4()
	{
		return studentVo4.hashCode();
	}
	@GetMapping("/a")
	public int getObject9()
	{
		return studentVo5.hashCode();
	}
	
	
}
