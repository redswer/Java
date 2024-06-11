package com.jslhrd.aaa;

class SuparA {
	int a = 10;
	
	void exam() {
		System.out.println("SupaA.a = " + a);
	}
}

class ChildA extends SuparA{
	int b = 20;
	
	void test() {
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}

public class Exam_01 {

	public static void main(String[] args) {
		SuparA supar = new SuparA();
		ChildA child = new ChildA();
		
		System.out.println(child.a);
		
		supar.exam();
		child.exam();
		child.test();
	}

}
