package com.jslhrd.aaa;

public class Exam_04 {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.bun = 1;
		p1.name = "aaa";
		p1.age = 22;
		
		Person p2 = new Person(1, "aaa", 20);
		Person p3 = new Person(2, "aaa", 30);
		Person p4 = new Person(1, "bbb", 20);
		Person p5 = new Person(1, "aaa", 30);
		
		// 번호와 이름이 같으면 같은 객체로 판단
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
		System.out.println(p1.equals(p5));
		
		System.out.println(p1.hashCode() == p2.hashCode());
	}

}
