package com.jslhrd.aaa;
import java.io.File;
import java.util.Scanner;

public class Exam_01 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(new File("src/Student.txt"));
		int cnt = 0;
		
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		while(sc.hasNextLine()) {
			String str = sc.nextLine();
			String[] info = str.split(",");
			
			String bun = info[0];
			String name = info[1];
			int kor = Integer.parseInt(info[2]);
			int eng = Integer.parseInt(info[3]);
			int math = Integer.parseInt(info[4]);
			
			cnt++;
			
			int tot = kor + eng + math;
			double avg = tot / 3.0;
			
			System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\t%.2f\n", bun, name, kor, eng, math, tot, avg);
		}
		
		System.out.println("학생수 : " + cnt);
	}

}
