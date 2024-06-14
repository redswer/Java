package com.jslhrd.eee;

class Sawon2 {
	String name;
	
	void print() throws Exception {
		if (name.equals("aaa")) {
			System.out.println("name : " + name);
		} else {				
			System.out.println("name : null");
			}
		System.out.println("이름이 null");
	}
	
	void print2() {
		if (name != null) {
			System.out.println("name : " + name);
		} else {				
			System.out.println("name : null");
		}
	}
}

public class Exam_04 {

	public static void main(String[] args) {
		Sawon2 sa = new Sawon2();
		
		try {
			sa.print();
		} catch (Exception e) {
			System.out.println("이름이 null 값");
		}
		
		sa.print2();
	}

}
