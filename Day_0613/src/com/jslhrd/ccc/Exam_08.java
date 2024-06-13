package com.jslhrd.ccc;

// 추상 클래스 : 미완성 클래스

abstract class A {
	int bun;
	String name;
	
	void print() {
		System.out.print(bun + "\t" + name + "\t");
	}
	
	abstract void exam();
	abstract void add(int a, int b);
	// => 추상 메소드 : 무조건 추상 클래스 안에 생성해야 함
	// => 추상 클래스를 상속받는 자식 클래스에서는 추상 메소드를 무조건 오버라이딩 해야 함
}

abstract class S {
	
}

class SubA extends A {
	@Override
	void exam() {
		
	}
	@Override
	void add(int a, int b) {
		
	}
	// => 추상 클래스를 상속받는 자식 클래스에서는 추상 메소드를 무조건 오버라이딩 해야 함
}

class SubS extends S {
	// S 클래스에 추상메소드가 없으므로 오버라이드 필요 없음
}

public class Exam_08 {

	public static void main(String[] args) {
		
	}

}
