import java.util.Scanner;

public class Exam_05 {

	public static void main(String[] args) {
		// 키보드로 10진수를 입력, 소수인지 판별하는 프로그램 작성
		// 단, 입력값이 1 이하이면 총 입력된 자료 수와 소수의 개수를 출력 후 프로그램 종료
		
		Scanner sc = new Scanner(System.in);
		
		int cnt = 0;
		int cnt_s = 0;
		
		while (true) {	
			System.out.print("10진수 : ");
			int n = sc.nextInt();
			
			if (n <= 1) {
				break;
			}
			
			boolean bool = true;
			
			for (int i = 2 ; i < n ; i++) {
				if (n % i == 0) {
					bool = false;
				}
			}
			
			cnt++;
			if (bool) {
				cnt_s++;
				System.out.println(n + "는 소수입니다.\n");
			} else {
				System.out.println(n + "는 소수가 아닙니다.\n");
			}
			
		}// while
		
		System.out.println("\n입력자료 건수 : " + cnt);
		System.out.println("소수자료 건수 : " + cnt_s);
		System.out.println("\n프로그램을 종료합니다.");
	}// main

}// class
