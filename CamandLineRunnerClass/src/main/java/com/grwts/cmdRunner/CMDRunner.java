package com.grwts.cmdRunner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.grwts.helper.StudentHelper;
import com.grwts.pojo.StudentVo;

@Component
public class CMDRunner implements CommandLineRunner {
	@Autowired
	private StudentHelper studentHelper;

	@Override
	public void run(String... args) throws Exception {
		StudentVo studentVo = new StudentVo(1, "Zafar imam", "New Delhi", "23212");
		studentHelper.insert(studentVo);
	}

}
