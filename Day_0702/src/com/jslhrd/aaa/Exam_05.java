package com.jslhrd.aaa;

interface CC {
	int sum(int a, int b);
}

public class Exam_05 {

	public static void main(String[] args) {
		CC cc;
		
		cc = (a, b) -> {
			int s = a + b;
			return s;
		};
//		=> cc = (a, b) -> {return a + b;};
//		=> cc = (a, b) -> a + b;
		
		System.out.println(cc.sum(4, 8));
	}

}
