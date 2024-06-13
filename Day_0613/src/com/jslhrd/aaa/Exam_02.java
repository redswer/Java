package com.jslhrd.aaa;

class B {
	int bun;
	String name;
	
	B(int bun, String name) {
		this.bun = bun;
		this.name = name;
	}
	
	void print() {
		System.out.println("번호 : " + bun);
		System.out.println("이름 : " + name);
	}
}

class SubB extends B {
	int age;
	
	SubB() {
		super(1, "김학생");
	}
	
//	SubB(int bun, String name, int age) {
//		this.bun = bun;
//		this.name = name;
//		this.age = age;
//	}
	// => 부모 클래스에서 default 생성자가 없으면 오류
	
	SubB(int bun, String name, int age) {
		super(bun, name); //=> 부모 클래스의 생성자 호출 (명시적 호출)
		
		this.bun = bun;
		this.name = name;
		this.age = age;
	}
	
	void print() {
		System.out.println("나이 : " + age);
	}
}

public class Exam_02 {

	public static void main(String[] args) {
		B b = new B(1, "aaa");
		
		SubB sb = new SubB();
	}

}
