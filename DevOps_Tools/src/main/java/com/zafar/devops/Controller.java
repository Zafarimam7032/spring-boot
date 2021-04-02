package com.zafar.devops;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zafar.pojo.StudentVo;

@RestController
public class Controller {
	@GetMapping( path="/display")
	public String  display()
	{
		StudentVo studentVo =new StudentVo();
		studentVo.setId(1);
		studentVo.setName("Zafar imam");
		studentVo.setDepartment("java");
		
		return studentVo.toString();
	}
	@GetMapping( path="/displayj")
	public StudentVo  displayj()
	{
		StudentVo studentVo =new StudentVo();
		studentVo.setId(1);
		studentVo.setName("Zafar imam");
		studentVo.setDepartment("java");
		
		return studentVo;
	}
	@GetMapping("/show")
	public void show()
	{
		System.out.println("this is show mwthod");
	}

}
