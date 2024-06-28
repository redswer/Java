package com.jslhrd.bbb;

import java.util.*;

public class ScoreExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Student, Score> map = new HashMap<>();
		
		while (true) {
			System.out.print("입력 : ");
			String studentInfo = sc.nextLine();
			String[] student = studentInfo.split(",");
			
			int bun = Integer.parseInt(student[0]);
			
			if (bun == 0) {
				break;
			}
			
			String name = student[1];
			
			if (map.containsKey(new Student(bun, name))) {
				System.out.println("이미 등록된 학생입니다.");
			} else {
				int kor = Integer.parseInt(student[2]);
				int eng = Integer.parseInt(student[3]);
				int math = Integer.parseInt(student[4]);
				
				map.put(new Student(bun, name), new Score(kor, eng, math));
			}
		}
		
		Set<Map.Entry<Student, Score>> set = map.entrySet();
		Iterator<Map.Entry<Student, Score>> iter = set.iterator();
		int tot = 0;
		
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		while (iter.hasNext()) {
			Map.Entry<Student, Score> m = iter.next();
			
			System.out.print(m.getKey().getHakbun() + "\t");
			System.out.print(m.getKey().getName() + "\t");
			System.out.print(m.getValue().getKor() + "\t");
			System.out.print(m.getValue().getEng() + "\t");
			System.out.print(m.getValue().getMath() + "\t");
			System.out.print(m.getValue().getTot() + "\t");
			System.out.printf("%.1f\n", m.getValue().getAvg());
			
			tot += m.getValue().getTot();
		}
		
		System.out.println();
		System.out.println("전체총점 : " + tot);
		System.out.println("전체평균 : " + (double)tot / (map.size() * 3));
	}

}