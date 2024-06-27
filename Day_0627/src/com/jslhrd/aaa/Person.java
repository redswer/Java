package com.jslhrd.aaa;

public class Person {
	private int bun;
	String name;
	int age;
	
	public Person() {}
	
	public Person(int bun, String name, int age) {
		this.bun = bun;
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int hashCode() {
		return name.hashCode() + bun;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person) {
			Person p = (Person)obj;
			return bun == p.bun && name.equals(p.name);
		} else {
			return false;
		}
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
