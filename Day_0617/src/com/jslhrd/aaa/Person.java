package com.jslhrd.aaa;

class Person {
	int bun;
	String name;
	int age;
	
	Person() {
	}
	
	Person(int bun, String name, int age) {
		this.bun = bun;
		this.name = name;
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person) {
			Person p = (Person)obj;
//			return bun == ((Person)obj).bun && name.equals(((Person)obj).name);
			return bun == p.bun && name.equals(p.name);
		} else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return bun;
	}
}
