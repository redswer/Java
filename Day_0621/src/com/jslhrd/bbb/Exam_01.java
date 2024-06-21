package com.jslhrd.bbb;

import java.io.File;
import java.util.*;

public class Exam_01 {

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
			
			Student stu = new Student();
			stu.setBun(bun);
			stu.setName(name);
			stu.setScore(score);
			
			process(stu);
		}
	}
	
	static void process(Student st) {
		int max = st.getScore()[0];
		int min = st.getScore()[0];
		int tot = 0;
		double avg = 0;
		
		for (int i = 0; i < st.getScore().length; i++) {
			if (max < st.getScore()[i]) {
				max = st.getScore()[i];
			} else if (min > st.getScore()[i]) {
				min = st.getScore()[i];
			}
			
			tot += st.getScore()[i];
		}
		
		avg = (double)tot / st.getScore().length;
		
		System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\t%d\t%d\t%d\t%d\t%.2f\n", st.getBun(), st.getName(), st.getScore()[0], st.getScore()[1], st.getScore()[2], st.getScore()[3], st.getScore()[4], max, min, tot, avg);
	}

}
