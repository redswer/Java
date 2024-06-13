package com.jslhrd.aaa;

class Student {
	int bun;
	String name;
	
	public Student(int bun, String name) {
		this.bun = bun;
		this.name = name;
	}
	
	void stuPrint() {
		System.out.printf("%d\t%s\t", bun, name);
	}
}

public class Exam_03 {

	public static void main(String[] args) {
		Student st = new Student(1, "김학생");
		
		st.stuPrint();
		System.out.println("\n-----------------------------");
		
		Score sc = new Score(2, "이학생", 80, 90, 70);
		
		sc.scorePrint();
		sc.scorePrint2();
		sc.stuPrint();
	}

}
