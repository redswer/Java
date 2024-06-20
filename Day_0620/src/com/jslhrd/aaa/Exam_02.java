package com.jslhrd.aaa;

import java.io.File;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Exam_02 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(new File("src/Student.txt"));
		int cnt = 0;
		
		int k_tot = 0;
		int e_tot = 0;
		int m_tot = 0;
		
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t등급");
		while(sc.hasNextLine()) {
			String str = sc.nextLine();
			
			StringTokenizer st = new StringTokenizer(str, ",");
			
			String bun = st.nextToken();
			String name = st.nextToken();
			int kor = Integer.parseInt(st.nextToken());
			int eng = Integer.parseInt(st.nextToken());
			int math = Integer.parseInt(st.nextToken());
			
			k_tot += kor;
			e_tot += eng;
			m_tot += math;
			
			int tot = kor + eng + math;
			double avg = tot / 3.0;
			char grade = 'F';
			
			switch ((int)avg / 10) {
			case 10:
			case 9:	
				grade = 'A';
				break;
			case 8:
				grade = 'B';
				break;
			case 7:
				grade = 'C';
				break;
			case 6:
				grade = 'D';
				break;
			}
			
			cnt++;
			
			System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\t%.1f\t%s\n", bun, name, kor, eng, math, tot, avg, grade);
		}
		
		double tot_avg = (k_tot + e_tot + m_tot) / (double)(cnt * 3);
		
		System.out.printf("전체 : \t%d명\t%d\t%d\t%d\t%d\t%.2f\n", cnt, k_tot, e_tot, m_tot, (k_tot + e_tot + m_tot), tot_avg);
	}

}
