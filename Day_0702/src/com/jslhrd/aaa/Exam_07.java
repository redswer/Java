package com.jslhrd.aaa;

interface EE {
	int max(int[] num);
}

public class Exam_07 {

	public static void main(String[] args) {
		EE e = (num) -> {
			int max = num[0];
			
			for (int i = 0; i < num.length; i++) {
				if (max < num[i]) {
					max = num[i];
				}
			}
			
			return max;
		};
		
		int[] num = {8, 9, 45, 80, 70, 97, 42};
		System.out.println(e.max(num));
	}

}
