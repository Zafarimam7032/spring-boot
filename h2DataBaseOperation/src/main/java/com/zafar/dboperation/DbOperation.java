package com.zafar.dboperation;

import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zafar.coontroller.OperationProvider;
import com.zafar.coontroller.StudentVo;

@RestController
public class DbOperation {
	@Autowired
	OperationProvider operation;

	@RequestMapping(method = RequestMethod.GET, path = "/student")
	// @RequestMapping("/hizafar")
	public void insert(StudentVo studentVo) {

		System.out.println("hi this is display method");
		// System.out.println(studentVo);
		operation.save(studentVo);
	}

	@RequestMapping("/display")
	public String selectall() {
		System.out.println("this is display mthod");
		Iterable<StudentVo> all = operation.findAll();
		Iterator<StudentVo> iterator = all.iterator();
		while (iterator.hasNext()) {
			StudentVo studentVo = iterator.next();
			// System.out.println(studentVo);
			return studentVo.toString();

		}
		return "this is display method";
	}

	public String show(StudentVo studentVo) {
		return studentVo.toString();
	}

	@RequestMapping("/id")
	public String selectidivisual() {
		StudentVo studentvo = operation.findById(1).orElse(null);
		return studentvo.toString();
	}

	@RequestMapping("/del")
	public String deleteInfo(int id) {
		operation.deleteById(id);
		System.out.println("this information deleted ");
		return "student data is deleted for your passed id ";
	}
}
