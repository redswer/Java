package com.jslhrd.ccc;

abstract class SuperA {
	void add() {
		System.out.println("1 ~ 5 합 : 15");
	}
	
	abstract void add(int a, int b);
	abstract void mul(int a, int b);
}

class ChildA extends SuperA {
	@Override
	void add(int a, int b) {
		int result = a + b;
		System.out.println(a + " + " + b + " = " + result);
	}
	
	@Override
	void mul(int a, int b) {
		int result = a * b;
		System.out.println(a + " * " + b + " = " + result);
	}
}

class ChildB extends SuperA {
	@Override
	void add(int a, int b) {
		
	}
	
	@Override
	void mul(int a, int b) {
		
	}
}

class ChildC extends SuperA {
	@Override
	void add(int a, int b) {
		
	}
	
	@Override
	void mul(int a, int b) {
		
	}
}

public class Exam_09 {

	public static void main(String[] args) {
//		SuperA sa = new SuperA();
		// => 추상 클래스는 객체 생성이 불가능
		
		SuperA a1 = new ChildA();
		
		a1.add(20, 14);
		a1.mul(12, 75);
	}

}
