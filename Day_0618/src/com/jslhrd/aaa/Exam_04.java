package com.jslhrd.aaa;

public class Exam_04 {

	public static void main(String[] args) {
		// 문자열 포함 유무 검사 : contains()
		String str = "Korea-Apple-JslHRD Java";
		
		boolean bool = str.contains("Apple");
		System.out.println(bool);
		
		// 문자열 대치 : replace()
		String str2 = str.replace("Korea", "Nation");
		System.out.println(str2);
		
		// 공백 제거 : trim() => 양 끝쪽만 제거 가능
		String str3 = "     Java     Program     ";
		String str4 = str3.trim();
		System.out.println(str4);
	}

}
