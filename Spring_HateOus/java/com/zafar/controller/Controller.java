package com.zafar.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ServerProperties.Tomcat.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zafar.student.pojo.StudentVo;

@RestController
@RequestMapping(path = "/student")
public class Controller {
	private List<StudentVo> list = new ArrayList<StudentVo>();
	@Autowired
	StudentVo studentVo;

	public Controller() {
		studentVo = new StudentVo();
		studentVo.setId(1);
		studentVo.setName("Zafar Imam");
		studentVo.setCity("new Delhi");
		studentVo.setMobile("9823432");
		list.add(studentVo);
		studentVo = new StudentVo();
		studentVo.setId(2);
		studentVo.setName("Asi");
		studentVo.setCity("Delhi");
		studentVo.setMobile("9823212432");
		list.add(studentVo);
		studentVo = new StudentVo();
		studentVo.setId(13);
		studentVo.setName("Rasika");
		studentVo.setCity("Delhi");
		studentVo.setMobile("98233432");
		list.add(studentVo);
	}

	@GetMapping(path = "/all")
	public List<StudentVo> getAllStudent() {
		return list;
	}

	@GetMapping(path = "/all/{id}")
	public StudentVo getStudentById(@PathVariable("id") int id) {
		Iterator<StudentVo> iterator = list.iterator();
		if(iterator.hasNext())
		{
		while (iterator.hasNext()) {
			StudentVo next = iterator.next();
			if (next.getId() == id) {
				return next;
			}

		}
		
		}
		else
		{
		
		}
	
		return null;
	}

}
