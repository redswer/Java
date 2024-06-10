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
		StudentProcess stp = new StudentProcess();
		
		while(true) {
			System.out.println("<<콘테스트 관리 프로그램>>");
			System.out.println("[1]참가자 등록");
			System.out.println("[2]입력자료순 출력");
			System.out.println("[3]순위(성적)순 출력");
			System.out.println("[4]프로그램 종료");
			System.out.print("메뉴 선택 : ");
			
			int c = sc.nextInt();
			
			switch (c) {
			case 1:
				stp.input();
				break;
			case 2:
				stp.print();
				break;
			case 3:
				stp.sort();
				break;
			case 4:
				System.out.println("프로그램 종료");
				System.exit(0);
				break;

			default:
				break;
			}
		}
		
	}

}
