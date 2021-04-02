package com.zafar.student.dberation;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zafar.studennt.pojo.StudentVo;

public interface StudentdbController  extends JpaRepository<StudentVo, Integer>{

}
