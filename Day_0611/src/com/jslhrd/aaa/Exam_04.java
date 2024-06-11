package com.jslhrd.aaa;

class SuparD {
	void add() {
		System.out.println("1 + 2 = " + 3);
	}
	
	void add(int a) {
		
	}
	// => 메소드 이름은 같고 매개변수의 갯수, 타입, 순서가 다른 경우 : 오버로딩
}

class ChildD extends SuparD {
	void add() {
		System.out.println("1 + 2 = " + 5);
	}
// => 부모와 자식 클래스에 이름과 매개변수가 같은 메소드가 있는 경우를 '오버라이딩'이라고 함
	
	void add(int a, int b) {
		System.out.println(a + " + " + b + " = " + (a + b));
	}
}

public class Exam_04 {

	public static void main(String[] args) {
		SuparD s = new SuparD();
		s.add();
		
		ChildD d = new ChildD();
		d.add();
		// => 오버라이딩 시 자식 클래스가 우선
	}

}
