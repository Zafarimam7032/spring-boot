package com.grwts.helper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.grwts.pojo.StudentVo;
@Component
public class StudentHelper {
	private List<StudentVo> studentVos=new ArrayList<StudentVo>();
	public void  insert(StudentVo studentVo)
	{
		studentVos.add(studentVo);
	
	}
	public List<StudentVo> displayALL()
	{
		return studentVos;
	}
	

}
