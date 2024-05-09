import java.util.Scanner;

public class Exam_04 {

	public static void main(String[] args) {
		/* 키보드로 7개의 정수점수를 입력받아 최대, 최소, 합계, 평균, 등급을 구하여 출력하는 프로그램 작성
		 * [처리조건]
		 * 합계는 전체 합계에서 최대값, 최소값을 뺀 합계
		 * 평균은 소수 이하 셋째자리에서 반올림하여 둘째자리까지 출력
		 * 등급은 평균이 100 ~ 87 이면 A, 86 ~ 75 면 B, 74 ~ 60 이면 C, 59 이하면 D
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		// 1. 전체 점수 출력 x (배열에 저장 x)
		int sum = 0;
		int max = 0;
		int min = 100;
		
		for (int i = 0; i < 7; i++) {
			System.out.printf("점수 %d : ", i + 1);
			int score = sc.nextInt();
			
			sum += score;
			
			if (score > max) {
				max = score;
			} else if (score < min) {
				min = score;
			}
		}
		
		sum = sum - max - min;
		char grade = 'D';
		double avg = (int)(sum / 5.0 * 100 + 0.5) / 100.0;
		
		if (avg >= 87) {
			grade = 'A';
		} else if (avg >= 75) {
			grade = 'B';
		} else if (avg >= 60) {
			grade = 'C';
		}
		
		System.out.println();
		System.out.println("최대점수 : " + max);
		System.out.println("최소점수 : " + min);
		System.out.println("합계점수 : " + sum);
		System.out.println("평균점수 : " + avg);
		System.out.println("등급코드 : " + grade);
		
	}

}
