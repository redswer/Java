package com.jslhrd.eee;

public class Exam_05 {

	public static void main(String[] args) throws Exception{
		System.out.println("1문자를 입력하세요");
		
//		char ch = (char) System.in.read();
		int ch = System.in.read() - 48;
		
		System.out.println("입력된 문자는 : " + ch);
	}

}
