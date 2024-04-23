import java.util.Scanner;

public class IfMaxMidMin {

	public static void main(String[] args) {
		// 정수 3개 입력 후 최대값, 중간값, 최소값 찾기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("4개의 정수 입력 : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		// 교환법 이용
		
		if (a < b) {
			int t = a;
			a = b;
			b = t;
		}
		if (a < c) {
			int t = c;
			c = a;
			a = t;
		}
		if (b < c) {
			int t = c;
			c = b;
			b = t;
		}
		
		System.out.printf("%d > %d > %d", a, b, c);
	}

}
