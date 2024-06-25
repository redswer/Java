package com.jslhrd.aaa;

public class Member {
	private String name;
	private String birth;
	private String gender;
	private int age;
	private String phone;
	
	Member() {}
	
	Member(String name, String birth, String gender, int age, String phone) {
		this.name = name;
		this.birth = birth;
		this.gender = gender;
		this.age = age;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}
