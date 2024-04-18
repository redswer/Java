import java.util.Scanner;

public class Exam_10 {

	public static void main(String[] args) {
		// 3개의 정수를 입력받아 최대값 찾기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 3개 입력 : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int max = a > b ? a : b;
		max = max > c ? max : c;
		
		System.out.printf("%d, %d, %d 중 최대값은 %d\n", a, b, c, max);
		
		// 최소값 찾기
		
		int min = a < b ? a : b;
		min = min < c ? min : c;
		
		System.out.printf("%d, %d, %d 중 최소값은 %d", a, b, c, min);		
	}

}
