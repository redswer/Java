import java.util.Scanner;

public class Exam_06 {

	public static void main(String[] args) {
		// Exam_05와 동일 (단 정수와 실수 입력받아 연산)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int a = Integer.parseInt(sc.nextLine());
		
		System.out.print("실수 : ");
		double b = Double.parseDouble(sc.nextLine());
		
		double c = (int)(a / b * 10 + 0.5) / 10.0;
		int d = a % (int) b;
		
		System.out.printf("%d + %.1f = %.1f\n", a, b, (a + b));
		System.out.printf("%d - %.1f = %.1f\n", a, b, (a - b));
		System.out.printf("%d * %.1f = %.1f\n", a, b, (a * b));
		System.out.printf("%d / %.1f = %.1f\n", a, b, c);
		System.out.println(a + " % " + (int) b + " = " + d);
	}

}
