import java.util.Scanner;

public class Exam_05 {

	public static void main(String[] args) {
		// 점수 (1 ~ 100 사이) 7개를 입력받아서 최대값, 최소값을 뺀 나머지 합계를 구하여 출력하는 프로그램 작성
		// for 문 이용
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 점수 : ");
		int n = sc.nextInt();
		
		int sum = n;
		int max = n;
		int min = n;
		
		for (int i = 1; i <= 6; i++) {
			n = sc.nextInt();
			sum += n;
			
			if (n > max) {
				max = n;
			} else if (n < min) {
				min = n;
			}
		}
		
		sum = sum - min - max;
		
		System.out.println("최대 점수 : " + max);
		System.out.println("최소 점수 : " + min);
		System.out.println("합계(최대-최소) : " + sum);
	}

}
