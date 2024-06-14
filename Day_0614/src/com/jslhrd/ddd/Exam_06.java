package com.jslhrd.ddd;

public class Exam_06 {

	public static void main(String[] args) {
		Cal cal = new Calculator();
		
		cal.add(10, 3);
		cal.sub(10, 3);
		cal.mul(10, 3);
		cal.div(10, 3);
		cal.rem(10, 3);
		
		Calculator calculator = new Calculator();
		calculator.add(1, 2, 3, 4, 5, 6, 8, 7, 50);
	}

}
