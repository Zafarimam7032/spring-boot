package com.zafar.helper;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.zafar.vo.EmployeeVo;

public class ControllerHelper  {
	List<EmployeeVo> employeeVos=new ArrayList<EmployeeVo>();
	public List<EmployeeVo> dataInseart()
	{
		EmployeeVo employeeVo=new EmployeeVo();
		employeeVo.setEmpid(1);
		employeeVo.setName("Zafar Imam");
		employeeVo.setCity("New Delhi");
		employeeVo.setCompanyName("greatWits");
		employeeVo.setDeparment("java Devloper");
		employeeVo.setSalry(1000000d);
		EmployeeVo employeeVo1=new EmployeeVo();
		employeeVo1.setEmpid(2);
		employeeVo1.setName("Zafar Imam");
		employeeVo1.setCity("New Delhi");
		employeeVo1.setCompanyName("greatWits");
		employeeVo1.setDeparment("java Devloper");
		employeeVo1.setSalry(1000000d);
		EmployeeVo employeeVo2=new EmployeeVo();
		employeeVo2.setEmpid(3);
		employeeVo2.setName("Zafar Imam");
		employeeVo2.setCity("New Delhi");
		employeeVo2.setCompanyName("greatWits");
		employeeVo2.setDeparment("java Devloper");
		employeeVo2.setSalry(1000000d);
		EmployeeVo employeeVo3=new EmployeeVo();
		employeeVo3.setEmpid(4);
		employeeVo3.setName("Zafar Imam");
		employeeVo3.setCity("New Delhi");
		employeeVo3.setCompanyName("greatWits");
		employeeVo3.setDeparment("java Devloper");
		employeeVo3.setSalry(1000000d);
		EmployeeVo employeeVo4=new EmployeeVo();
		employeeVo4.setEmpid(5);
		employeeVo4.setName("Zafar Imam");
		employeeVo4.setCity("New Delhi");
		employeeVo4.setCompanyName("greatWits");
		employeeVo4.setDeparment("java Devloper");
		employeeVo4.setSalry(1000000d);
		

		employeeVos.add(employeeVo);
		employeeVos.add(employeeVo1);
		employeeVos.add(employeeVo2);
		employeeVos.add(employeeVo3);
		employeeVos.add(employeeVo4);
		return employeeVos;
	}
	public EmployeeVo inseart(EmployeeVo employeeVo1)
	{
	EmployeeVo employeeVo=new EmployeeVo();
		employeeVo.setEmpid(employeeVo1.getEmpid());
		employeeVo.setName(employeeVo1.getName());
		employeeVo.setCity(employeeVo1.getCity());
		employeeVo.setCompanyName(employeeVo1.getCompanyName());
		employeeVo.setDeparment(employeeVo1.getDeparment());
		employeeVo.setSalry(employeeVo1.getSalry());
		employeeVos.add(employeeVo);
		return employeeVo;
		
	}
	public int delete(int id) {
	String name;
	Iterator<EmployeeVo> iterator=employeeVos.iterator();
	List<EmployeeVo> emList=new ArrayList<EmployeeVo>();
	while(iterator.hasNext())
	{
		EmployeeVo employeeVo=iterator.next();
		if(employeeVo.getEmpid()!=id)
		{
			emList.add(employeeVo);
		}
		else
		{
			
		}
				
		
	}
	employeeVos=emList;
		return id;
	}
	public void dataUpdate(String name,int id) {
		// TODO Auto-generated method stub
		Iterator<EmployeeVo> empIterator=employeeVos.iterator();
		List<EmployeeVo> employeeVos1=new ArrayList<EmployeeVo>();
		while(empIterator.hasNext())
		{
			EmployeeVo employeeVo=empIterator.next();
			if(employeeVo.getEmpid()==id)
			{
				employeeVo.setName(name);
				employeeVos1.add(employeeVo);
			}
			employeeVos1.add(employeeVo);
			
		}
		employeeVos=employeeVos1;
		
	}

}
