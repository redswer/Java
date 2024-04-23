import java.util.Scanner;

public class IfMaxMin {

	public static void main(String[] args) {
		// 정수 4개 입력 후 최대값, 최소값 찾기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("4개의 정수 입력 : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		int max = a;
		int min = a;
		
		if (b > max) {
			max = b;
		} else if (min > b) {
			min = b;
		}
		
		if (c > max) {
			max = c;
		} else if (min > c) {
			min = c;
		}
		
		if (d > max) {
			max = d;
		} else if (min > d) {
			min = d;
		}
		
		System.out.printf("%d, %d, %d, %d 중 최대값은 %d, 최소값은 %d", a, b, c, d, max, min);
	}

}
