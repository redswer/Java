package com.jslhrd.aaa;

class SuparC {
	private int a = 10;
	int b = 20;
	
	void exam() {
		System.out.println("SuparC.a = " + a);
		System.out.println("SuparC.b = " + b);
	}
}

class ChildC extends SuparC {
	void test() {
//		System.out.println("ChildC.a = " + a);
		// => private 은 상속 불가능
		System.out.println("ChildC.b = " + b);
	}
}

public class Exam_03 {

	public static void main(String[] args) {
		
	}

}
