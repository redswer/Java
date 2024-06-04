/* 1 입력형식 [번호 이름 점수1 점수2 점수3 점수4 점수5]
 * 		학생등록 : 7 이학생 78 90 80 90 95
 * 		학생등록 : 3 김학생 75 88 95 80 90
 * 
 * 		학생등록 : 0 -> 입력 종료 또는 10명 등록 완료 시 [출력형식] 에 맞게 출력 후 종료
 * 
 * - 모든 평균은 반올림하여 소수이하 둘째자리까지 출력
 * - 5과목의 점수 중 최대, 최소점수를 뺀 총점, 평균을 구하여 출력
 * - 순위는 총점을 기준으로 부여
 * 
 * 2 출력형식 -1 (번호순)
 * 		번호		이름		점수1		점수2		점수3		점수4		점수5		최대점수		최소점수		합계		평균		순위
 * 
 * 		과목별 합계
 * 		과목별 평균
 * 
 * 3. 출력형식 -2 (성적순)
 * */

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student[] student = new Student[10];
		int cnt = 0;
		
		for (int i = 0; i < student.length; i++) {
			System.out.print("학생등록 : ");
			int bun = sc.nextInt();
			
			if (bun == 0) {
				break;
			}
			
			String name = sc.next();
			int s1 = sc.nextInt();
			int s2 = sc.nextInt();
			int s3 = sc.nextInt();
			int s4 = sc.nextInt();
			int s5 = sc.nextInt();
			
			student[i] = new Student(bun, name, s1, s2, s3, s4, s5);
			cnt++;
		}
		
		Student s = new Student();
		StudentPro sp = new StudentPro();
		
		s.print(student, cnt);
		System.out.println();
		s.subjectPrint(student, cnt);
		System.out.println("-------------------------------------------------------------------------");
		sp.sort(student, cnt);
		s.print(student, cnt);
	}

}
