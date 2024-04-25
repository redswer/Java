import java.util.Scanner;

public class Exam_01 {

	public static void main(String[] args) {
		// 키보드로 점수 (1~100 사이) 입력받아 합계점수, 평균점수, 최대점수, 최소점수 구하기
		// 단, 점수가 1~100 사이이면 최대값과 최소값은 합계에서 제외, -99 면 출력 후 종료
		/*
		 * [입력예시]
		 * 점수입력 : 79 0 88 90 0 67 59 0 95 68 -99
		 * [출력예시]
		 * 최대점수 : 95
		 * 최소점수 : 59
		 * 합계 : 546
		 * 평균 : 78
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수입력 : ");
		int score = sc.nextInt();
		
		int max = score;
		int min = score;
		int sum = score;
		int cnt = 1;
		
		while (score != -99) {
			score = sc.nextInt();
			
			if (score >= 1 && score <= 100) {
				sum += score;
				cnt++;
				
				if (max < score) {
					max = score;
				} else if (min > score) {
					min = score;
				}
			}
			
		}

		double avg = sum / (double) cnt;
		
		System.out.println("최대점수 : " + max);
		System.out.println("최소점수 : " + min);
		System.out.println("합계 : " + sum);
		System.out.printf("평균 : %.2f", avg);
	}

}
