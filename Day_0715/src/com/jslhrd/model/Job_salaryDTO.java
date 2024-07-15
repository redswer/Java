package com.jslhrd.model;

public class Job_salaryDTO {
	private String job;
	private int max_salary;
	private int min_salary;
	private int sum;
	private int avg;
	
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getMax_salary() {
		return max_salary;
	}
	public void setMax_salary(int max_salary) {
		this.max_salary = max_salary;
	}
	public int getMin_salary() {
		return min_salary;
	}
	public void setMin_salary(int min_salary) {
		this.min_salary = min_salary;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public int getAvg() {
		return avg;
	}
	public void setAvg(int avg) {
		this.avg = avg;
	}
}
