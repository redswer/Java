import java.util.Scanner;

public class Exam_04 {

	public static void main(String[] args) {
		/* 키보드로 줄 수 입력받아 다음과 같이 출력
		 * [입력]
		 * 줄 수 : 5
		 * [출력]
		 * 		         1
		 * 	          2  3  4
		 *         5  6  7  8  9
		 *     10 11 12 13 14 15 16
		 *  17 18 19 20 21 22 23 24 25
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("줄 수 : ");
		int n = sc.nextInt();
		
		int cnt = 1;
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.printf("%3s", "");
			}
			for (int j = 1; j <= i * 2 - 1; j++) {
				System.out.printf("%3d", cnt);
				cnt++;
			}
			System.out.println();
		}
	}

}
