package com.zafar.nativequery.sql;

import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

import com.zafar.coontroller.StudentVO;
import com.zafar.coontroller.UserRepository;
@Component
public class NativeSql {
public void display(UserRepository repository)
{
	Iterable<StudentVO> findAll = repository.findAll();
	Iterator<StudentVO> iterator = findAll.iterator();
	while(iterator.hasNext())
	{
		System.out.println(iterator.next());
	}
	System.out.println("================================================");
	List<StudentVO> findByCity = repository.findByCity("New Delhi");
	Iterator<StudentVO> iterator2=findByCity.iterator();
	while(iterator2.hasNext())
	{
		System.out.println(iterator2.next());
	}
	
}
}
