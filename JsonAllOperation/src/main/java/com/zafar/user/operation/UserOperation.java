package com.zafar.user.operation;

import java.util.Iterator;
import java.util.List;

import org.springframework.scheduling.annotation.AbstractAsyncConfiguration;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zafar.control.JsonAllOperationApplication;
import com.zafar.helper.ControllerHelper;
import com.zafar.vo.EmployeeVo;

@RestController
public class UserOperation {
	ControllerHelper controllerHelper = new ControllerHelper();

	@GetMapping(path = "/display")
	public List<EmployeeVo> display() {
		System.out.println("hi this is zafar imam");
		try {
			List<EmployeeVo> employeeVos = controllerHelper.dataInseart();
			return employeeVos;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	@PostMapping(path = "/post")
	public EmployeeVo insert(@RequestBody EmployeeVo employeeVo) {

		EmployeeVo employeeVo1 = controllerHelper.inseart(employeeVo);
		return employeeVo1;
	}

	@DeleteMapping(path = "/del/{empid}")
	public String delete(@PathVariable int empid) {
		System.out.println(empid);
		int id1 = controllerHelper.delete(empid);
		return "data is deleted for user id:" + id1;
	}

	@PutMapping("/update/{empid}/{name}")
	public String update(@PathVariable int empid, @PathVariable String name) {
		controllerHelper.dataUpdate(name, empid);
		return "data is  updated";
	}
}
