import java.util.Scanner;

public class Exam_03 {

	public static void main(String[] args) {
		// 소수 판별하기
		
		Scanner sc = new Scanner(System.in);
		
		int val = sc.nextInt();
		boolean bool = true;
		
		for (int i = 2; i < val; i++) {
			if (val % i == 0) {
				bool = false;
				break;
			}
		}
		
		if (!bool) {
			System.out.println(val + "은 소수가 아님");
		} else {
			System.out.println(val + "은 소수임");
		}
	}

}
