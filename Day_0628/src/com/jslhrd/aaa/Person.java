package com.jslhrd.aaa;

public class Person {
	private int bun;
	private String name;
	
	public Person() {}
	
	public Person(int bun, String name) {
		this.bun = bun;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return bun + "\t" + name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person) {
			Person p = (Person)obj;
			return bun == p.bun;
		} else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return bun;
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
	
}
