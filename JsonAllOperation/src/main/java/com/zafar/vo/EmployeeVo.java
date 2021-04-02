package com.zafar.vo;

public class EmployeeVo {
private int empid;
private String name;
private String companyName;
private String deparment;
private double salry;
private String city;
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCompanyName() {
	return companyName;
}
public void setCompanyName(String companyName) {
	this.companyName = companyName;
}
public String getDeparment() {
	return deparment;
}
public void setDeparment(String deparment) {
	this.deparment = deparment;
}
public double getSalry() {
	return salry;
}
public void setSalry(double salry) {
	this.salry = salry;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
@Override
public String toString() {
	return "EmployeeVo [empid=" + empid + ", name=" + name + ", companyName=" + companyName + ", deparment=" + deparment
			+ ", salry=" + salry + ", city=" + city + "]";
}


}
