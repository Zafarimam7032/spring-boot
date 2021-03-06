package com.grwts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grwts.prop.config.PropertiesConfiguration;
import com.grwts.vo.PropertiesVo;

@RestController
public class PropertiesController {
	@Autowired
	private PropertiesVo propertiesVo1;
	@Autowired
	private PropertiesConfiguration propertiesConfiguration;
	
 @GetMapping(path = "/properties")
 public PropertiesVo display()
 {
	 PropertiesVo propertiesVo=new  PropertiesVo("1A", "Zafar Imam", "New Delhi");
	 return propertiesVo;
			 
 }
 @GetMapping(path = "/properties1")
 public PropertiesVo display1()
 {
	
	 return propertiesVo1;
			 
 }
 @GetMapping(path = "/properties2")
 public PropertiesConfiguration display2()
 {
	
	 return propertiesConfiguration;
			 
 }
 @GetMapping(path = "/properties3")
 public PropertiesConfiguration display3()
 {
	
	 return propertiesConfiguration;
			 
 }
}
