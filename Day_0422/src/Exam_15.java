import java.util.Scanner;

public class Exam_15 {

	public static void main(String[] args) {
		// 키보드로 정수 연산자, 정수 입력받아 계산기 만들기
		// 산술 연산자 이외의 연산자는 입력오류 (+, -, *, /, <<, >>)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("계산기 : ");
		int n1 = sc.nextInt();
		String c = sc.next();
		int n2 = sc.nextInt();
		
		int result = 0;
		
		if (c.equals("+")) {
			result = n1 + n2;
		} else if (c.equals("-")) {
			result = n1 - n2;
		} else if (c.equals("*")) {
			result = n1 * n2;
		} else if (c.equals("/")) {
			if (n1 != 0 && n2 != 0) {
				result = n1 / n2;				
			} else {
				System.out.println("입력오류");
				System.exit(1);
			}
		} else if (c.equals("%")) {
			if (n1 != 0 && n2 != 0) {
				result = n1 & n2;				
			} else {
				System.out.println("입력오류");
				System.exit(1);
			}
		} else if (c.equals("<<")) {
			result = n1 << n2;
		} else if (c.equals(">>")) {
			result = n1 >> n2;
		} else {
			System.out.println("입력오류");
			System.exit(1);
		}
		
		System.out.printf("%d %s %d = %d", n1, c, n2, result);
	}

}
