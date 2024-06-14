package com.jslhrd.eee;
// Exception : 예외처리

public class Exam_01 {

	public static void main(String[] args){
		System.out.println("1문자를 입력하세요");
		
		try {
			int x = System.in.read();
		} catch (Exception e) {
			System.out.println("예외가 발생");
			System.out.println(e.getMessage());
			e.printStackTrace();
			e.toString();
		} finally {
			System.out.println("종료");
		}
	}

}
