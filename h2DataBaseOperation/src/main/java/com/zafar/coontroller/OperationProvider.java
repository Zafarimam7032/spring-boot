package com.zafar.coontroller;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

public interface OperationProvider extends CrudRepository<StudentVo, Integer> {

}
