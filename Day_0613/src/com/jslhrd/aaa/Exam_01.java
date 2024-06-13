package com.jslhrd.aaa;

class A {
	A() {
		System.out.println("A 생성자 호출");
	}
}

class SubA extends A {
	SubA() {
		System.out.println("SubA 생성자 호출");
	}
}

public class Exam_01 {

	public static void main(String[] args) {
		A a = new A();
		System.out.println("-----------------------------");
		SubA sa = new SubA();
	}

}
