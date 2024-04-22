import java.util.Scanner;

public class Exam_04 {

	public static void main(String[] args) {
		// 키보드로 정수 입력 후 홀수, 짝수 판별
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수입력 : ");
		int n = sc.nextInt();
		String s;
		
		if (n < 0 || n > 100) {
			System.out.println("입력오류");
			System.exit(1); // => 프로그램 종료
		}
		
		if (n % 2 == 0) {
			s = "짝수";
		} else {
			s = "홀수";
		}
		
		System.out.printf("%d는(은) %s", n, s);
	}

}
