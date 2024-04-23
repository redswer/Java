import java.util.Scanner;

public class Exam_01 {

	public static void main(String[] args) {
		// 번호 점수1 점수2 점수3 점수4 점수5 입력
		// 최대, 최소값을 뺀 나머지 합계 구하여 출력
		/* [출력형식]
		 * 번호 : 
		 * 최대 : 
		 * 최소 : 
		 * 합계 : 
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("번호: ");
		int bun = sc.nextInt();
		System.out.print("점수 1 : ");
		int n1 = sc.nextInt();
		System.out.print("점수 2 : ");
		int n2 = sc.nextInt();
		System.out.print("점수 3 : ");
		int n3 = sc.nextInt();
		System.out.print("점수 4 : ");
		int n4 = sc.nextInt();
		System.out.print("점수 5 : ");
		int n5 = sc.nextInt();
		
		int max = n1;
		int min = n1;
		
		if (n2 > max) {
			max = n2;
		} else if (n2 < min) {
			min = n2;
		}
		
		if (n3 > max) {
			max = n3;
		} else if (n3 < min) {
			min = n3;
		}
		
		if (n4 > max) {
			max = n4;
		} else if (n4 < min) {
			min = n4;
		}
		
		if (n5 > max) {
			max = n5;
		} else if (n5 < min) {
			min = n5;
		}
		
		int sum = n1 + n2 + n3 + n4 + n5 - max - min;
		
		System.out.println("번호 : " + bun);
		System.out.println("최대 : " + max);
		System.out.println("최소 : " + min);
		System.out.println("합계 : " + sum);
	}

}
