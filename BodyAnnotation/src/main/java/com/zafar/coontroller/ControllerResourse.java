package com.zafar.coontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zafar.student.pojo.StudentVo;

@Controller
public class ControllerResourse {
	@GetMapping("/disp")
	@ResponseBody
	public StudentVo  display()
	{
		StudentVo studentVo=new StudentVo();
		studentVo.setId(1);
		studentVo.setName("zafar imam");
		studentVo.setCity("new Delhi");
		studentVo.setMobileNumber("7032871006");
		return studentVo;
		
	}

}
