package com.jslhrd.ddd;

public class Exam_01 {

	public static void main(String[] args) {
		MathExam me = new SubExam();
		
		int max1  = me.max(10, 20);
		System.out.println(max1);
		
		int max2 = me.max(10, 20, 30, 40, 50);
		System.out.println(max2);
		
		int min1 = me.min(10, 20);
		System.out.println(min1);
		
		int min2 = me.min(20, 30, 50, 40);
		System.out.println(min2);
	}

}
