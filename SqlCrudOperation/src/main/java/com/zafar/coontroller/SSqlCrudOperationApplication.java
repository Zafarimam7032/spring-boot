package com.zafar.coontroller;

import java.util.Iterator;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.zafar.custom.finder.method.CustomfinderMethod;
import com.zafar.jpql.JPQLImplementation;
import com.zafar.nativequery.sql.NativeSql;
@SpringBootApplication
//@EnableJpaRepositories("com.zafar.crud.opr.UserRepository")
@ComponentScan({"com.zafar.nativequery.sql,com.zafar.custom.finder.method,com.zafar.jpql"})
public class SSqlCrudOperationApplication {
	
	public static void main(String[] args) {
ApplicationContext context = SpringApplication.run(SSqlCrudOperationApplication.class, args);
		UserRepository userrepo = context.getBean(UserRepository.class);
		CustomfinderMethod customfinderMethod=context.getBean(CustomfinderMethod.class);
		//customfinderMethod.displayByName(userrepo);
		//customfinderMethod.displayAllKindOfMethod(userrepo);
//		JPQLImplementation jpqlImplementation=context.getBean(JPQLImplementation.class);
//		jpqlImplementation.display(userrepo);
		NativeSql nativeSqlImplimentation=context.getBean(NativeSql.class);
		nativeSqlImplimentation.display(userrepo);
		
		SSqlCrudOperationApplication sqlCrudOperationApplication=context.getBean(SSqlCrudOperationApplication.class);
		//sqlCrudOperationApplication.insert(userrepo);
		//sqlCrudOperationApplication.selectAll(userrepo);
		//sqlCrudOperationApplication.selectById(userrepo);
		//sqlCrudOperationApplication.update(userrepo);
		//sqlCrudOperationApplication.delete(userrepo);
		
		
		
	}
	
	public void insert(UserRepository userrepo)
	{

		System.out.println(userrepo.hashCode());
		StudentVO  studentVO=new StudentVO();
		studentVO.setId(1);
		studentVO.setName("Zafar imam");
		studentVO.setCity("New Delhi");
		studentVO.setDepartment("java Software");
		studentVO.setSalary(1000000d);
		StudentVO save =userrepo.save(studentVO);
		System.out.println(save);
		
	}
	public void selectAll(UserRepository user )
	{
		Iterable<StudentVO> iterable = user.findAll();
		Iterator<StudentVO> iterator = iterable.iterator();
		while(iterator.hasNext())
		{
			StudentVO studentVO = iterator.next();
			System.out.println(studentVO);
		}
		
	}
	public void selectById(UserRepository userRepository)
	{
		StudentVO StudentVo = userRepository.findById(1).orElse(null);
		System.out.println(StudentVo);
		
	}
	public void update(UserRepository repository)
	{
	 StudentVO studentVO = repository.findById(9).orElse(null);
	 studentVO.setName("Ateef");
	 repository.save(studentVO);
	 System.out.println("Sucussfully Updated");
	 
	}
	public void delete(UserRepository userRepository)
	{
		userRepository.deleteById(9);
		System.out.println("Sucussfully Deleted");
	}

}
