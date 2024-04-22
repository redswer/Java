import java.util.Scanner;

public class Exam_07 {

	public static void main(String[] args) {
		// 2개의 정수 입력 후 크기(대, 소) 비교
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int max, min;
		
		if (a > b) {
			max = a;
			min = b;
		} else {
			max = b;
			min = a;
		}
		
		System.out.println("max : " + max);
		System.out.println("min : " + min);
	}

}
