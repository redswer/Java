package com.jslhrd.aaa;

public class Exam_03 {

	public static void main(String[] args) {
		// 문자열 분리(토큰 : 구분자) : split(구분자)
		String str = "123,456,789";
		
//		str = "123,456 789 123,456 789,123";
		// => 구분자는 하나만 가능
		
		String[] strArr = str.split(","); //=> split 은 배열을 return
		for (int i = 0; i < strArr.length; i++) {
			System.out.println("split " + i + " : " + strArr[i]);
		}
	}

}
