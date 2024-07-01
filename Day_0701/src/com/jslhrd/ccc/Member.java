package com.jslhrd.ccc;

public class Member {
	private String name;
	private String phone;
	private String gender;
	private String joindate;
	private String grade;
	private String citycode;
	
	public Member() {}
	
	public Member(String name, String phone, String gender, String joindate, String grade, String citycode) {
		this.name = name;
		this.phone = phone;
		this.gender = gender;
		this.joindate = joindate;
		this.grade = grade;
		this.citycode = citycode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getJoindate() {
		return joindate;
	}

	public void setJoindate(String joindate) {
		this.joindate = joindate;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getCitycode() {
		return citycode;
	}

	public void setCitycode(String citycode) {
		this.citycode = citycode;
	}
	
}
