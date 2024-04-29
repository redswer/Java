import java.util.Scanner;

public class Exam_10 {

	public static void main(String[] args) {
		/* 구구단 출력
		 * 키보드로 단 입력 -> 구구단 출력
		 * 
		 * 구구단 : 3
		 * 3단 출력
		 * 3 * 1 = 3
		 * 3 * 2 = 6
		 * 		.
		 * 		.
		 * 3 * 9 = 27
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("구구단 : ");
			int dan = sc.nextInt();
			
			if (dan == 0) {
				break;
			}
			
			System.out.println(dan + "단 출력");
			for (int i = 1; i <= 9; i++) {
				System.out.printf("%d * %d = %d\n", dan, i, dan * i);
			}
		}
		
		System.out.println("프로그램 종료");
	}

}
