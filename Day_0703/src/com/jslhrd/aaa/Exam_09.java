package com.jslhrd.aaa;

import java.io.*;

public class Exam_09 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader(new File("src/student.txt")));
		
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		while(true) {
			String s = br.readLine();
			
			if (s == null) {
				break;
			}
			
			String[] student = s.split(",");
			
			int tot = Integer.parseInt(student[2]) + Integer.parseInt(student[3]) + Integer.parseInt(student[4]);
			double avg = tot / 3.0;
			
			System.out.print(student[0] + "\t");
			System.out.print(student[1] + "\t");
			System.out.print(student[2] + "\t");
			System.out.print(student[3] + "\t");
			System.out.print(student[4] + "\t");
			System.out.printf("%d\t%.1f\n", tot, avg);
		}
	}

}
