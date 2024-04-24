import java.util.Scanner;

public class Exam_07 {

	public static void main(String[] args) {
		// 키보드로 정수 5개 입력받아 합계, 평균 구하기
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		System.out.print("정수 5개 입력 : ");
		for (int i = 1; i <= 5; i++) {
			sum += sc.nextInt();
		}
		
		double avg = sum / 5.0;
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
	}

}
