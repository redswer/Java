package com.jslhrd.bbb;

class AAA {
	
}

class SubAAA extends AAA {
	
}

public class Exam_07 {
	static void exam01(AAA a) {
		SubAAA sa = (SubAAA) a;
		
		System.out.println("SubAAA 로 변환 성공");
	}
	
	static void exam02(AAA a) {
		if (a instanceof SubAAA) {
			SubAAA sa = (SubAAA) a;
			System.out.println("SubAAA 로 변환 성공");
		} else {
			System.out.println("SubAAA 로 변환 불가");
		}
	}
	
	public static void main(String[] args) {
		AAA aaa = new AAA();
		
//		exam01(aaa); //=> 런타임 오류
		exam02(aaa);
	}

}
