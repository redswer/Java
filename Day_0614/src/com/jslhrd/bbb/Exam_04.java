package com.jslhrd.bbb;

public class Exam_04 {

	public static void main(String[] args) {
		MultiAB ab = new MultiAB();
		// => 메소드 4개 모두 호출 가능
		ab.method_01();
		ab.method_02();
		ab.method_03();
		ab.method_04();
		
		A_interface a = new MultiAB();
		// => 01, 02 만 호출 가능
		a.method_01();
		a.method_02();
//		a.method_03();
//		a.method_04();
		
		B_interface b = new MultiAB();
		// => 03, 04 만 호출 가능
//		b.method_01();
//		b.method_02();
		b.method_03();
		b.method_04();
	}

}
