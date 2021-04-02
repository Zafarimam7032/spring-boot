package com.zafar.pojo;

public class EmpVo {
	private double salry;;
	private String deparment;
	public double getSalry() {
		return salry;
	}
	public void setSalry(double salry) {
		this.salry = salry;
	}
	public String getDeparment() {
		return deparment;
	}
	public void setDeparment(String deparment) {
		this.deparment = deparment;
	}
	public EmpVo(double salry, String deparment) {
		super();
		this.salry = salry;
		this.deparment = deparment;
	}
	

}
