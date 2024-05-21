import java.util.Scanner;

public class Exam_12 {
	static void sum(int a) {
		int sum = 0;
		
		for (int i = 1; i <= a; i++) {
			sum += i;
		}
		
		System.out.printf("1 ~ %d 합계 : %d\n", a, sum);
	}
	
	static void osum(int a) {
		int sum = 0;
		
		for (int i = 1; i <= a; i++) {
			if (i % 2 == 1) {
				sum += i;				
			}
		}
		
		System.out.printf("1 ~ %d 홀수 합 : %d\n", a, sum);
	}
	
	static void esum(int a) {
		int sum = 0;
		
		for (int i = 1; i <= a; i++) {
			if (i % 2 == 0) {
				sum += i;				
			}
		}
		
		System.out.printf("1 ~ %d 짝수 합 : %d\n", a, sum);
	}
	
	static void isum(int a) {
		int sum = 0;
		
		for (int i = 2; i <= a; i++) {
			boolean bool = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					bool = false;
					break;
				}
			}
			if (bool) {
				sum += i;				
			}
		}
		
		System.out.printf("1 ~ %d 소수 합 : %d\n", a, sum);
	}

	public static void main(String[] args) {
		// 키보드로 [작업번호] [정수] 를 입벽받아 다음과 같이 출력되는 메서드 작성
		/* [입력예시]
		 * 작업 : 1  100
		 * 1 ~ 100 합계 : 5050
		 * 
		 * 작업 : 2  100
		 * 1 ~ 100 홀수 합 : xx
		 * 
		 * 작업 : 3  100
		 * 1 ~ 100 짝수 합 : xx
		 * 
		 * 작업 : 4  100
		 * 1 ~ 100 소수 합 : xx
		 * 
		 * 작업 : 5  100
		 * 프로그램을 종료합니다
		 * */
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			System.out.print("작업 : ");
			int num = sc.nextInt();
			int a = sc.nextInt();
			
			if (num == 5) {
				break;
			}
			
			if (num == 1) {
				sum(a);
			} else if (num == 2) {
				osum(a);
			} else if (num == 3) {
				esum(a);
			} else if (num == 4) {
				isum(a);
			} else {
				System.out.println("재입력");
				continue;
			}
		}
		
		System.out.print("프로그램을 종료합니다.");
	}

}
