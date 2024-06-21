package com.jslhrd.aaa;

import java.io.File;
import java.util.*;

class Process {
	
	static void process(String bun, String name, int[] score) {
		int max = score[0];
		int min = score[0];
		int tot = 0;
		double avg = 0;
		
		for (int i = 0; i < score.length; i++) {
			if (max < score[i]) {
				max = score[i];
			} else if (min > score[i]) {
				min = score[i];
			}
			
			tot += score[i];
		}
		
		avg = (double)tot / score.length;
		
		System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\t%d\t%d\t%d\t%d\t%.2f\n", bun, name, score[0], score[1], score[2], score[3], score[4], max, min, tot, avg);
	}
	
	void process2(String bun, String name, int[] score) {
		
	}
}

public class Exam_03 {

	public static void main(String[] args) throws Exception {
		/* src/student.txt 파일에 학생이 n 명 있고 구분자가 , 또는 ' ' 일때 학생 출력
		 * */
		
		Scanner sc = new Scanner(new File("src/student.txt"));
		StringTokenizer st = null;
		
		System.out.println("번호\t이름\t점수1\t점수2\t점수3\t점수4\t점수5\t최대값\t최소값\t총점\t평균");
		while(sc.hasNextLine()) {
			String s = sc.nextLine();
			
			st = new StringTokenizer(s, ", ");
			
			String bun = st.nextToken();
			String name = st.nextToken();
			int[] score = new int[5];
			
			for (int i = 0; i < score.length; i++) {
				score[i] = Integer.parseInt(st.nextToken());
			}
			
			Process.process(bun, name, score);
			// => static 메소드이기 때문에 객체 생성 없이 사용 가능
			
			Process pro = new Process();
			pro.process2(bun, name, score);
			// => static 이 아니면 객체 생성해야 함
		}
	}

}