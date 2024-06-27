package com.jslhrd.aaa;

import java.util.*;

public class StudentExam {
	/* [입력 예시]
	 * 입력 : 1101,이학생,90,88,90
	 * 입력 : 1110,박학생,90,90,89
	 * 입력 : 1105,이학생,90,88,78
	 * 입력 : 1101,장학생,89,90,90
	 * [ 이미 등록된 학생입니다 ]
	 * 입력 : 1103,윤학생,78,89,95
	 * 입력 : 0
	 * 
	 * [출력 예시]
	 * 학번	이름	국어	영어	수학	총점	평균	판정
	 * 
	 * [처리조건]
	 * - 학번이 같으면 같은 학생
	 * - 평균은 소수 이하 첫째자리까지 출력, 90이상 : 수, 80이상 : 우, 70이상 : 미, 60이상 : 양, 60미만 : 가
	 * */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Student> set = new HashSet<>();
		
		while (true) {
			System.out.print("입력 : ");
			String student = sc.nextLine();
			
			String[] st = student.split(",");
			
			String bun = st[0];
			if (bun.equals("0")) {
				break;
			}
			
			String name = st[1];
			
			int kor = Integer.parseInt(st[2]);
			int eng = Integer.parseInt(st[3]);
			int math = Integer.parseInt(st[4]);
			
			boolean bool = set.add(new Student(bun, name, kor, eng, math));
			if (!bool) {
				System.out.println("[ 이미 등록된 학생입니다 ]");
			}
		}
		
		List<Student> list = new ArrayList<>(set);
		
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균\t판정");
		for (int i = 0; i < list.size(); i++) {
			int tot = list.get(i).getKor() + list.get(i).getEng() + list.get(i).getMath();
			double avg = tot / 3.0;
			char grade = '가';
			
			switch ((int)avg / 10) {
				case 10:
				case 9:
					grade = '수';
					break;
					
				case 8:
					grade = '우';
					break;
				
				case 7:
					grade = '미';
					break;
					
				case 6:
					grade = '양';
					break;
			}
			
			System.out.print(list.get(i).getBun() + "\t");
			System.out.print(list.get(i).getName() + "\t");
			System.out.print(list.get(i).getKor() + "\t");
			System.out.print(list.get(i).getEng() + "\t");
			System.out.print(list.get(i).getMath() + "\t");
			System.out.print(tot + "\t");
			System.out.printf("%.1f\t", avg);
			System.out.print(grade + "\n");
		}
	}

}
