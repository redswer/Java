package com.jslhrd.bbb;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Exam_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("연도 입력 : ");
		int year = sc.nextInt();
		
		System.out.print("월 입력 : ");
		int month = sc.nextInt();
		
		System.out.println("\t\t[ " + year + "년 " + month + "월 ]");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		Calendar cal = new GregorianCalendar(year, (month - 1), 1);
		
		int maxday = cal.getActualMaximum(cal.DAY_OF_MONTH);
		int week = cal.get(cal.DAY_OF_WEEK);
		
		for (int i = 1; i < week; i++) {
			System.out.print("\t");
		}
		
		for (int i = 1; i <= maxday; i++) {
			System.out.printf("%d\t", i);
			
			if ((week - 1 + i) % 7 == 0) {
				System.out.println();
			}
		}
	}

}
