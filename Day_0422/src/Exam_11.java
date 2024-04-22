import java.util.Scanner;

public class Exam_11 {

	public static void main(String[] args) {
		// 키보드로 7개의 정수 점수를 입력하여 평균 이상인 점수를 출력하는 프로그램
		/* [입력형식]
		 * 점수 : 90 79 80 88 67 68 65
		 * 
		 * [출력형식]
		 * 평균 : 78.1428...
		 * 평균이상 점수 : 90 79 80 88
		 * 평균이상 자료 수 : 4
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 : ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int n4 = sc.nextInt();
		int n5 = sc.nextInt();
		int n6 = sc.nextInt();
		int n7 = sc.nextInt();
		
		int sum = n1 + n2 + n3 + n4 + n5 + n6 + n7;
		double avg = sum / 7.0;
		
		int cnt = 0;
		String s = "";
		
		System.out.println("평균 : " + avg);
		
		if (n1 >= avg) {
			s += n1 + " ";
			cnt++;
		}
		if (n2 >= avg) {
			s += n2 + " ";
			cnt++;
		}
		if (n3 >= avg) {
			s += n3 + " ";
			cnt++;
		}
		if (n4 >= avg) {
			s += n4 + " ";
			cnt++;
		}
		if (n5 >= avg) {
			s += n5 + " ";
			cnt++;
		}
		if (n6 >= avg) {
			s += n6 + " ";
			cnt++;
		}
		if (n7 >= avg) {
			s += n7;
			cnt++;
		}
		
		System.out.println("평균이상 점수 : " + s);
		System.out.println("평균이상 자료 수 : " + cnt);
	}

}
