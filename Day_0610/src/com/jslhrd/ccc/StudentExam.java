package com.jslhrd.ccc;

import java.util.Scanner;

public class StudentExam {

	public static void main(String[] args) {
		/* [입력형식]
		 * 등록 : 1103 김학생 M 90
		 * 등록 : 1103 이학생 F 85
		 * >> 이미 등록된 학생입니다
		 * 등록 : 1104 이학생 F 85
		 * 
		 * 등록 : 0000 -> 입력 종료
		 * 
		 * [출력형식]
		 * 학번		이름		성별		점수
		 * 1103		장학생	남자		90
		 * 
		 * [입력자료순 / 성적순 출력]
		 * */
		
		// 클래스 설계 시 모든 멤버변수는 private 으로 설정
		// 입력 시 남자는 M(m), 여자는 F(f)
		// 이미 등록된 학번이 있는 경우 경고 출력 후 재입력
		// 학생은 최대 10명까지만 가능
		// 입력 종료 시 출력 형식에 맞게 출력
		
		Scanner sc = new Scanner(System.in);
		Student[] st = new Student[10];
		StudentProcess stp = new StudentProcess();
		int cnt = 0;
		
		while(cnt < 10) {
			System.out.print("등록 : ");
			String bun = sc.next();
			if (bun.equals("0000")) {
				break;
			}
			
			boolean dupCheck = false;
			for (int i = 0; i < cnt; i++) {
				if (bun.equals(st[i].getBun())) {
					System.out.println(">> 이미 등록된 학생입니다");
					dupCheck = true;
					break;
				}
			}
			
			if (dupCheck) {
				continue;
			}
			
			String name = sc.next();
			String gender = sc.next();
			int score = sc.nextInt();
			
			Student student = new Student(bun, name, gender, score);
			st[cnt] = student;
			
			cnt++;
		}
		
		stp.print(st, cnt);
		System.out.println("---------------------------------------------");
		stp.sort(st, cnt);
		stp.print(st, cnt);
	}

}
