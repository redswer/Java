package com.jslhrd.bbb;

public class Student {
	private int hakbun;
	private String name;
	
	public Student() {}
	
	public Student(int hakbun, String name) {
		this.hakbun = hakbun;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return hakbun;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student s = (Student)obj;
			return hakbun == s.hakbun;
		} else {
			return false;
		}
	}

	public int getHakbun() {
		return hakbun;
	}

	public void setHakbun(int hakbun) {
		this.hakbun = hakbun;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
