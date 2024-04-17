import java.util.Scanner;

public class Exam_05 {

	public static void main(String[] args) {
		// 키보드로 정수 2개 입력 (+, -, *, /, %)연산
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 1 : ");
		int a = Integer.parseInt(sc.nextLine());
		System.out.print("정수 2 : ");
		int b = Integer.parseInt(sc.nextLine());
		
		System.out.printf("%d + %d = %d\n", a, b, (a + b));
		System.out.printf("%d - %d = %d\n", a, b, (a - b));
		System.out.printf("%d * %d = %d\n", a, b, (a * b));
		System.out.printf("%d / %d = %d\n", a, b, (a / b));
		System.out.print(a + " % " + b + " = " + (a % b));
	}
}
