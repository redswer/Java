import java.util.Scanner;

public class Exam_05 {

	public static void main(String[] args) {
		/* 키보드로 줄 수 입력받아 다음과 같이 출력
		 * [입력]
		 * 줄 수 : 5 
		 * [출력]
		 * 25 24 23 22 21 20 19 18 17
		 *    16 15 14 13 12 11 10
		 *        9  8  7  6  5
		 *           4  3  2
		 *              1
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("줄 수 : ");
		int n = sc.nextInt();
		
		int cnt = n * n;
		
		for (int i = n; i >= 1; i--) {
			for (int j = n - i; j >= 1; j--) {
				System.out.printf("%3s", "");
			}
			for (int j = i * 2 - 1; j >= 1; j--) {
				System.out.printf("%3d", cnt);
				cnt--;
			}
			System.out.println();
		}
	}

}
