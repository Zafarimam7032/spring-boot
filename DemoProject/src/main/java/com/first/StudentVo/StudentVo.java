package com.first.StudentVo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class StudentVo {
	@Value("zafar imam")
	private String name;
	@Value("new Delhi")
	private String city;
	
	@Value("7032871006")
	private String phoneNumber;
	@Value("java Devloper")
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
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getDeparment() {
		return deparment;
	}
	public void setDeparment(String deparment) {
		this.deparment = deparment;
	}
	@Override
	public String toString() {
		return "StudentVo [name=" + name + ", city=" + city + ", phoneNumber=" + phoneNumber + ", deparment="
				+ deparment + "]";
	}
	

}
