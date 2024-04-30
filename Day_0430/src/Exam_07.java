import java.util.Scanner;

public class Exam_07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("줄 수(홀수) 입력 : ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			if (i <= n / 2) {
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
			} else {
				for (int j = n + 1 - i; j >= 1; j--) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
