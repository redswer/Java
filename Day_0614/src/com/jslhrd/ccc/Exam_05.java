package com.jslhrd.ccc;

import java.util.Arrays;

public class Exam_05 {

	public static void main(String[] args) {
		MathPro mp = new MathProData();
		
		int result = mp.sum(1, 10);
		System.out.println("result = " + result);
		
		String str = mp.binaryStr(25);
		System.out.println("str = " + str);
		
		int arr[] = mp.binaryArr(25);
		System.out.println("arr = " + Arrays.toString(arr));
		
		mp.priNumber(50);
		
		mp.numberScore(5, 9, 6, 8, 3, 6, 8, 3, 9);
	}

}
