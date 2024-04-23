import java.util.Scanner;

public class Exam_05 {

	public static void main(String[] args) {
		// 키보드로 이름, 국어, 영어, 수학 입력받아 이름, 총점, 평균, 학점, 판정 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 자료 : ");
		String name = sc.next();
		int kr = sc.nextInt();
		int en = sc.nextInt();
		int math = sc.nextInt();
		
		int sum = kr + en + math;
		double avg = (int) (sum / 3.0 * 100 + 0.5) / 100.0;
		char grade;
		String res;
		
		switch ((int) avg / 10) {
		case 10:
		case 9:
			grade = 'A';
			res = "PASS";
			break;
			
		case 8:
			grade = 'B';
			res = "PASS";
			break;
		
		case 7:
			grade = 'C';
			res = "PASS";
			break;
			
		case 6:
			grade = 'D';
			res = "NoPass";
			break;
			
		default:
			grade = 'F';
			res = "NoPass";
			break;
		}
		
		System.out.println("이름 : " + name);
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println("학점 : " + grade);
		System.out.println("판정 : " + res);
	}

}
