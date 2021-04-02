package com.zafar.coontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zafar.pojo.EmpVo;
import com.zafar.pojo.StudentVo;

@RestController
public class StudentOperation {
	@RequestMapping(method = RequestMethod.GET, path = "/display")
	public StudentVo display() {
		return new StudentVo(1, "Zafar imam", "new Delhi", "java devloper");

	}

	@GetMapping("/show")
	public String show() {
		return new StudentVo(2, "Attef", "hyderabad", ".net Devloper").toString();
	}
	@GetMapping("/json")
	public StudentVo json()
	{
		StudentVo studentVo=new StudentVo(1,"zafar imam", "new Delhi", "java devloper", new EmpVo(1000.00d,"java devloper"));
		studentVo.setId(3);
		studentVo.setName("Shobhit");
		studentVo.setCity("Delhi");
		studentVo.setDeparment("java Devlper");
		return studentVo;
	}
}
