package com.jslhrd.aaa;

public class Exam_01 {

	public static void main(String[] args) {
		AA aa = new AA();
		
//		aa.a = 100;
		// => a 는 private 으로 선언된 변수이기 때문에 다른 클래스에서는 접근 불가
		
		aa.b = 200;
		aa.c = 300;
		aa.d = 400;
		
//		aa.printA();
		// => 메서드도 동일
		
		aa.printB();
		aa.printC();
		aa.printD();
	}

}
