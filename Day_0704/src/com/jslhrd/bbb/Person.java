package com.jslhrd.bbb;

import java.io.Serializable;

public class Person implements Serializable{
	private int bun;
	private String name;
	private int age;
	
	public Person() {}
	
	public Person(int bun, String name, int age) {
		this.bun = bun;
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return bun + "\t" + name + "\t" + age;
	}
	
	public int getBun() {
		return bun;
	}

	public void setBun(int bun) {
		this.bun = bun;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
