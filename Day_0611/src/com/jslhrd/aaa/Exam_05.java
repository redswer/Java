package com.jslhrd.aaa;

class SuparE {
	int a = 10;
	int b = 20;
	
	void print() {
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}

class ChildE extends SuparE {
	int a = 100;
	// => 자식 클래스에서 부모 클래스에 있던 변수를 선언하면 부모 클래스의 변수는 쉐도우 변수(은닉 변수)가 됨 -> 값이 바뀌거나 지워지지는 않지만 자식 클래스의 변수가 우선
	int x = 100;
	int y = 200;
	
	void print() {
		System.out.println("a = " + a);
		System.out.println("a = " + super.a);
		// => super : 조상 클래스 의미  ** super() : 조상 클래스의 생성자를 의미
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
}

public class Exam_05 {

	public static void main(String[] args) {
		SuparE s = new SuparE();
		ChildE c = new ChildE();
		
		s.print();
		c.print();
	}

}
