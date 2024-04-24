import java.util.Scanner;

public class Exam_09 {

	public static void main(String[] args) {
		/* 키보드로 정수 10개를 입력받아서 합과 평균을 구하여 출력
		 * 단, 입력 자료의 1미만의 자료는 제외
		 * 
		 * [입력예시]
		 * 점수 : 1 2 0 0 3 4 5 6 7 8 9 0 0 10 11
		 * [출력예시]
		 * 합계 : 55
		 * 평균 : 5
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		System.out.print("점수 : ");
		for (int i = 1; i <= 10; i++) {
			int n = sc.nextInt();
			
			if (n < 1) {
				i--;
				continue;
			}
			
			sum += n;
		}
		
		double avg = sum / 10.0;
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
	}

}
