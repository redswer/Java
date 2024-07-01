package com.jslhrd.aaa;

import java.io.File;
import java.util.*;

public class StudentSetExam {
	/* [출력형식]
	 * 번호	이름		국어		영어		수학		총점		평균		등급
	 * 1	김학생	88		79		90		256		85.3	B
	 * ...
	 * 
	 * 전체총점 : 		xxx		xxx		xxx
	 * 전체평균 : 		xx.x	xx.x	xx.x
	 * 
	 * [처리조건]
	 * 등급은 90 이상이면 A, 80 이상이면 B, 70 이상이면 C, 60 이상이면 D, 60 미만이면 F
	 * */
	public static void main(String[] args) throws Exception {
		Set<Student> set = new HashSet<>();
		Scanner sc = new Scanner(new File("src/data.txt"));
		
		while(sc.hasNext()) {
			String student = sc.nextLine();
			String s[] = student.split(",");
			
			String bun = s[0];
			String name = s[1];
			int kor = Integer.parseInt(s[2]);
			int eng = Integer.parseInt(s[3]);
			int math = Integer.parseInt(s[4]);
			
			set.add(new Student(bun, name, kor, eng, math));
		}
		
		int kor_tot = 0;
		int eng_tot = 0;
		int math_tot = 0;
		
		// 1. Iterator 사용하여 출력
//		Iterator<Student> iter = set.iterator();
//		while(iter.hasNext()) {...}
		
		// 2. 확장 for 문 사용하여 출력
//		for(Student stu : set) {...}
		
		// 3. List 로 변경하여 출력
		List<Student> list = new ArrayList<>(set);
		
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t등급");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getBun() + "\t");
			System.out.print(list.get(i).getName() + "\t");
			System.out.print(list.get(i).getKor() + "\t");
			System.out.print(list.get(i).getEng() + "\t");
			System.out.print(list.get(i).getMath() + "\t");
			System.out.print(list.get(i).getTot() + "\t");
			System.out.printf("%.1f\t", list.get(i).getAvg());
			System.out.print(list.get(i).getGrade() + "\n");
			
			kor_tot += list.get(i).getKor();
			eng_tot += list.get(i).getEng();
			math_tot += list.get(i).getMath();
		}
		
		System.out.println();
		System.out.printf("전체총점 :\t\t%d\t%d\t%d\n", kor_tot, eng_tot, math_tot);
		System.out.printf("전체평균 :\t\t%.1f\t%.1f\t%.1f", (double)kor_tot / list.size(), (double)eng_tot / list.size(), (double)math_tot / list.size());
	}

}
