package com.zafar.control;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.zafar.file.helper,com.zafar.file.controller "})
public class FileOperatinApplication {

	public static void main(String[] args) {
		SpringApplication.run(FileOperatinApplication.class, args);
	}

}
