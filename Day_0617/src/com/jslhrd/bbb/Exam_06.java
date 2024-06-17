package com.jslhrd.bbb;

public class Exam_06 {

	public static void main(String[] args) {
		String str1 = "Korea";
		String str2 = "Korea";
		String str3 = new String("Korea");
		
		int len = str1.length(); // => 문자열의 길이 : length()
		System.out.println(len);
		System.out.println("Korea".length());
		
		System.out.println(str1.toLowerCase()); // => 모두 소문자로 : toLowerCase()
		System.out.println(str1.toUpperCase()); // => 모두 대문자로 : toUpperCase()
		
		for (int i = 0; i < len; i++) {
			System.out.println(str1.charAt(i)); //=> 글자를 한 글자씩 추출 : charAt() => char 타입 반환
		}
		
		
		String k = str2.substring(0, 3);
		// subString(시작, 전(-1) 까지) => String 타입 반환
		// subString(시작) => 시작부터 끝까지
		System.out.println(k);
	}

}
