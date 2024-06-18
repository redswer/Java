package com.jslhrd.aaa;

public class Exam_06 {

	public static void main(String[] args) {
		// 기본형을 문자열로
		String s = "" + 5;
		String s1 = String.valueOf(3.14);
		
		// 문자열을 기본형으로
		// => 랩퍼 클래스 : 기본자료형을 객체화
		// Integer, Long, Character, Byte, Double, Boolean, Float
		String s3 = "35";
		int a = Integer.parseInt(s3);
		int aa = Integer.valueOf(s3);
		
		double b = Double.parseDouble("3.14");
		double bb = Double.valueOf("3.14");
		
		
		s3 = Integer.toString(50); //=> toString() 을 이용하여 기본형을 문자열로 변경도 가능
	}

}
