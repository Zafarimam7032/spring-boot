package com.zafar.student.pojo;

import org.springframework.hateoas.RepresentationModel;

public class StudentVo extends RepresentationModel<StudentVo> {
	private int id;
	private String name;
	private String city;
	private String mobile;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
}