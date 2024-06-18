package com.jslhrd.aaa;

public class Person {
	private int ssn; // 주민번호
	private String name;
	private String gender;
	
	public Person() {
	}
	
	public Person(int ssn, String name, String gender) {
		this.ssn = ssn;
		this.name = name;
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		String str = "여자";
		
		if (gender.equalsIgnoreCase("m")) {
			str = "남자";
		}
		
		return ssn + "\t" + name + "\t" + str;
	}
}
