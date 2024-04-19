import java.util.Scanner;

public class Test_02 {

	public static void main(String[] args) {
		// 키보드로 3개의 정수를 입력받아 가장 큰 값, 작은 값을 찾아서 출력하는 프로그램 작성
		// 평균은 두번째자리에서 반올림 (소수점이 없어도 반드시 출력)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 3개 입력 : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int max = a;
		max = a > b ? a : b > c ? b : c;
		
		int min = a;
		min = a < b ? a : b < c ? b : c;
		
		int sum = a + b + c;
		double avg = (int)(sum / 3.0 * 10 + 0.5) / 10.0;
		
		System.out.printf("입력 자료 : %d, %d, %d\n", a, b, c);
		System.out.printf("합계 : %d\n", sum);
		System.out.printf("평균 : %.1f\n", avg);
		System.out.printf("가장 큰 값 : %d\n", max);
		System.out.printf("가장 작은 값 : %d", min);
	}

}
