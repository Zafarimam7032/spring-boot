package com.zafar.coontroller;

import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zafar.pojo.EmpVo;
import com.zafar.pojo.StudentVo;

@RestController
public class ParammerThrowValueAnnotation {
	ArrayList<StudentVo> arrayList;

	@GetMapping("/data")
	public ArrayList<StudentVo> setData() {
		StudentVo studentVo = new StudentVo(1, "zafarimam", "new Delhi", "java devloper",
				new EmpVo(1000.00d, "java devloper"));
		StudentVo studentVo1 = new StudentVo(2, "shobhit", "new Delhi", "java devloper",
				new EmpVo(1000.00d, "java devloper"));
		StudentVo studentVo2 = new StudentVo(3, "arti", "new Delhi", "java devloper",
				new EmpVo(1000.00d, "java devloper"));
		StudentVo studentVo3 = new StudentVo(4, "ashi", "new Delhi", "java devloper",
				new EmpVo(1000.00d, "java devloper"));
		StudentVo studentVo4 = new StudentVo(5, "aviral", "new Delhi", "java devloper",
				new EmpVo(1000.00d, "java devloper"));
		arrayList = new ArrayList<>();
		arrayList.add(studentVo);
		arrayList.add(studentVo1);
		arrayList.add(studentVo2);
		arrayList.add(studentVo3);
		arrayList.add(studentVo4);
		return arrayList;
	}

	@GetMapping("/stud/{sid}")
	public StudentVo selectById(@PathVariable int sid) {
		Iterator<StudentVo> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			StudentVo studentVo1 = iterator.next();
			if (studentVo1.getId() == sid) {
				return studentVo1;
			}

		}
		return null;
	}
	@GetMapping("/stud1/{sid}/{name}")
	public StudentVo selectByIdAndName(@PathVariable int sid,@PathVariable String name)
	{
		System.out.println("hi zafar ");
		Iterator<StudentVo> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			StudentVo studentVo = iterator.next();
			if (studentVo.getId() == sid&&studentVo.getName().equals(name)) {
				return studentVo;
			}

		}
		return null;	
	}
	@GetMapping(path = "/showEmp")
	public StudentVo showEmp(@RequestParam("name") String name,@RequestParam("sid") int sid)
	{
		System.out.println("thhis is show empmethod ");
		Iterator<StudentVo> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			StudentVo studentVo1 = iterator.next();
			if (studentVo1.getId() == sid&&studentVo1.getName()==name) {
				return studentVo1;
			}
		}
		return null;
	}
}
