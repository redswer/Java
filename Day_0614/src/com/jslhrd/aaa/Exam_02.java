package com.jslhrd.aaa;

public class Exam_02 {

	public static void main(String[] args) {
		int a = 7;
		int b = 5;
		
		Process pro = new DataProcess();
		
		int result = pro.max(a, b);
		System.out.printf("%d, %d max = %d\n", a, b, result);
		
		result = pro.min(a, b);
		System.out.printf("%d, %d min = %d\n", a, b, result);
		
		result = pro.max(1, 2, 3, 4, 5);
		System.out.printf("1, 2, 3, 4, 5 max = %d\n", result);
		
		result = pro.min(1, 2, 3, 4, 5);
		System.out.printf("1, 2, 3, 4, 5 min = %d\n", result);
	}

}
