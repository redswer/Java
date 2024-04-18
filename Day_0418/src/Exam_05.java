import java.util.Scanner;

public class Exam_05 {

	public static void main(String[] args) {
		// 키보드로 정수 입력받아 80 ~ 90 이면 true 아니면 false 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int n = Integer.parseInt(sc.nextLine());
		
		boolean res = n >= 80 && n<= 90;
		
		System.out.println(res);
	}

}
