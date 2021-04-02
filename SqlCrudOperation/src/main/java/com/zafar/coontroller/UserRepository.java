package com.zafar.coontroller;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
@Component
public interface UserRepository extends CrudRepository<StudentVO,Integer> {
	public List<StudentVO> findByName(String name);
	@Query(value = "select * from student_dataz where city=:c",nativeQuery = true)
	public List<StudentVO> findByCity( @Param("c") String city );
	public List<StudentVO> findByIdAndName(int id,String name);
	public List<StudentVO> findByIdLessThan(int id);
	public List<StudentVO> findByIdLessThanEqual(int id);
	@Query("from StudentVO where department=:city")
	public List<StudentVO> findByDepartment(@Param("city") String deparment);
	
	
	

}
