import java.util.Scanner;

public class Exam_08 {

	public static void main(String[] args) {
		// 키보드로 정수 7개 입력받아 최대값, 최소값을 구하여 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 7개 입력 : ");
		int n = sc.nextInt();
		
		int max = n;
		int min = n;
		
		for (int i = 1; i <= 6; i++) {
			n = sc.nextInt();
			
			if (n > max) {
				max = n;
			} else if (n < min) {
				min = n;
			}
		}
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}

}
