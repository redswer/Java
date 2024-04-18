import java.util.Scanner;

public class Exam_06 {

	public static void main(String[] args) {
		// 입력받은 값이 80 ~ 90 이거나 7의 배수이면 true, 아니면 false
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int n = Integer.parseInt(sc.nextLine());
		
		boolean res = (n >= 80 && n <= 90) || n % 7 == 0;
		
		System.out.println(res);
	}

}
