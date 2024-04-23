import java.util.Scanner;

public class IfMin {

	public static void main(String[] args) {
		// 정수 3개 입력 후 최대값 찾기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("3개의 정수 입력 : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int min = a;
		
		if (b < min) {
			min = b;
		} else if (c < min) {
			min = c;
		}
		
		System.out.printf("%d, %d, %d 중 최대값은 %d", a, b, c, min);
	}

}
