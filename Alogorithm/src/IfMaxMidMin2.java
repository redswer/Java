import java.util.Scanner;

public class IfMaxMidMin2 {

	public static void main(String[] args) {
		// 정수 3개 입력 후 최대값, 중간값, 최소값 찾기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("3개의 정수 입력 : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int max, mid, min;
		
		if (a > b) {
			if (a > c) {
				max = a;
				if (b > c) {
					mid = b;
					min = c;
				} else {
					mid = c;
					min = b;
				}
			} else {
				max = c;
				mid = a;
				min = b;
			}
		} else if (b > c) {
			max = b;
			if (a > c) {
				mid = a;
				min = c;
			} else {
				mid = c;
				min = a;
			}
		} else {
			max = c;
			mid = b;
			min = a;
		}
		
		System.out.printf("%d > %d > %d", max, mid, min);
	}

}
