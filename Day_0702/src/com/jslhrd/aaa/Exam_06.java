package com.jslhrd.aaa;

import java.util.Scanner;

@FunctionalInterface
interface DD {
	int add(int n, int m);
}

public class Exam_06 {

	public static void main(String[] args) {
		// n ~ m 까지 합계 반환
		Scanner sc = new Scanner(System.in);
		
		DD dd = (n, m) -> {
			int cnt = 0;
			
			for (int i = n; i <= m; i++) {
				cnt += i;
			}
			
			return cnt;
		};
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		System.out.printf("%d + %d = %d", n, m, dd.add(n, m));
	}

}
