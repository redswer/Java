package com.jslhrd.ccc;

public class Student {
	private String bun;
	private String name;
	private String gender;
	private int score;
	
	public Student() {
	}
	
	public Student(String bun, String name, String gender, int score) {
		this.bun = bun;
		this.name = name;
		this.gender = gender;
		this.score = score;
	}

	public String getBun() {
		return bun;
	}

	public void setBun(String bun) {
		this.bun = bun;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	
}
