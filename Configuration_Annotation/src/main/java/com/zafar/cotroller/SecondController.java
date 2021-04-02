package com.zafar.cotroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zafar.student.pojo.StudentVo;

@RestController
public class SecondController {
	@Autowired
	private StudentVo studentVo1;
	@GetMapping("/s")
	public int getprint()
	{
		return studentVo1.hashCode();
	}

}
