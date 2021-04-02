package com.zafar.coontroller;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class StudentVo {
	@Id
	@Column(name = "Student_id", length = 10 )
	private int sidl;
	@Column(name = "Student_Name", length = 20)
	private String name;
	@Column(name = "Student_City", length = 30)
	private String city;
	@Column(name = "Student_Deparment", length = 20)
	private String deparment;
	public int getSidl() {
		return sidl;
	}
	public void setSidl(int sidl) {
		this.sidl = sidl;
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
	public String getDeparment() {
		return deparment;
	}
	public void setDeparment(String deparment) {
		this.deparment = deparment;
	}
	@Override
	public String toString() {
		return "StudentVo [sidl=" + sidl + ", name=" + name + ", city=" + city + ", deparment=" + deparment + "]";
	}

}
