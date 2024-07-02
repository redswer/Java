package com.jslhrd.aaa;

// 함수적 인터페이스 : 인터페이스 안에 메소드가 하나만 있는 것
@FunctionalInterface
interface AA {
	void test();
}

public class Exam_03 {

	public static void main(String[] args) {
		AA a = ()-> {
			String str = "Hello World";
			System.out.println(str);
		};
		a.test();
		
		a =()-> {System.out.println("Hello World2");};
		a.test();
		
		a = ()-> System.out.println("Hello World3");
		a.test();
	}
	
}
