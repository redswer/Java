import java.util.Scanner;

public class Exam_04 {

	public static void main(String[] args) {
		// 계산기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		int n1 = sc.nextInt();
		String cal = sc.next();
		int n2 = sc.nextInt();
		
		switch (cal) {
		case "+":
			System.out.printf("%d %s %d = %d", n1, cal, n2, n1 + n2);
			break;
			
		case "-":
			System.out.printf("%d %s %d = %d", n1, cal, n2, n1 - n2);
			break;
			
		case "*":
			System.out.printf("%d %s %d = %d", n1, cal, n2, n1 * n2);
			break;
			
		case "/":
			if (n1 !=0 && n2 != 0) {
				System.out.printf("%d %s %d = %d", n1, cal, n2, n1 / n2);
			} else {
				System.out.println("입력오류");
			}
			break;
			
		case "%":
			if (n1 !=0 && n2 != 0) {
				System.out.printf("%d %s %d = %d", n1, cal, n2, n1 % n2);
			} else {
				System.out.println("입력오류");
			}
			break;
			
		case "<<":
			System.out.printf("%d %s %d = %d", n1, cal, n2, n1 << n2);
			break;
			
		case ">>":
			System.out.printf("%d %s %d = %d", n1, cal, n2, n1 >> n2);
			break;
		}
	}

}
