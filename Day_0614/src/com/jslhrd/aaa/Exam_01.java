package com.jslhrd.aaa;

// 추상 클래스 : 미완성 설계도
// 인터페이스 : 명세서, 기본설계도 : 추상 메소드로 구성

interface AA {
	
	int a = 10;
	// == static final int a = 10;
	// => 인터페이스에서는 변수는 상수 취급
	
	public abstract void test();
	public int add();
}

class SubAA implements AA {
	// => 구현 클래스 : AA 인터페이스를 구현해서 SubAA 를 작성
	
	@Override
	public void test() {
		
	}
	
	@Override
	public int add() {
		return 0;
	}
	
}

public class Exam_01 {

	public static void main(String[] args) {
//		AA a = new AA();
		// => 생성 불가
		
		AA a = new SubAA();
		SubAA aa = new SubAA();
	}

}
