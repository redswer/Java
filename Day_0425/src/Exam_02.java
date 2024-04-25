import java.util.Scanner;

public class Exam_02 {

	public static void main(String[] args) {
		// 키보드로 양의 점수 10개를 입력받아 합계, 평균 구하기
		/* [입력예시]
		 * 입력 : 10 0 8 -7 5 3 7 -3 0 -4 6 4 5 8 -9 8 7 -9 -5 9 9 5 7
		 * [출력예시]
		 * 합계 : xx
		 * 평균 : xx
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		int cnt = 0;
		int sum = 0;
		
		System.out.print("입력 : ");
		for (;;) {
			n = sc.nextInt();
			
			if (n > 0) {
				sum += n;
				cnt++;
			}
			
			if (cnt == 10) {
				break;
			}
		}
		
		double avg = sum / (double) cnt;
		
		System.out.println("합계 : " + sum);
		System.out.printf("평균 : %.1f", avg);
	}

}
