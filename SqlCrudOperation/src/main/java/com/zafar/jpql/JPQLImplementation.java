package com.zafar.jpql;

import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

import com.zafar.coontroller.StudentVO;
import com.zafar.coontroller.UserRepository;
@Component
public class JPQLImplementation {
	public void display(UserRepository repository)
	{
		List<StudentVO> department = repository.findByDepartment("java Software");
		Iterator< StudentVO> iterator=department.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
	}

}
