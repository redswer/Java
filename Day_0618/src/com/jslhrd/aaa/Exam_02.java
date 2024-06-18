package com.jslhrd.aaa;

public class Exam_02 {

	public static void main(String[] args) {
		String str = "";
		for (int i = 1; i <= 5; i++) {
			str += i;
		}
		System.out.println("str : " + str);
		
		// 문자열 결합 : concat()
		String str2 = "12345";
		String str3 = str2.concat(":54321");
		System.out.println("str3 : " + str3);
		
		String str4 = "";
		for (int i = 1; i <= 5; i++) {
			str4 = str4.concat("" + i);
		}
		System.out.println("str4 : " + str4);
	}

}
