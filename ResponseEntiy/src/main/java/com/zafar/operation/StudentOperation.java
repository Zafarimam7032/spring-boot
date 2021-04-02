package com.zafar.operation;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zafar.pojo.StudentVo;

@RestController
public class StudentOperation {
	@GetMapping(path = "/display")
	public ResponseEntity<StudentVo> display()
	{
		StudentVo studentVo=new StudentVo();
		studentVo.setId(1);
		studentVo.setName("Zafar Imam");
		studentVo.setCity("New Delhi");
		studentVo.setCollege("mrce");
		studentVo.setDepartment("java ");
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(studentVo);
	}
	

}
