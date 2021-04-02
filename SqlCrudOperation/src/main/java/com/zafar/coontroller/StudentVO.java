package com.zafar.coontroller;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Student_dataZ")
public class StudentVO {
	@Id
	@Column(name="Student_Id",length = 10)
	private int id;
	@Column(name = "Student_name",length = 20)
	private String name;
	@Column(name="City",length = 20)
	private String city;
	@Column(name="Department",length = 20)
	private String department;
	@Column(name = "Student_Salry",length = 20)
	private double salary;
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
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "StudentVO [id=" + id + ", name=" + name + ", city=" + city + ", department=" + department + ", salary="
				+ salary + "]";
	}
	

}
