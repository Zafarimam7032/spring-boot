package com.zafar.student.info.operation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zafar.studennt.pojo.StudentVo;
import com.zafar.student.info.helper.StudentInfohelper;

@RestController
public class StudentInformation {
	@Autowired
	StudentInfohelper studenthelper;
	@GetMapping(path = "/select")
	public List<StudentVo> selectAll() {
		
		List<StudentVo> list = studenthelper.display();
		
		return list;
		

	}
	@PostMapping(path ="/post")
	public StudentVo insert(@RequestBody StudentVo studentVo1)
	{
		StudentVo studentVo=studenthelper.insert(studentVo1);
		return studentVo;
	}
	
	@GetMapping(path = "/select/{id}")
	public StudentVo displayById(@PathVariable int id)
	{
		StudentVo studentVo=studenthelper.selelectById(id);
		return studentVo;
	}
	@PutMapping(path = "/update/{id}/{name}")
	public String update(@PathVariable int id ,@PathVariable String name)
	{
		int id1=studenthelper.update(id,name);
		return "sucessfully updated for userid:"+id1;
	}
	@DeleteMapping(path = "/delete/{id}")
	public String delete(@PathVariable int id)
	{
		String re=studenthelper.delete(id);
		return re;
	}

}
