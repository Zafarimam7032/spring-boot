package com.zafar.studentvo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class StudentVo {
	@Value("zafar imam")
	private String name;
	@Value("new Delhi")
	private String city;
	@Value("93u4933993")
	private String mobile;
	@Value("java devloper")
	private String deparment;
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
	public String getDeparment() {
		return deparment;
	}
	public void setDeparment(String deparment) {
		this.deparment = deparment;
	}
	@Override
	public String toString() {
		return "StudentVo [name=" + name + ", city=" + city + ", mobile=" + mobile + ", deparment=" + deparment + "]";
	}
	

}
