import java.util.Scanner;

public class Exam_10 {

	public static void main(String[] args) {
		/* 키보드로 10개의 점수 입력받아서 홀수의 합과 개수 출력
		 * 
		 * [입력예시]
		 * 점수 : 2 5 4 6 7 9 6 4 5 6 7 8 9
		 * [출력예시]
		 * 홀수 합 : 26
		 * 홀수 개수 : 4 
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int cnt = 0;
		
		System.out.print("점수 : ");
		for (int i = 1; i <= 10; i++) {
			int n = sc.nextInt();
			
			if (n % 2 == 1) {
				sum += n;
				cnt++;
			}
		}
		
		System.out.println("홀수 합 : " + sum);
		System.out.println("홀수 개수 : " + cnt);
	}

}
