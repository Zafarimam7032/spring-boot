package com.zafar.operation.controller;

import org.springframework.data.repository.CrudRepository;

import com.zafar.data.pojo.StudentVOZ;

public interface UserController  extends CrudRepository<StudentVOZ, Integer>{

}
