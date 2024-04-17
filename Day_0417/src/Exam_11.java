import java.util.Scanner;

public class Exam_11 {

	public static void main(String[] args) {
		// 키보드로 정수 1개를 입력받아 짝수면 true, 홀수면 false 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int n = Integer.parseInt(sc.nextLine());
		
		boolean res;
		
		if (n % 2 == 0) {
			res = true;
		} else {
			res = false;
		}
		
		System.out.println(res);
	}

}
