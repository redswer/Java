import java.util.Scanner;

public class Exam_03 {
	
	static void sum(int n, int m) {
		int sum = 0;
		
		for (int i = n; i <= m; i++) {
			sum += i;
		}
		System.out.printf("%d ~ %d 까지의 합 : %d\n", n, m, sum);
	}
	
	// 메서드 오버로딩 : 메서드 이름은 같고, 매개변수의 타입, 순서, 갯수가 다른 경우 (반환타입은 관계없음)
	static void sum(int n) {
		int sum = 0;
		
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		
		System.out.printf("1 ~ %d 까지의 합 : %d", n, sum);
	}

	public static void main(String[] args) {
		// n 부터 m 까지 정수의 합을 구하여 출력
		
		sum(1, 50);
		
		System.out.print("정수 2개 입력 : ");
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		sum(n, m);
	}

}
