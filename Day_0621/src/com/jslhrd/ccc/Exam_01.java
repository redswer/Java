package com.jslhrd.ccc;

import java.text.DecimalFormat;

public class Exam_01 {
	// 숫자 형식화 클래스

	public static void main(String[] args) {
		// 0   #   ,   .   %
		DecimalFormat df = new DecimalFormat("#,###");
		DecimalFormat df2 = new DecimalFormat("00,000");
		
		String s = df.format(123456789);
		System.out.println(s);
		
		String s2 = df2.format(1234);
		System.out.println(s2);
	}

}
