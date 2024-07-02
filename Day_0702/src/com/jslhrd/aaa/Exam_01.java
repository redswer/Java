package com.jslhrd.aaa;

/* 람다 (Lambda) : 메소드를 하나의 식으로 표현
 * => 메소드 이름, 반환타입 생략 가능
 * */

interface Test {
	public void add();
}

class TestExam implements Test {
	@Override
	public void add() {
		System.out.println("Test");
	}
}

public class Exam_01 {
	
	public static void main(String[] args) {
		// 기본 (class, 객체 생성)
		Test t = new TestExam();
		t.add();
		
//		---------------------------------------------
		// 익명구현객체
		// => 객체 생성 없이 메소드 사용
		Test tt = new Test() {
			@Override
			public void add() {
				System.out.println("Test2");
			}
		};
		tt.add();
		
//		----------------------------------------------
		// 람다식
		Test ttt =()-> System.out.println("test3");
		ttt.add();
	}

}
