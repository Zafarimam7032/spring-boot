package com.zafar.cotroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zafar.student.pojo.StudentVo;

@RestController
public class ThirdController {
	@Autowired
	private StudentVo studentVo;
	@GetMapping("/t")
	public int getObject3()
	{
		return studentVo.hashCode();
	
	}

}
