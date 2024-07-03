package com.jslhrd.aaa;

import java.io.*;
import java.util.*;

public class Exam_08 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(new File("src/student.txt"));
		
		System.out.println("번호\t이름\t국어\t수학\t영어\t총점\t평균");
		while(sc.hasNextLine()) {
			String student = sc.nextLine();
			String[] s = student.split(",");
			
			String bun = s[0];
			String name = s[1];
			int kor = Integer.parseInt(s[2]);
			int eng = Integer.parseInt(s[3]);
			int math = Integer.parseInt(s[4]);
			int tot = kor + eng + math;
			double avg = tot / 3.0;
			
			System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\t%.1f\n", bun, name, kor, eng, math, tot, avg);
		}
	}

}
