package com.jslhrd.aaa;

@FunctionalInterface
interface BB {
	void add(int num);
}

public class Exam_04 {

	public static void main(String[] args) {
		BB bb;
		
		bb = (num) -> {
			int cnt = 0;
			for (int i = 1; i <= num; i++) {
				cnt += i;
			}
			System.out.printf("1 ~ %d 합 : %d\n", num, cnt);
		};
		
		bb.add(5);
	}
}
