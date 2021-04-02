package com.grwts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grwts.helper.StudentHelper;
import com.grwts.pojo.StudentVo;
@RestController
public class StudentController {
	@Autowired
	private StudentHelper studentHelper;
	@GetMapping(path = "/display")
	public List<StudentVo> display()
	{
		List<StudentVo> listStudentVos = studentHelper.displayALL();
		return listStudentVos;
	}

}
