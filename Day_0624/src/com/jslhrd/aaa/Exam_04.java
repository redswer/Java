package com.jslhrd.aaa;

import java.util.*;

class Person {
	private int bun;
	private String name;
	private String gender;
	
	Person() {
	}
	
	Person(int bun, String name, String gender) {
		this.bun = bun;
		this.name = name;
		this.gender = gender;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
}

public class Exam_04 {

	public static void main(String[] args) {
		List<Person> list = new ArrayList();
		
		Person p = new Person();
		
		p.setBun(1101);
		p.setName("김학생");
		p.setGender("M");
		
		list.add(p);
		
		p = new Person(1102, "이학생", "F");
		
		list.add(p);
		
		list.add(new Person(1103, "박학생", "M"));
		list.add(new Person(1104, "유학생", "F"));
		list.add(new Person(1105, "오학생", "M"));
		
		System.out.println(list);
		// => 주소 출력됨 : Person 클래스에서 toString() 을 오버라이딩하여 주소 대신 값이 출력되도록 할 수 있음
		
		// 출력 (기본 for 문)
		System.out.println("번호\t이름\t성별");
		for (int i = 0; i < list.size(); i++) {
			System.out.printf("%d\t%s\t%s\n", list.get(i).getBun(), list.get(i).getName(), list.get(i).getGender());
		}
		System.out.println("--------------------------------");
		
		// 출력 2 (확장 for 문)
		for(Person pp : list) {
			System.out.printf("%d\t%s\t%s\n", pp.getBun(), pp.getName(), pp.getGender());
		}
		System.out.println("--------------------------------");
		
		// 출력 3 (반복자(Iterator))
		Iterator<Person> i = list.iterator();
		
		while(i.hasNext()) {
			Person per = i.next();
			System.out.printf("%d\t%s\t%s\n", per.getBun(), per.getName(), per.getGender());
		}
	}

}
