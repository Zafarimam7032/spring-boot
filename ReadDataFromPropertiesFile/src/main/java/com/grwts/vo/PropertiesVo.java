package com.grwts.vo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component

public class PropertiesVo {
	@Value("${details.emp.id}")
	private String id;
	@Value("${details.emp.name}")
	private String name;
	@Value("${details.emp.city}")
	private String city;
	public String getId() {
		return id;
	}
	public void setId(String id) {
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
	public PropertiesVo(String id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	public PropertiesVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Controller [id=" + id + ", name=" + name + ", city=" + city + "]";
	}

}
