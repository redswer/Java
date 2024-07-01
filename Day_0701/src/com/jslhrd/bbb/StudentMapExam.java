package com.jslhrd.bbb;

import java.io.File;
import java.util.*;

public class StudentMapExam {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(new File("src/data.txt"));
		Map<Integer, Student> map = new HashMap<>();
		
		while(sc.hasNext()) {
			String[] str = sc.nextLine().split(",");
			
			int bun = Integer.parseInt(str[0]);
			String name = str[1];
			int kor = Integer.parseInt(str[2]);
			int eng = Integer.parseInt(str[3]);
			int math = Integer.parseInt(str[4]);
			
			if (map.containsKey(bun)) {
				System.out.println("중복된 학생입니다.");
			} else {
				map.put(bun, new Student(name, kor, eng, math));
			}
		}
		
		int kor_tot = 0;
		int eng_tot = 0;
		int math_tot = 0;
		
		Set<Integer> keySet = map.keySet();
		
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t등급");
		for (Integer s : keySet) {
			System.out.print(s + "\t");
			System.out.print(map.get(s).getName() + "\t");
			System.out.print(map.get(s).getKor() + "\t");
			System.out.print(map.get(s).getEng() + "\t");
			System.out.print(map.get(s).getMath() + "\t");
			System.out.print(map.get(s).getTot() + "\t");
			System.out.printf("%.1f\t", map.get(s).getAvg());
			System.out.print(map.get(s).getGrade() + "\n");
			
			kor_tot += map.get(s).getKor();
			eng_tot += map.get(s).getEng();
			math_tot += map.get(s).getMath();
		}
		
		System.out.println();
		System.out.printf("전체총점 :\t\t%d\t%d\t%d\n", kor_tot, eng_tot, math_tot);
		System.out.printf("전체평균 :\t\t%.1f\t%.1f\t%.1f", (double)kor_tot / map.size(), (double)eng_tot / map.size(), (double)math_tot / map.size());
	}

}
