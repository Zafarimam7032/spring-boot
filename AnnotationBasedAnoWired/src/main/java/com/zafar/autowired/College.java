package com.zafar.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.zafar.studentvo.StudentVo;
@Component
public class College {
	//@Autowired
	private StudentVo studentVo;

	public StudentVo getStudentVo() {
		return studentVo;
	}
	//@Autowired
	public void setStudentVo(StudentVo studentVo) {
		this.studentVo = studentVo;
		System.out.println("inside setter method");
	}
	@Autowired
	public College(StudentVo studentVo) {
		super();
		this.studentVo = studentVo;
		System.out.println("inside the constructor");
	}
	@Override
	public String toString() {
		return "College [studentVo=" + studentVo + "]";
	}
	

}
