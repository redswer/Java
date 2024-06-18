package com.jslhrd.aaa;

public class Exam_01 {

	public static void main(String[] args) {
		String str = "Korea-Daejeon-JSKHRD";
		
		// 문자열 길이 : length()
		int size = str.length();
		System.out.println("문자열 길이 : " + size);
		
		// 문자열 위치 : indexOf()
		System.out.println("D 문자의 위치 : " + str.indexOf('D'));
		System.out.println("JSK 문자열 위치 : " + str.indexOf("JSK"));
		System.out.println("JSK 문자열 위치 : " + str.indexOf("JSL")); //=> 문자열이 없으면 -1 반환
		System.out.println("a 문자의 위치 : " + str.indexOf('a')); //=> 첫 번째 a 만 검색
		System.out.println("a 문자의 위치 : " + str.indexOf('a', 5)); //=> 5 번째 이후부터 a 검색
		
	}

}
