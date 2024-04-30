import java.util.Scanner;

public class Exam_03 {

	public static void main(String[] args) {
		// 키보드로 줄 수를 입력받아 '*' 정삼각형 출력
		/* [입력]
		 * 줄 수 : 5
		 * [출력]
		 * 		*
		 * 	   ***
		 * 	  *****
		 * 	 *******
		 * 	*********
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("줄 수 : ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i * 2 - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
