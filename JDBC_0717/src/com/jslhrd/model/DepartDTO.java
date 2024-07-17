package com.jslhrd.model;

public class DepartDTO {
	private int dno;
	private int count;
	private double salary_avg;
	
	private String dname;
	
	public int getDno() {
		return dno;
	}
	public void setDno(int dno) {
		this.dno = dno;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public double getSalary_avg() {
		return salary_avg;
	}
	public void setSalary_avg(double salary_avg) {
		this.salary_avg = salary_avg;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
}
