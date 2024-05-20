import java.util.Scanner;

public class Exam_01 {

	public static void main(String[] args) {
		/* 동별, 나이별 통계를 구하는 프로그램 작성
		 * 동은 1 ~ 10까지 10개의 동
		 * 동 코드로 0 이 입력되면 종료
		 * 
		 * [입력형식](동코드 성명 나이)
		 * 등록 : 1 홍길동 35
		 * 등록 : 3 이순신 23
		 * 		.
		 * 		.	
		 * 		.
		 * 등록 : 0 -> 입력종료
		 * 
		 * [출력형식]
		 * 동	0~9   10~19   20~29   30~39   40~49   50~59   60이상   합계
		 * 1
		 * 2
		 * 3
		 * 합계   xx     xx      xx      xx      xx      xx     xx      x
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		int arr[][] = new int[11][8]; //row(동 + 합계), col(나이 + 합계)
		
		int cnt = 0;
		
		while (true) {
			System.out.print("등록 : ");
			int row = sc.nextInt();
			
			if (row == 0) {
				break;
			}
			
			sc.next();
			int age = sc.nextInt();
			int col = age / 10;
			
			if (col > 6) {
				col = 6;
			}
			
			arr[row - 1][col]++;
			arr[row - 1][7]++;
			arr[10][col]++;
			arr[10][7]++;
		}
		
		System.out.println("동\t0~9\t10~19\t20~29\t30~39\t40~49\t50~59\t60이상\t합계");
		
		for (int i = 0; i < arr.length - 1; i++) {
			System.out.print((i + 1) + "\t");
			
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.print("합계\t");
		for (int i = 0; i < arr[0].length; i++) {
			System.out.print(arr[10][i] + "\t");
		}
	}

}
