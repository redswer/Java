package com.jslhrd.eee;

class Sawon {
	String name;
	
	void print() {
		try {
			if (name.equals("aaa")) {
				System.out.println("name : " + name);
			} else {
				System.out.println("name : null");
			}
		} catch (Exception e) {
			System.out.println("이름이 null");
		}
	}
}

public class Exam_03 {

	public static void main(String[] args) {
		Sawon sa = new Sawon();
		
		sa.print();
	}

}
