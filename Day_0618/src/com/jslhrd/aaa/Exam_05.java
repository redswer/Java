package com.jslhrd.aaa;

public class Exam_05 {

	public static void main(String[] args) {
		// 지정된 값을 문자열로 : String.valueOf()
		int a = 20;
		
		String str = a + "";
		String str2 = String.valueOf(a);
		String str3 = String.valueOf(123);
		// => 정적 메소드이기 때문에 클래스 이름(String)으로 직접 접근
		System.out.println(str);
		System.out.println(str2);
		System.out.println(str3);
		
		// 형식화된 문자열 만들기 : String.format()
		String str4 = String.format("정수 %d 실수 %.2f", 35, 12.1567);
		System.out.println(str4);
	}

}
