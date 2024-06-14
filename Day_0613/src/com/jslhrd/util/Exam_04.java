package com.jslhrd.util;

import java.util.Scanner;

public class Exam_04 {

	public static void main(String[] args) {
		// 키보드로 정수 n 개를 입력받아서 출력하는 NumberSort 추상 클래스를 상속받은 NumberSortExam 클래스 완성
		/* [입력예시]
		 * 정수입력 : 90 77 67 89 85 45 78 0
		 * 
		 * [출력예시]
		 * Data : 90 77 67 89 85 45 78
		 * 오름차순 : Data : 45 67 77 85 89 90 78
		 * 
		 * Data : 90 77 67 89 85 45 78
		 * 내림차순 : Data : 90 89 85 78 77 67 45
		 * 
		 * Data : 90 77 67 89 85 45 78
		 * 합계(최대-최소) : 396(531-90-45)
		 * */
		
		Scanner sc = new Scanner(System.in);
		int[] num = new int[10];
		int cnt = 0;
		
		System.out.print("정수입력 : ");
		while(cnt < num.length) {
			int n = sc.nextInt();
			
			if (n == 0) {
				break;
			} else {
				num[cnt] = n;
			}
			
			cnt++;
		}
		
		int[] copy = new int[cnt];
		for (int i = 0; i < copy.length; i++) {
			copy[i] = num[i];
		}
		
		NumberSort n = new NumberSortExam(copy);
		
		n.dataPrint();
		n.ascSort();
		System.out.println();
		n.dataPrint();
		n.descSort();
		System.out.println();
		n.dataPrint();
		System.out.println("합계(최대-최소) : " + n.maxMinTotal());
	}

}
