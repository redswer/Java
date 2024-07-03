package com.jslhrd.aaa;

import java.util.*;
import java.io.*;

// 키보드 입력 파일 출력
/* 번호 이름 국어 영어 수학
 * 
 * */
public class Exam_07 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(new File("src/sungjuk.txt"))));
		
		pw.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		
		while(true) {
			System.out.print("입력 : ");
			String s = sc.nextLine();
			String info[] = s.split(",");
		
			String bun = info[0];
			if (bun.equals("-99")) {
				break;
			}
			String name = info[1];
			int kor = Integer.parseInt(info[2]);
			int eng = Integer.parseInt(info[3]);
			int math = Integer.parseInt(info[4]);
			int tot = kor + eng + math;
			double avg = tot / 3.0;
			
			pw.print(bun + "\t");
			pw.print(name + "\t");
			pw.print(kor + "\t");
			pw.print(eng + "\t");
			pw.print(math + "\t");
			pw.print(tot + "\t");
			pw.print(avg + "\t\n");
		}
		pw.close();
	}

}
