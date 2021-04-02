package com.zafar.student.info.helper;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.zafar.studennt.pojo.StudentVo;
import com.zafar.student.dberation.StudentdbController;

@Component
public class StudentInfohelper {
	@Autowired
	public StudentdbController studentdbController;
	//List<StudentVo> list=new ArrayList<StudentVo>();

	public StudentVo insert(StudentVo studentVo1) {
		StudentVo studentVo = new StudentVo();
		studentVo.setId(studentVo1.getId());
		studentVo.setName(studentVo1.getName());
		studentVo.setCity(studentVo1.getCity());
		studentVo.setCollege(studentVo1.getCollege());
		studentVo.setDeparment(studentVo1.getDeparment());

		// studentdbController.save(studentVo);
		//list.add(studentVo);
		studentdbController.save(studentVo);
		return studentVo;
	}

	public StudentVo multipleInsert() {
		StudentVo studentVo = new StudentVo();
		studentVo.setId(1);
		studentVo.setName("zafar imam");
		studentVo.setCity("new Delhi");
		studentVo.setCollege("mrce");
		studentVo.setDeparment("java devloper");
		StudentVo studentVo1 = new StudentVo();
		studentVo1.setId(2);
		studentVo1.setName("zafar imam");
		studentVo1.setCity("new Delhi");
		studentVo1.setCollege("mrce");
		studentVo1.setDeparment("java devloper");
		StudentVo studentVo2 = new StudentVo();
		studentVo2.setId(3);
		studentVo2.setName("zafar imam");
		studentVo2.setCity("new Delhi");
		studentVo2.setCollege("mrce");
		studentVo2.setDeparment("java devloper");
		StudentVo studentVo3 = new StudentVo();
		studentVo3.setId(4);
		studentVo3.setName("zafar imam");
		studentVo3.setCity("new Delhi");
		studentVo3.setCollege("mrce");
		studentVo3.setDeparment("java devloper");
		
//		list.add(studentVo);
//		list.add(studentVo1);
//		list.add(studentVo2);
//		list.add(studentVo3);
		StudentVo save = studentdbController.save(studentVo);
	return studentVo;
		
	}
	public List<StudentVo> display()
	{
		List<StudentVo> findAll = studentdbController.findAll();
		
		return findAll; 
	}
	

	public StudentVo selelectById(int id) {
		// TODO Auto-generated method stub
		StudentVo studnet = studentdbController.findById(id).orElse(null);
//		Iterator<StudentVo> iterator=list.iterator();
//		while(iterator.hasNext())
//		{
//			StudentVo studentVo=iterator.next();
//			if(studentVo.getId()==id)
//			{
//				return studentVo;
//			}
//			
//		}
		return studnet;
	}

	public int update(int id, String name) {
		// TODO Auto-generated method stub
		List<StudentVo> list2 = studentdbController.findAll();
		List<StudentVo> list1=new  ArrayList<StudentVo>();
		Iterator<StudentVo> iterator=list2.iterator();
		while(iterator.hasNext())
		{
			StudentVo studentVo=iterator.next();
			if(studentVo.getId()==id)
			{
				studentVo.setName(name);
				
				list1.add(studentVo);
				
			}
			list1.add(studentVo);
		}
		//list=list1;
		studentdbController.saveAll(list1);
		
		return id;
	}

	public String delete(int id) {
		// TODO Auto-generated method stub
		studentdbController.deleteById(id);
//		List<StudentVo> list1=new  ArrayList<StudentVo>();
//		Iterator<StudentVo> iterator=list.iterator();
//		while(iterator.hasNext())
//		{
//			StudentVo studentVo=iterator.next();
//			if(studentVo.getId()!=id)
//			{
//				
//				list1.add(studentVo);
//				
//			}
//			
//		}
//		list=list1;
	
		return "successFully deleted";
	}
}
