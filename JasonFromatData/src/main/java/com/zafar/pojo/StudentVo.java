package com.zafar.pojo;

public class StudentVo {
	private int id;
	private String name;
	private String city;
	private String deparment;
	private EmpVo empVo;
	
	public EmpVo getEmpVo() {
		return empVo;
	}
	public void setEmpVo(EmpVo empVo) {
		this.empVo = empVo;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setDeparment(String deparment) {
		this.deparment = deparment;
	}
	public StudentVo(int id, String name, String city, String deparment) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.deparment = deparment;
	}
	
	
	public StudentVo(int id, String name, String city, String deparment, EmpVo empVo) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.deparment = deparment;
		this.empVo = empVo;
	}



	@Override
	public String toString() {
		return "StudentVo [id=" + id + ", name=" + name + ", city=" + city + ", deparment=" + deparment + ", empVo="
				+ empVo + "]";
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getCity() {
		return city;
	}
	public String getDeparment() {
		return deparment;
	}
	
	
}
