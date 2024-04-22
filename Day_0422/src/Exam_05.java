import java.util.Scanner;

public class Exam_05 {

	public static void main(String[] args) {
		// 키보드로 정수 입력 후 80 이상이면서 95 미만이면 "Pass", 아니면 "NoPass" 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();
		
		if (n >= 80 && n < 95) {
			System.out.println("Pass");
		} else {
			System.out.println("NoPass");
		}
	}

}
